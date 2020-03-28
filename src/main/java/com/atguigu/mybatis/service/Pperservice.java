package com.atguigu.mybatis.service;

import com.atguigu.mybatis.entity.Pperson;
import com.atguigu.mybatis.mapper.Ppermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class Pperservice {
    @Autowired
    private Ppermapper ppermapper;
    public Pperson querybyid(int id)
    {
        return ppermapper.querybyid(id);
    }
    public List<Pperson> queryall(){
        return ppermapper.queryall();
    }
    //没有resultType则为void
    public void addpperson(Pperson p){
        ppermapper.addpperson(p);
    }
    public void deletebyid(int id){
        ppermapper.deletebyid(id);
    }
    public void updatebyid(Pperson p){
        ppermapper.updatebyid(p);
    }
    public List<Pperson> queryaddress(Pperson p){
        return ppermapper.queryaddress(p);
    }
    public List<Pperson> queryhash(HashMap<String,Object> map){
        return ppermapper.queryhash(map);
    }
}
