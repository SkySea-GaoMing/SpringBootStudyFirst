package com.atguigu.mybatis.mapper;
import com.atguigu.mybatis.entity.Pperson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository
public interface Ppermapper {
    //约定1.方法名与id一致
    //约定2.方法的输入参数和标签中的输入类型一致
    //约定3.方法返回值与标签返回类型一致
    Pperson querybyid(int id);
    List<Pperson> queryall();
    //没有resultType则为void
    void addpperson(Pperson p);
    void deletebyid(int id);
    void updatebyid(Pperson p);
    List<Pperson> queryaddress(Pperson p);
    List<Pperson> queryhash(HashMap<String,Object> map);
}
