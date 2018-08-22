package com.javasm.goods.service.impl;

import com.javasm.goods.dao.GoodsTypeMapper;
import com.javasm.goods.model.GoodsType;
import com.javasm.goods.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    GoodsTypeMapper goodsTypeDao;

    @Override
    public List<GoodsType> selectGoodsTypeList() {
        return goodsTypeDao.selectGoodsTypeList();
    }

    @Override
    public List<GoodsType> selectGoodsTypeListLimit(int pageNum, int pageSize) {

        return goodsTypeDao.selectGoodsTypeListLimit(pageNum,pageSize);
    }
}
