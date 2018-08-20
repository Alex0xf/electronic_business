package com.javasm.goods.service.impl;

import com.javasm.goods.dao.FirstGoodsMapper;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.service.IFirstGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstGoodsServiceImpl implements IFirstGoodsService {

    @Autowired
    FirstGoodsMapper firstGoodsDao;

    public List<FirstGoods> selectFirstGoodsListWithProduct(){
        List<FirstGoods> firstGoodsList=firstGoodsDao.selectFirstGoodsListWithProduct();
        return firstGoodsList;
    }
}
