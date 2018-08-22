package com.javasm.goods.service;

import com.javasm.goods.model.GoodsBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsBrandService {

    List<GoodsBrand> selectGoodsBrandList();

    List<GoodsBrand> selectGoodsBrandListLimit(@Param("pageNum") int pageNum, @Param("pageSize")int pageSize);
}
