package com.javasm.wing.action.business;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.SystemLogger;
import com.javasm.wing.service.ISystemLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("systemLogger")
public class SystemLoggerHandler {
    @Autowired
    ISystemLoggerService iSystemLoggerService;
    //写left_side_goods发来的页面请求(这里只分发页面就行)
    @RequestMapping("selectAllLogger2")
    public String selectAllLogger2(){

        return "loggerManage";
    }

    @RequestMapping("selectAllLogger")
    @ResponseBody
    public Map<String,Object> selectAllLogger(int page, int pageSize){
        Map<String,Object> map =new HashMap<>();
        PageInfo<SystemLogger> pager =   iSystemLoggerService.findSysteLoggerByPage(page,pageSize);
        map.put("total",pager.getTotal());
        map.put("rows",pager.getList());
        return map;
    }
}
