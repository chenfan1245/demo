package com.cykj.mapper;

import com.cykj.bean.Tblgoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.cykj.bean.Tblpower;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblgoodsMapper {
    // 查询所有商品信息
    List<Tblgoods> findAllGoods(@Param("goodsTitle")String goodsTitle,
                                @Param("goodsType")String goodsType);
    //根据Id删除商品
    public int deleteGoods(@Param("id")String id);

}
