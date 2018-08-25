package com.javasm.wing.dao;

import com.javasm.wing.model.Power;

import java.util.List;

public interface PowerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);

    List<Power> selectAllPower();

    List<Power> selectAllPowerAndRose();
}