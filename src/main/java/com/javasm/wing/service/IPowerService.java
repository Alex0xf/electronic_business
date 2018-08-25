package com.javasm.wing.service;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Power;

import java.util.List;

public interface IPowerService {
    List<Power> selectAllPower();

    List<Power> selectAllPowerAndRose();

    PageInfo<Power> findPowerByPage(int page, int pageSize);
}
