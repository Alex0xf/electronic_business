package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.FirstProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IProductService {

    PageInfo<FirstProduct> selectProductList(int page, int pageSize);

   // List<FirstProduct> selectProductListLimit(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);

}
