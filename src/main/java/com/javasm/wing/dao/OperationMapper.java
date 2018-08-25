package com.javasm.wing.dao;

import com.javasm.wing.model.Operation;

import java.util.List;

public interface OperationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Operation record);

    int insertSelective(Operation record);

    Operation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
//    查出所有操作
    List<Operation> selectAllOperation();
}