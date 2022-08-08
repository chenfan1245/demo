package com.cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.cykj.bean.Tblpower;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TblgoodsMapper {
    //根据Id删除商品
    public int deleteGoods(@Param("id") String id);

}
