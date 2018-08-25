package com.javasm.wing.dao;

import com.javasm.wing.model.SystemLogger;

import java.util.List;

public interface SystemLoggerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemLogger record);

    int insertSelective(SystemLogger record);

    SystemLogger selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemLogger record);

    int updateByPrimaryKey(SystemLogger record);

    List<SystemLogger> selectAllLogger();
}