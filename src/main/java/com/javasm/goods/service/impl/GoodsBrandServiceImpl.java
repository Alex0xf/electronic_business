package com.javasm.goods.service.impl;

import com.javasm.goods.dao.GoodsBrandMapper;
import com.javasm.goods.model.GoodsBrand;
import com.javasm.goods.service.IGoodsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBrandServiceImpl implements IGoodsBrandService {

    @Autowired
    GoodsBrandMapper goodsBrandDao;

    @Override
    public List<GoodsBrand> selectGoodsBrandList() {

        return goodsBrandDao.selectGoodsBrandList();
    }

    @Override
    public List<GoodsBrand> selectGoodsBrandListLimit(int pageNum, int pageSize) {
        return goodsBrandDao.selectGoodsBrandListLimit(pageNum,pageSize);
    }
}
