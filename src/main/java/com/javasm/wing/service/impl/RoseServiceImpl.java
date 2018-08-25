package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.RoseMapper;
import com.javasm.wing.model.Rose;
import com.javasm.wing.service.IRoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RoseServiceImpl implements IRoseService {
    @Autowired
    RoseMapper roseMapper;
    List<Rose> list;

    public List<Rose> selectAllRose(){
         list = roseMapper.selectAllRose();
        return list;
    }

    public List<Rose> selectAllRoseAndPower(){
         list = roseMapper.selectAllRoseAndPower();
        return list;
    }

    public PageInfo<Rose> findRoseByPage(int page, int pageSize){
        PageHelper.startPage(page, pageSize);
         List<Rose> roseList = roseMapper.selectAllRoseAndPower();
        return new PageInfo(roseList);
    }

    public List<Rose> selectByName(String name){
        return  roseMapper.selectByName(name);
    }

   public int insertSelective(Rose record){
        return  roseMapper.insertSelective(record);
    }
}
