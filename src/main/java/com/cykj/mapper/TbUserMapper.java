package com.cykj.mapper;


import com.cykj.bean.TblUser;
import com.cykj.bean.Tblpower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//@Repository
public interface TbUserMapper {
    //  登录
    TblUser login(@Param("acc") String acc, @Param("pwd") String pwd);
    //  注册
    int enroll(TblUser tblUser);
    //  查询
    List<TblUser> findAll(@Param("name")String name,@Param("acc")String acc);
    //  查询总条数
    int count();
    //  删除
    int del(@Param("id")long id);
    //  修改
    int upd(@Param("id") long id, @Param("pwd") String pwd,@Param("age") long age, @Param("address") String address);
    //  查找角色下的权限
    List<Tblpower> findRolePower(@Param("roleId")long roleId);
}
