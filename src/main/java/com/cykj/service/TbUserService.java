package com.cykj.service;


import com.cykj.bean.TblUser;
import com.cykj.bean.Tblpower;

import java.util.List;
//hahahaha
public interface TbUserService {
    //  登录
    TblUser login(String acc, String pwd);
    //  注册
    boolean enroll(TblUser tblUser);
    //  查询
    List<TblUser> findAll(String name,String acc);
    //  查询总条数
    int count();
    //  删除
    boolean del(long id);
    //  修改
    boolean upd(long id,String pwd,long age,String address);
    //  查找角色下的权限
    List<Tblpower> findRolePower(long roleId);
}
