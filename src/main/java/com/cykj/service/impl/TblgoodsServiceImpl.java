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
    private TblgoodsMapper mapper;

    // 查询所有商品信息
    @Override
    public List<Tblgoods> findAllGoods(String goodsTitle, String goodsType) {
        return mapper.findAllGoods(goodsTitle, goodsType);
    }
}
