package com.javasm.wing.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.wing.dao.UserMapper;
import com.javasm.wing.model.User;
import com.javasm.wing.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    public User selectByLogName (String logName){
        User user = userMapper.selectByLogName(logName);
        return user;
    }

    public int insertSelective(User record){
        return  userMapper.insertSelective(record);
    }

}
