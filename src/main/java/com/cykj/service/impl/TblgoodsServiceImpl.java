package com.cykj.service.impl;

import com.cykj.bean.Tblgoods;
import com.cykj.mapper.TblgoodsMapper;
import com.cykj.service.TblgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblgoodsServiceImpl implements TblgoodsService {
    @Autowired
    private TblgoodsMapper goodsMapper;

    // 查询所有商品信息
    @Override
    public List<Tblgoods> findAllGoods(String goodsTitle, String goodsType) {
        return goodsMapper.findAllGoods(goodsTitle, goodsType);
    }

    //删除商品
    @Override
    public int deleteGoods(String id) {
        int re = goodsMapper.deleteGoods(id);
        return re;
    }
    //增加商品
    @Override
    public boolean addGoods(String goodsTitle, double price, String goodsType) {
        int num =goodsMapper.addGoods(goodsTitle,price,goodsType);
        if(num>0){
            return true;
        }
        return false;
    }



    @Override
    public int updGoods(String goodsTitle, double price, String goodsType, long id) {
        return goodsMapper.updGoods(goodsTitle, price, goodsType, id);
    }
}
