package com.example.dome.lock;


//
//@Configuration
//public class CuratorConfiguration {
//
//
//    @Value("${curator.retryCount}")
//    private int retryCount;
//
//    @Value("${curator.elapsedTimeMs}")
//    private int elapsedTimeMs;
//
//    @Value("${curator.connectString}")
//    private String connectString;
//
//    @Value("${curator.sessionTimeoutMs}")
//    private int sessionTimeoutMs;
//
//    @Value("${curator.connectionTimeoutMs}")
//    private int connectionTimeoutMs;
//
//    @Bean(initMethod = "start")
//    public CuratorFramework curatorFramework() {
//
//        return CuratorFrameworkFactory.newClient(
//                connectString,
//                sessionTimeoutMs,
//                connectionTimeoutMs,
//                new RetryNTimes(retryCount, elapsedTimeMs));
//    }
//}
