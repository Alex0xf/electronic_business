package com.javasm.goods.dao;

import com.javasm.goods.model.FirstGoods;

public interface FirstGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FirstGoods record);

    int insertSelective(FirstGoods record);

    FirstGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FirstGoods record);

    int updateByPrimaryKey(FirstGoods record);
}