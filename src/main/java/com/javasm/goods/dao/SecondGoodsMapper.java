package com.javasm.goods.dao;

import com.javasm.goods.model.SecondGoods;

public interface SecondGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondGoods record);

    int insertSelective(SecondGoods record);

    SecondGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondGoods record);

    int updateByPrimaryKey(SecondGoods record);
}