package com.cykj.mapper;

import com.cykj.bean.Tblrolepower;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblrolePowerMapper {
    // 检查该角色是否有该权限
    Tblrolepower checkPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    // 给角色添加权限
    int addPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    // 给角色删除权限
    int delPower(@Param("roleId") long roleId, @Param("powerId") long powerId);
    //  删除角色下的权限
    int delRolePower(@Param("roleId") long roleId);

}
