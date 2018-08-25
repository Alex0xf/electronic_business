package com.javasm.wing.service.impl;

import com.javasm.wing.dao.OperationMapper;
import com.javasm.wing.model.Operation;
import com.javasm.wing.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl implements IOperationService {
    @Autowired
    OperationMapper operationMapper;
    public List<Operation> selectAllOperation(){
        List<Operation> list = operationMapper.selectAllOperation();
        return list;
    }
}
