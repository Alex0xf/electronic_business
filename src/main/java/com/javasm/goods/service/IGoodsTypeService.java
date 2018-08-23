package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.GoodsType;

public interface IGoodsTypeService {

    PageInfo<GoodsType> selectGoodsTypeList(int page, int pageSize);
}
