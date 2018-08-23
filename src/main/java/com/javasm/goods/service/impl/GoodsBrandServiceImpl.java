package com.javasm.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    //使用分页插件pagehelper帮查出来的所有信息分页
    @Override
    public PageInfo<GoodsBrand> selectGoodsBrandList(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<GoodsBrand> list = goodsBrandDao.selectGoodsBrandList();
        return new PageInfo(list);
    }

}
