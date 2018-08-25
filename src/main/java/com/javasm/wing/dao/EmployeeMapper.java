package com.javasm.wing.dao;

import com.javasm.wing.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectAllEmployee();

    List<Employee> selectAllInfo();
}