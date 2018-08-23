package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.model.FirstProduct;

import java.util.List;

public interface IFirstGoodsService {

    //List<FirstGoods> selectFirstGoodsListWithProduct();

    PageInfo<FirstGoods> selectFirstGoodsListWithProduct(int page, int pageSize);
}
