package com.javasm.wing.service.impl;

import com.javasm.wing.dao.Rose_PowerMapper;
import com.javasm.wing.model.Rose_Power;
import com.javasm.wing.service.IRose_PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rose_PowerServiceImpl implements IRose_PowerService {
    @Autowired
    Rose_PowerMapper rose_powerMapper;
   public int insertSelective(Rose_Power record){
       return rose_powerMapper.insert(record);
   }

}
