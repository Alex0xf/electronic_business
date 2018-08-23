package com.javasm.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.dao.GoodsTypeMapper;
import com.javasm.goods.model.GoodsBrand;
import com.javasm.goods.model.GoodsType;
import com.javasm.goods.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    GoodsTypeMapper goodsTypeDao;

    //使用分页插件pagehelper帮查出来的所有信息分页
    @Override
    public PageInfo<GoodsType> selectGoodsTypeList(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<GoodsType> list = goodsTypeDao.selectGoodsTypeList();
        return new PageInfo(list);
    }
}
