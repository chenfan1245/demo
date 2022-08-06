package com.cykj.mapper;

import com.cykj.bean.Tblpower;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblpowerMapper {
    //  查询所有权限
    List<Tblpower> findAllPower();
    //  查找角色下的权限
    List<Tblpower> findRolePower(@Param("roleId") long roleId);
    // 查询权限下的所有子权限
    List<Tblpower> findChilePower(@Param("parentId") long parentId);
    // 查询非角色下的权限
    List<Tblpower> selRolePower(@Param("roleId") long roleId);
}
