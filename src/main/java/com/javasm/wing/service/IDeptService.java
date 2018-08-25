package com.javasm.wing.service;

import com.javasm.wing.model.Dept;

import java.util.List;

public interface IDeptService {
    Dept selectByPrimaryKey(Long id);
    List<Dept> selectAllDept();
}
