package com.javasm.wing.service.impl;

import com.javasm.wing.dao.DeptMapper;
import com.javasm.wing.model.Dept;
import com.javasm.wing.service.IDeptService;
import com.javasm.wing.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements IDeptService {
   @Autowired
    DeptMapper deptMapper;
    public List<Dept> selectAllDept(){
        List<Dept> list = deptMapper.selectAllDept();
        return list;
    }
    public  Dept selectByPrimaryKey(Long id){
        Dept dept = deptMapper.selectByPrimaryKey(id);
        return dept;
    }
}
