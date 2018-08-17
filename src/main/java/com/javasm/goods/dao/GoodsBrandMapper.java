package com.javasm.goods.dao;

import com.javasm.goods.model.GoodsBrand;

public interface GoodsBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}