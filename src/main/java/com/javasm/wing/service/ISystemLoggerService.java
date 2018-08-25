package com.javasm.wing.service;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.SystemLogger;

public interface ISystemLoggerService {
    PageInfo<SystemLogger> findSysteLoggerByPage(int page, int pageSize);
}
