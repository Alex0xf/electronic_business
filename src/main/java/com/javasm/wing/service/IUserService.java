package com.javasm.wing.service;
import com.javasm.wing.model.User;

public interface IUserService {
    User selectByLogName(String logName);

    int insertSelective(User record);

}
