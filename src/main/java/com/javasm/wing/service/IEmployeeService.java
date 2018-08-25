package com.javasm.wing.service;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> selectAllEmployee();

    List<Employee> selectAllInfo();

    PageInfo<Employee> findUserByPage(int page, int pageSize);
}
