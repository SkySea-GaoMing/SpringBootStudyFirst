package com.atguigu.controller.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
//将本类的属性放入springboot
@Component

@ConfigurationProperties(prefix="person")
public class Person {
    private String lastName;
    private int age;
    private boolean boss;
    private Date birth;
    private HashMap<String,Object> maps;
    private ArrayList<Object> list;
    private Dog dog;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public HashMap<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(HashMap<String, Object> maps) {
        this.maps = maps;
    }

    public ArrayList<Object> getList() {
        return list;
    }

    public void setList(ArrayList<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
