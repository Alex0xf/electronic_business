package com.javasm.goods.service;

import com.javasm.goods.model.FirstProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IProductService {

    List<FirstProduct> selectProductList();

    List<FirstProduct> selectProductListLimit(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);

}
