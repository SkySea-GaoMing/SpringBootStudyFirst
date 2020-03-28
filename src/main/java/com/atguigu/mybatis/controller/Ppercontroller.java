package com.atguigu.mybatis.controller;

import com.atguigu.mybatis.entity.Pperson;
import com.atguigu.mybatis.service.Pperservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Ppercontroller {
    @Autowired
    Pperservice ppservice;
    @ResponseBody
    @RequestMapping("/hello/{id}")
    //接收来自浏览器的hello请求
    public Pperson hello(@PathVariable int id)
    {
        return ppservice.querybyid(id);
    }
}
