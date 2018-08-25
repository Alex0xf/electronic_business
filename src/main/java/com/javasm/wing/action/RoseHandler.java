package com.javasm.wing.action;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.Dept;
import com.javasm.wing.model.Power;
import com.javasm.wing.model.Rose;
import com.javasm.wing.model.Rose_Power;
import com.javasm.wing.service.IDeptService;
import com.javasm.wing.service.IPowerService;
import com.javasm.wing.service.IRoseService;
import com.javasm.wing.service.IRose_PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("rose")
public class RoseHandler {
    @Autowired
    IRoseService iRoseService;
    @Autowired
    IPowerService iPowerService;
    @Autowired
    IDeptService iDeptService;
    @Autowired
    IRose_PowerService iRose_powerService;
    //只用于roseMange发来的请求
    @RequestMapping("selectAllRoseAndPower")
    @ResponseBody
    public Map<String,Object> selectAllRoseAndPower(int page,int pageSize){

        Map<String,Object> map =new HashMap<>();
        PageInfo pager = iRoseService.findRoseByPage(page,pageSize);
        map.put("total",pager.getTotal());
       map.put("rows",pager.getList());
        return map;
    }

    //写left_side_goods发来的页面请求(这里只分发页面就行)
    @RequestMapping("selectAllRoseAndPower2")
    public String selectAllRoseAndPower2(){
        return "roseManage";
    }

    //    查出所有角色
    @RequestMapping("selectAllRose")
    public String selectAllRose(){
        List<Rose> list = iRoseService.selectAllRose();
        System.out.println("进入了selectAllRose:"+list);
        return "book";
    }
//用于加载角色界面
    @RequestMapping("addRose")
    public ModelAndView addRose(){
        ModelAndView mv = new ModelAndView();
        List<Power> powerList =iPowerService.selectAllPower();
        List<Dept> deptList = iDeptService.selectAllDept();
        mv.addObject("powerList",powerList);
        mv.addObject("deptList",deptList);
        mv.setViewName("addRose");
        return mv;
    }
//    用于验证角色名是否已经存在
    @RequestMapping("addOneRose")
    @ResponseBody
    public Map<String,Object> addOneRose(HttpServletRequest request){
        Map<String,Object> map =new HashMap<>();
        String name =request.getParameter("name");
        String description = request.getParameter("description");
        long power = Long.valueOf(request.getParameter("power"));
        long dept = Long.valueOf(request.getParameter("dept"));
        String state = request.getParameter("state");
        Rose rose =new Rose(name,description,state,dept);
        List<Rose> list =iRoseService.selectByName(name);
        if(list!=null) {
            if (list.size() > 0) {
                map.put("success", "false");
            }else{
                iRoseService.insertSelective(rose);
                List<Rose> list2 =iRoseService.selectByName(name);
                long roseKey = list2.get(0).getId();
                iRose_powerService.insertSelective(new Rose_Power(roseKey,power));
                map.put("success", "true");
            }
        }else{
            iRoseService.insertSelective(rose);
            List<Rose> list2 =iRoseService.selectByName(name);
            long roseKey = list2.get(0).getId();
            iRose_powerService.insertSelective(new Rose_Power(roseKey,power));
            map.put("success", "true");
            map.put("success", "true");
        }
        return map;
    }
}
