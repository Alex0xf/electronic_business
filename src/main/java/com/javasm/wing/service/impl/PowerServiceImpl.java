package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.PowerMapper;
import com.javasm.wing.model.Power;
import com.javasm.wing.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PowerServiceImpl implements IPowerService {
    @Autowired
    PowerMapper powerMapper;
    List<Power> list;
    public List<Power> selectAllPower(){
        list = powerMapper.selectAllPower();
        return list;
    }

    public List<Power> selectAllPowerAndRose(){
        list = powerMapper.selectAllPowerAndRose();
        return list;
    }

    public PageInfo<Power> findPowerByPage(int page, int pageSize){
        PageHelper.startPage(page, pageSize);
        List<Power> list = powerMapper.selectAllPowerAndRose();
        return new PageInfo(list);
    }
}
