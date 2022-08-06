package com.cykj.service.impl;

import com.cykj.bean.Tblrolepower;
import com.cykj.mapper.TblrolePowerMapper;
import com.cykj.service.TblrolePowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TblrolePowerImpl implements TblrolePowerService {
    @Autowired
    private TblrolePowerMapper tblrolePowerMapper;
    @Override
    public boolean checkPower(long roleId, long powerId) {
        Tblrolepower tblrolepower = tblrolePowerMapper.checkPower(roleId, powerId);
        if (tblrolepower != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean addPower(long roleId, long powerId) {
        int num = tblrolePowerMapper.addPower(roleId, powerId);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delPower(long roleId, long powerId) {
        int num = tblrolePowerMapper.delPower(roleId, powerId);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delRolePower(long roleId) {
        int num = tblrolePowerMapper.delRolePower(roleId);
        if (num > 0){
            return true;
        }
        return false;
    }
}
