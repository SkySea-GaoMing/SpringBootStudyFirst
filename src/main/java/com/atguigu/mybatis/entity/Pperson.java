package com.atguigu.mybatis.entity;
public class Pperson {
    private int id;
    private String name ;
    private int age;
    private boolean sex;
    private Address address;
    public Pperson(int id,String name,int age,boolean sex)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public Pperson(){
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return this.id+","+this.name+","+this.age+","+this.sex+
                ","+this.address;
    }
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
