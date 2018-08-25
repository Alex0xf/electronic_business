package com.javasm.wing.action;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Ip;
import com.javasm.wing.service.IIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ip")
public class IpHandler {
    @Autowired
    IIpService iIpService;
//    查出所有ip段
    @RequestMapping("selectAllIp")
    public String selectAllIp(){
        List<Ip> list = iIpService.selectAllIp();
        System.out.println(list);
        return "book";
    }
//    查出
@RequestMapping("selectAllIpDeptEmployee")
@ResponseBody
public Map<String,Object> selectAllIpDeptEmployee(int page, int pageSize){
    Map<String,Object> map =new HashMap<>();
    PageInfo pager = iIpService.findIpDeptEmployeeByPage(page,pageSize);
    map.put("total",pager.getTotal());
    map.put("rows",pager.getList());
    return map;
}


    //写left_side_goods发来的页面请求(这里只分发页面就行)
    @RequestMapping("selectAllIpDeptEmployee2")
    public String selectAllRoseAndPower2(){
        return "ipManage";
    }
}
