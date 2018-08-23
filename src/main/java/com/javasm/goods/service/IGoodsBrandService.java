package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.GoodsBrand;

public interface IGoodsBrandService {

    PageInfo<GoodsBrand> selectGoodsBrandList(int page, int pageSize);
}
