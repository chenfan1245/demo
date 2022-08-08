package com.cykj.service.impl;

import com.cykj.mapper.TblgoodsMapper;
import com.cykj.service.TblgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TblgoodsServiceImpl implements TblgoodsService {
    @Autowired
    private TblgoodsMapper goodsMapper;

    //删除商品
    @Override
    public boolean deleteGoods(String id) {
        int re = goodsMapper.deleteGoods(id);
        if (re!=0){
            return true;
        }
        return false;
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


}
