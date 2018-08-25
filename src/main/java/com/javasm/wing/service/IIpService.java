package com.javasm.wing.service;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Employee;
import com.javasm.wing.model.Ip;

import java.util.List;

public interface IIpService {
    List<Ip> selectAllIp();

    PageInfo<Employee> findIpDeptEmployeeByPage(int page, int pageSize);
}
