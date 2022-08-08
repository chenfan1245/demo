package com.cykj.service;

public interface TblgoodsService {

    //删除商品
    public boolean deleteGoods(String id);
    //增加商品
    public boolean addGoods(String goodsTitle,double price,String goodsType);
}
