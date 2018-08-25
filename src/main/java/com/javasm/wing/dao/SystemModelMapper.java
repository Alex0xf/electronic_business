package com.javasm.wing.dao;

import com.javasm.wing.model.SystemModel;

public interface SystemModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemModel record);

    int insertSelective(SystemModel record);

    SystemModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemModel record);

    int updateByPrimaryKey(SystemModel record);
}