package com.javasm.goods.dao;

import com.javasm.goods.model.GoodsType;

import java.util.List;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsType goodsType);

    int insertSelective(GoodsType goodsType);

    GoodsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsType goodsType);

    int updateByPrimaryKey(GoodsType goodsType);

    List<GoodsType> selectGoodsTypeList();

}