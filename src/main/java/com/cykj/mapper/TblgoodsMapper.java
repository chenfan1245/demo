package com.cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblgoodsMapper {

    //根据Id删除商品
    public int deleteGoods(@Param("id")String id);
}
