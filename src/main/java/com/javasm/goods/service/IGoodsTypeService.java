package com.javasm.goods.service;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.GoodsType;

public interface IGoodsTypeService {

    //新增一条商品类型记录
    int insert(GoodsType goodsType);

    //按照id删除商品类型
   int deleteByPrimaryKey(int id);

   //修改商品类型属性值
   int updateByPrimaryKeySelective(GoodsType record);

    //分页 显示所有商品类型列表
    PageInfo<GoodsType> selectGoodsTypeList(int page, int pageSize);
}
