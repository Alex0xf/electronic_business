package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.IpMapper;
import com.javasm.wing.model.Ip;
import com.javasm.wing.model.Power;
import com.javasm.wing.service.IIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IpServiceImpl implements IIpService {
    @Autowired
    IpMapper ipMapper;
   public List<Ip> selectAllIp(){
       List<Ip> list =ipMapper.selectAllIp();
       return list;
   }

    public PageInfo findIpDeptEmployeeByPage(int page, int pageSize){
        PageHelper.startPage(page, pageSize);
       List<Ip> list = ipMapper.selectAllIpEmployeeDept();
        return new PageInfo(list);
    }
}
