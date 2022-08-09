package com.cykj.service;

import com.cykj.bean.Tblgoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblgoodsService {
    // 查询所有商品信息
    List<Tblgoods> findAllGoods(String goodsTitle, String goodsType);
    //删除商品
    public int deleteGoods(String id);
    //增加商品
    public boolean addGoods(String goodsTitle,double price,String goodsType);
    //修改商品信息
    int updGoods(String goodsTitle, double price, String goodsType, long id);
}
