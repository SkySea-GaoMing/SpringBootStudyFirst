package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
@MapperScan("com.atguigu.mybatis.mapper")
@SpringBootApplication
//标记主程序，说明这是一个springboot应用
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);

    }
}
