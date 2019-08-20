package com.example.dome.lock;

import java.lang.annotation.*;


@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RedisLockKey {
    /**
     * key的拼接顺序规则
     */
    int order() default 0;
}