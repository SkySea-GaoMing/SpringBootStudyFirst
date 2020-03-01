package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
//能够处理请求
public class HelloController {

    @RequestMapping("/hello")
    //接收来自浏览器的hello请求
    public String hello(Map<String,Object> map)
    {
        map.put("hello","你好");
        return "hello";
    }

}
