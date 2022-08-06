package com.cykj.service.impl;

import com.cykj.bean.Tblpower;
import com.cykj.mapper.TblpowerMapper;
import com.cykj.service.TblpowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblpowerServiceImpl implements TblpowerService {
    @Autowired
    private TblpowerMapper tblpowerMapper;
    @Override
    public List<Tblpower> findAllPower() {
        return tblpowerMapper.findAllPower();
    }

    @Override
    public List<Tblpower> findRolePower(long roleId) {
        return tblpowerMapper.findRolePower(roleId);
    }

    @Override
    public List<Tblpower> findChilePower(long parentId) {
        return tblpowerMapper.findChilePower(parentId);
    }

    @Override
    public List<Tblpower> selRolePower(long roleId) {
        return tblpowerMapper.selRolePower(roleId);
    }
}
