package com.javasm.wing.dao;

import com.javasm.wing.model.OperationContext;

public interface OperationContextMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationContext record);

    int insertSelective(OperationContext record);

    OperationContext selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperationContext record);

    int updateByPrimaryKey(OperationContext record);
}