package com.example.dome.lock;

import java.lang.annotation.*;

/**
 * Created by TangShengBo on 2017-10-30.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RedisLock {
    /**
     * 锁的key
     * 如果想添加非固定锁，可以在参数上添加@P4jSynKey注解，但是本参数是必写选项<br/>
     * redis key的拼写规则为 "DistRedisLock+" + lockKey + @RedisLOckKey<br/>
     */
    String lockKey();

    /**
     * 持锁时间
     * 单位毫秒,默认5秒<br/>
     */
    long keepMills() default 10 * 1000;

    /**
     * 没有获取到锁时，等待时间
     *
     * @return
     */
    long maxSleepMills() default 120 * 1000;
}