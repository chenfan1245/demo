package com.cykj.service;

import com.cykj.bean.Tblrole;

import java.util.List;

public interface TblroleService {
    //  查询角色
    List<Tblrole> find();
    // 查询角色，分页显示
    List<Tblrole> findRole();
    //  查询数据库条数
    int count();
    //  检查角色名字是否重复
    boolean checkRoleName(String roleName);
    //  新增角色
    boolean add(String roleName, String mydescribe);
    //  修改角色
    boolean upd(String mydescribe, long roleId);
    //  删除角色
    boolean del(long roleId);
    //  判断角色是否员工应用
    List<Tblrole> checkRole(long roleId);
    // 查询角色
    Tblrole selRole(long roleId);
}
