package com.atguigu.spring;

import com.atguigu.controller.bean.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class springbootconfigurationtest {

    Logger logger= LoggerFactory.getLogger(getClass());
   @Test
    public void contextLoads()
    {
       logger.trace("这是trace");
       logger.debug("这是debug");
       logger.info("这是info");
       logger.warn("这是warn");
       logger.error("这是error");

    }
}
