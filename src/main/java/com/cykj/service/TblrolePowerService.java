package com.cykj.service;

import org.apache.ibatis.annotations.Param;

public interface TblrolePowerService {
    // 检查该角色是否有该权限
    boolean checkPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    // 给角色添加权限
    boolean addPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    // 给角色删除权限
    boolean delPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    //  删除角色下的权限
    boolean delRolePower(@Param("roleId") long roleId);

}
