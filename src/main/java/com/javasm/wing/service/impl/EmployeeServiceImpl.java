package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.EmployeeMapper;
import com.javasm.wing.model.Dept;
import com.javasm.wing.model.Employee;
import com.javasm.wing.service.IDeptService;
import com.javasm.wing.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    IDeptService iDeptService;

    public List<Employee> selectAllEmployee(){
        List<Employee> list = employeeMapper.selectAllEmployee();

        return list;

    }
    public List<Employee> selectAllInfo(){
        List<Employee> list = employeeMapper.selectAllInfo();

        return list;
    }

    public PageInfo findUserByPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Employee> list = employeeMapper.selectAllInfo();

        for(Employee employee:list){

            long name = employee.getIp().getName();
            Dept dept = iDeptService.selectByPrimaryKey(name);
            employee.setDept(dept);

        }



        return new PageInfo(list);
    }
}
