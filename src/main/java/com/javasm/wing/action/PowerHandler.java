package com.javasm.wing.action;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Power;
import com.javasm.wing.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("power")
public class PowerHandler {
    @Autowired
    IPowerService iPowerService;

    @RequestMapping("selectAllPower")
    public String selectAllPower(){
        List<Power> list = iPowerService.selectAllPower();
        System.out.println(list);
        return "book";
    }
    @RequestMapping("selectAllPowerAndRose")
    @ResponseBody
    public Map<String,Object> selectAllPowerAndRose(int page,int pageSize){
        Map<String,Object> map =new HashMap<>();
        PageInfo pager = iPowerService.findPowerByPage(page,pageSize);
        map.put("total",pager.getTotal());
        map.put("rows",pager.getList());
        return map;
    }

    //写left_side_goods发来的页面请求(这里只分发页面就行)
    @RequestMapping("selectAllPowerAndRose2")
    public String selectAllRoseAndPower2(){
        return "powerManage";
    }
}
