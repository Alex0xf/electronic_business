package com.javasm.goods.dao;

import com.javasm.goods.model.FirstProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FirstProduct record);

    int insertSelective(FirstProduct record);

    FirstProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FirstProduct record);

    int updateByPrimaryKey(FirstProduct record);

    List<FirstProduct> selectProductList();

   // List<FirstProduct> selectProductListLimit(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //List<FirstProduct> selectProductListLimit();
}