package com.example.dome.controller;


import com.example.dome.lock.RedisLock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomeController {

//    @Autowired
//    private ZookeeperLock zookeeperLock;

    @RedisLock(lockKey = "get-lock", keepMills = 1000 * 10)
    @GetMapping("/redis-lock")
    public String redisLock() throws Exception {
        System.out.println("redis 获取锁....." + Thread.currentThread().getName());
        Thread.sleep(1000 * 20);
        return "ok redis";
    }

    @GetMapping("/zk-lock")
    public String zkLock() throws Exception {
//        zookeeperLock.acquireDistributedLock("zk-lock");
//        System.out.println("zk 获取锁....." + Thread.currentThread().getName());
//        Thread.sleep(1000 * 20);
//        zookeeperLock.releaseDistributedLock("zk-lock");
        return "ok zk";
    }


    @GetMapping("/verify")
    public String verify(@RequestParam("name") String name, @RequestParam("pwd") String pwd) throws Exception {
        System.out.println("正在登录........" + name + "\t" + pwd);
        Thread.sleep(1000 * 5);
        return "login ok";
    }


}
