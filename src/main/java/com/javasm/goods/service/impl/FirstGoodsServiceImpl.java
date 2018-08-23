package com.javasm.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.dao.FirstGoodsMapper;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IFirstGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstGoodsServiceImpl implements IFirstGoodsService {

    @Autowired
    FirstGoodsMapper firstGoodsDao;

    //查询所有数据 用pagehlper来分页
    @Override
    public PageInfo<FirstGoods> selectFirstGoodsListWithProduct(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<FirstGoods> list = firstGoodsDao.selectFirstGoodsListWithProduct();
        return new PageInfo(list);
    }

}
