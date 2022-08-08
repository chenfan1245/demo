package com.cykj.service;

import com.cykj.bean.Tblgoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblgoodsService {
    // 查询所有商品信息
    List<Tblgoods> findAllGoods(String goodsTitle, String goodsType);
    //删除商品
    public boolean deleteGoods(String id);
}
