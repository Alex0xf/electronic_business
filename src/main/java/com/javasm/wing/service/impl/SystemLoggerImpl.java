package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.SystemLoggerMapper;
import com.javasm.wing.model.Power;
import com.javasm.wing.model.SystemLogger;
import com.javasm.wing.service.ISystemLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemLoggerImpl implements ISystemLoggerService {
    @Autowired
    SystemLoggerMapper systemLoggerMapper;
   public PageInfo<SystemLogger> findSysteLoggerByPage(int page, int pageSize){
       PageHelper.startPage(page, pageSize);
       List<SystemLogger>  list = systemLoggerMapper.selectAllLogger();
       return new PageInfo(list);
    }
}
