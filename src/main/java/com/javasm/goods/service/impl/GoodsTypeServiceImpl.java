package com.javasm.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    //使用分页插件pagehelper帮查出来的所有信息分页
    @Override
    public PageInfo<GoodsType> selectGoodsTypeList(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<GoodsType> list = goodsTypeDao.selectGoodsTypeList();
        return new PageInfo(list);
    }

    //按照id删除商品类型
    @Override
    public int deleteByPrimaryKey(int id) {
        int i = 0;
        if(id>0){
            i=goodsTypeDao.deleteByPrimaryKey(id);
        }
        return i;
    }

    //新增一条商品类型记录
    @Override
    public int insert(GoodsType goodsType) {
        if(goodsType!=null){
            return goodsTypeDao.insertSelective(goodsType);
        }
        return 0;
    }

    //修改商品类型属性值
    @Override
    public int updateByPrimaryKeySelective(GoodsType goodsType) {
        if(goodsType!=null){
            return goodsTypeDao.updateByPrimaryKeySelective(goodsType);
        }
        return 0;
    }
}
