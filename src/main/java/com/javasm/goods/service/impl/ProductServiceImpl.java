package com.javasm.goods.service.impl;

import com.javasm.goods.dao.FirstProductMapper;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    FirstProductMapper firstProductDao;

    @Override
    public List<FirstProduct> selectProductList() {


        return firstProductDao.selectProductList();
    }
}

