package com.javasm.goods.dao;

import com.javasm.goods.model.FirstGoods;

import java.util.List;

public interface FirstGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FirstGoods record);

    int insertSelective(FirstGoods firstGoods);

    FirstGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FirstGoods record);

    int updateByPrimaryKey(FirstGoods record);

    List<FirstGoods> selectFirstGoodsListWithProduct();
}