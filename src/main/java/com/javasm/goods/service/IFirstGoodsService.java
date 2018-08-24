package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.model.FirstProduct;

import java.util.List;

public interface IFirstGoodsService {

    //查询一类商品信息
    PageInfo<FirstGoods> selectFirstGoodsListWithProduct(int page, int pageSize);

    //新增一类产品信息
    int insertSelective(FirstGoods firstGoods);
}
