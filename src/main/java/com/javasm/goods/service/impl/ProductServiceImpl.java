package com.javasm.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.dao.FirstProductMapper;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    FirstProductMapper firstProductDao;

    //使用分页插件pagehelper帮查出来的所有信息分页
    @Override
    public PageInfo<FirstProduct> selectProductList(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<FirstProduct> list = firstProductDao.selectProductList();
      /*  for(FirstProduct product:list){
            long name = product.getIp().getName();
            Dept dept = iDeptService.selectByPrimaryKey(name);
            System.out.println("dept:"+dept);
            employee.setDept(dept);
            System.out.println("每个雇员:"+employee);
        }*/

        return new PageInfo(list);
    }

   /* @Override
    public List<FirstProduct> selectProductListLimit(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize) {

        return firstProductDao.selectProductListLimit(pageNum,pageSize);
    }*/
}

