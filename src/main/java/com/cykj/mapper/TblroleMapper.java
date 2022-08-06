package com.cykj.mapper;

import com.cykj.bean.Tblrole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblroleMapper {
    //  查询角色
    List<Tblrole> find();
    // 查询角色，分页显示
    List<Tblrole> findRole();
    //  查询数据库条数
    int count();
    //  检查角色名字是否重复
    Tblrole checkRoleName(@Param("roleName") String roleName);
    //  新增角色
    int add(@Param("roleName") String roleName, @Param("mydescribe") String mydescribe);
    //  修改角色
    int upd(@Param("mydescribe") String mydescribe, @Param("roleId") long roleId);
    //  删除角色
    int del(@Param("roleId") long roleId);
    //  判断角色是否员工应用
    List<Tblrole> checkRole(@Param("roleId") long roleId);
    // 查询角色
    Tblrole selRole(@Param("roleId") long roleId);
}
