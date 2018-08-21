package com.javasm.goods.service.impl;

import com.javasm.goods.dao.FirstProductMapper;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public List<FirstProduct> selectProductListLimit() {
        return null;
    }

    @Autowired
    FirstProductMapper firstProductDao;

    @Override
    public List<FirstProduct> selectProductList() {


        return firstProductDao.selectProductList();
    }

    @Override
    public List<FirstProduct> selectProductListLimit(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize) {

        return firstProductDao.selectProductListLimit(pageNum,pageSize);
    }
}

