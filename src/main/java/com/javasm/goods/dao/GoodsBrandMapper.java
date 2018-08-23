package com.javasm.goods.dao;

import com.javasm.goods.model.GoodsBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);

    List<GoodsBrand> selectGoodsBrandList();

}