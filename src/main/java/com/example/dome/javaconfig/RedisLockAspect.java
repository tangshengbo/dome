package com.example.dome.javaconfig;


import com.example.dome.lock.RedisLock;
import com.example.dome.lock.RedisUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


@Component
@Aspect
public class RedisLockAspect {

    private static Logger logger = LoggerFactory.getLogger(RedisLockAspect.class);

    @Autowired
    private RedissonClient redissonClient;

    @Around("@annotation(com.example.dome.lock.RedisLock)")
    public Object lock(ProceedingJoinPoint point) throws Throwable {
        RLock lock = null;
        Object object = null;
        String lockKey = null;
        logger.info("into RedisLockAspect!");
        try {
            RedisLock redisLock = getDistRedisLockInfo(point);
            assert redisLock != null;
            lockKey = RedisUtils.getLockKey(point, redisLock.lockKey());
            lock = RedisUtils.getRLock(redissonClient, lockKey);
            if (lock != null) {
//                logger.warn("isHeldByCurrentThread　begin {}", lock.isHeldByCurrentThread());
//                lock.lock(redisLock.keepMills(), TimeUnit.MILLISECONDS);
//                lock.lock();
                if (lock.tryLock()) {
                    logger.warn("获得Redis锁 {} {}", lockKey, Thread.currentThread().getName());
                    lock.lock();
                    object = point.proceed();
                }
//                if (lock.tryLock(redisLock.maxSleepMills(), redisLock.keepMills(), TimeUnit.MILLISECONDS)) {
//                    logger.warn("获得Redis锁 {} {}", lockKey, Thread.currentThread().getName());
//                    object = point.proceed();
//                }
            }
        } finally {
            if (lock != null) {
//                logger.warn("isHeldByCurrentThread end {}", lock.isHeldByCurrentThread());
                if (lock.isHeldByCurrentThread()) {
                    lock.unlock();
                    lock.unlock();
                    logger.warn("释放Redis锁 {} {}", lockKey, Thread.currentThread().getName());
                } else {
                    logger.warn("任务已启动 请勿重复执行 {}", lock.isHeldByCurrentThread());
                }
            }
        }
        return object;
    }

    private RedisLock getDistRedisLockInfo(ProceedingJoinPoint point) {
        try {
            MethodSignature methodSignature = (MethodSignature) point.getSignature();
            Method method = methodSignature.getMethod();
            return method.getAnnotation(RedisLock.class);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return null;
    }
}
