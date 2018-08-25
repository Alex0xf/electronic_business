package com.javasm.wing.service.impl;

import com.javasm.wing.dao.JobMapper;
import com.javasm.wing.model.Job;
import com.javasm.wing.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements IJobService {
    @Autowired
    JobMapper jobMapper;
    public List<Job> selectAllJob(){
        List<Job> list = jobMapper.selectAllJob();
        return list;
    }

}
