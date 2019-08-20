package com.example.dome.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Tangshengbo
 * @date 2019/8/19
 */

@JobHandler(value = "firstJobHandler")
@Component
public class FirstJobHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(FirstJobHandler.class);

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        logger.info("dsfsdfsdfs");
        System.out.println("执行业务逻辑.....................start");

        Thread.sleep(5000);

        System.out.println("执行业务逻辑.....................end");

        return null;
    }
}
