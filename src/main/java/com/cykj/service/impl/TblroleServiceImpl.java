package com.cykj.service.impl;

import com.cykj.bean.Tblrole;
import com.cykj.mapper.TblroleMapper;
import com.cykj.service.TblroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblroleServiceImpl implements TblroleService {
    @Autowired
    private TblroleMapper tblroleMapper;
    @Override
    public List<Tblrole> find() {
        return tblroleMapper.find();
    }

    @Override
    public List<Tblrole> findRole() {
        return tblroleMapper.findRole();
    }

    @Override
    public int count() {
        return tblroleMapper.count();
    }

    @Override
    public boolean checkRoleName(String roleName) {
        Tblrole tblrole = tblroleMapper.checkRoleName(roleName);
        if (tblrole != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean add(String roleName, String mydescribe) {
        int num = tblroleMapper.add(roleName, mydescribe);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean upd(String mydescribe, long roleId) {
        int num = tblroleMapper.upd(mydescribe, roleId);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean del(long roleId) {
        int num = tblroleMapper.del(roleId);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Tblrole> checkRole(long roleId) {
        return tblroleMapper.checkRole(roleId);
    }

    @Override
    public Tblrole selRole(long roleId) {
        return tblroleMapper.selRole(roleId);
    }
}
