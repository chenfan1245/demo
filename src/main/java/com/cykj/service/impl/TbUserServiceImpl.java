package com.cykj.service.impl;


import com.cykj.bean.TblUser;
import com.cykj.bean.Tblpower;
import com.cykj.mapper.TbUserMapper;
import com.cykj.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TblUser login(String acc, String pwd) {
        TblUser tblUser = tbUserMapper.login(acc, pwd);
        return tblUser;
    }

    @Override
    public boolean enroll(TblUser tblUser) {
        int num = tbUserMapper.enroll(tblUser);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<TblUser> findAll(String name, String acc) {
        return tbUserMapper.findAll(name, acc);
    }

    @Override
    public int count() {
        return tbUserMapper.count();
    }

    @Override
    public boolean del(long id) {
        int num = tbUserMapper.del(id);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean upd(long id, String pwd, long age, String address) {
        int num = tbUserMapper.upd(id, pwd, age, address);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Tblpower> findRolePower(long roleId) {
        return tbUserMapper.findRolePower(roleId);
    }
}
