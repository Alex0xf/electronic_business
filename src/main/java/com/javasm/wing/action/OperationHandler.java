package com.javasm.wing.action;

import com.javasm.wing.model.Operation;
import com.javasm.wing.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("operation")
public class OperationHandler {
    @Autowired
    IOperationService iOperationService;
    @RequestMapping("selectAllOperation")
    public  String selectAllOperation(){
        List<Operation> list = iOperationService.selectAllOperation();
        System.out.println(list);
        return "book";
    }
}

