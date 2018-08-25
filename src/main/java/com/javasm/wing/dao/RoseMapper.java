package com.javasm.wing.dao;

import com.javasm.wing.model.Rose;

import java.util.List;

public interface RoseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rose record);

    int insertSelective(Rose record);

    Rose selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rose record);

    int updateByPrimaryKey(Rose record);

    List<Rose> selectAllRose();

    List<Rose> selectAllRoseAndPower();

    List<Rose> selectByName(String name);
}