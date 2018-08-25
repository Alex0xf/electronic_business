package com.javasm.wing.dao;

import com.javasm.wing.model.Ip;

import java.util.List;

public interface IpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ip record);

    int insertSelective(Ip record);

    Ip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ip record);

    int updateByPrimaryKey(Ip record);

    Ip selectByEmployeeId(long employeeId);

//    查出所有ip段
    List<Ip> selectAllIp();
//    查出所有ip包括部门,员工
    List<Ip> selectAllIpEmployeeDept();

}