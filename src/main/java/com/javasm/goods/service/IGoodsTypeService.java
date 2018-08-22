package com.javasm.goods.service;

import com.javasm.goods.model.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsTypeService {
    List<GoodsType> selectGoodsTypeList();

    List<GoodsType> selectGoodsTypeListLimit(@Param("pageNum") int pageNum, @Param("pageSize")int pageSize);
}
