package com.javasm.wing.dao;

import com.javasm.wing.model.Rose_Power;

public interface Rose_PowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rose_Power record);

    int insertSelective(Rose_Power record);

    Rose_Power selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rose_Power record);

    int updateByPrimaryKey(Rose_Power record);

    Rose_Power selectByRose(long rose);

    Rose_Power selectRoseAndPower(Integer id);

}