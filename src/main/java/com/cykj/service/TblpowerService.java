package com.cykj.service;

import com.cykj.bean.Tblpower;

import java.util.List;

public interface TblpowerService {
    //  查询所有权限
    List<Tblpower> findAllPower();
    //  查找角色下的权限
    List<Tblpower> findRolePower(long roleId);
    // 查询权限下的所有子权限
    List<Tblpower> findChilePower(long parentId);
    // 查询非角色下的权限
    List<Tblpower> selRolePower(long roleId);
}
