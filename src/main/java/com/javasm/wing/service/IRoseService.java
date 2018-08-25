package com.javasm.wing.service;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Rose;

import java.util.List;

public interface IRoseService {
    List<Rose> selectAllRose();

    List<Rose> selectAllRoseAndPower();

    PageInfo<Rose> findRoseByPage(int page, int pageSize);

    List<Rose> selectByName(String name);

    int insertSelective(Rose record);
}
