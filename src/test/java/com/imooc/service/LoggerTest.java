package com.imooc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by w on 2018/4/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);

    @Test
    public void test1(){
        String name = "dadsfas";
        String password = "asdfdsfa";
        logger.debug("debug...");
        logger.info("info...");
        logger.info("name : {}, password : {}" ,name, password);
        logger.error("error...");
    }
}
