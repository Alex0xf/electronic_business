package com.javasm.wing.action;

import com.github.pagehelper.PageInfo;
import com.javasm.wing.model.*;
import com.javasm.wing.service.*;
import com.javasm.wing.utils.IpGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller@RequestMapping("user")
public class UserHandler {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IDeptService iDeptService;
    @Autowired
    IJobService iJobService;
    @Autowired
    IUserService iUserService;
    @Autowired
    IRoseService iRoseService;


    @RequestMapping("login")
    public String login(){
        return "userIndex";
    }

//    查出所有用户信息,还没有分页(点击用户管理)
    @RequestMapping("selectAllUser")
    @ResponseBody
    public Map<String, Object> selectAllUser(int page, int pageSize){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        PageInfo pager =iEmployeeService.findUserByPage(page,pageSize);
        //总条数

        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());


        return resultMap;

    }

    //写left_side_goods发来的页面请求(这里只分发页面就行)
    @RequestMapping("selectAllUser2")
    public String selectAllUser2(){
        return "userManage";
    }

    //添加用户(用于加载添加界面)
    @RequestMapping("addUser")
    public ModelAndView addUser(){
        ModelAndView mv = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        List<Dept> deptList =iDeptService.selectAllDept();
        List<Job> jobList = iJobService.selectAllJob();
        List<Employee> empolyeeList = iEmployeeService.selectAllEmployee();
        List<Rose> roseList = iRoseService.selectAllRose();
        mv.addObject("deptList",deptList);
        mv.addObject("jobList",jobList);
        mv.addObject("empolyeeList",empolyeeList);
        mv.addObject("roseList",roseList);
        mv.setViewName("addUser");

        return mv;
    }
//单纯判断用户名是否已存在
@RequestMapping(value="checkUser" ,method = RequestMethod.POST)
@ResponseBody
public Map<String,Object>  checkUser(HttpServletRequest request){
    Map<String,Object> map = new HashMap<>();
    String userName= request.getParameter("userName");
    User user =iUserService.selectByLogName(userName);
    if(user==null){

            map.put("success","true");

    }else{
        map.put("success","false");

    }

    return map;
}

    //添加一个用户
    @RequestMapping(value="addOneUser" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object>  addOneUser(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
       String userName= request.getParameter("userName");
        User user =iUserService.selectByLogName(userName);
        if(user==null){
            String password = request.getParameter("password");
            int sex = Integer.valueOf(request.getParameter("sex"));
            int state = Integer.valueOf(request.getParameter("userState"));
            String phoneNumber = request.getParameter("phoneNumber");
            String email = request.getParameter("email");
            String rmark1 = request.getParameter("remark1");
            String rmark2 = request.getParameter("remark2");
            String rmark3 = request.getParameter("remark3");
            String rmark4 = request.getParameter("remark4");
            String rmark5 = request.getParameter("remark5");
            User user1 = new User();
            user1.setLogname(userName);
            user1.setPassword(password);
            user1.setState(state);
            user1.setPhoneNumber(phoneNumber);
            user1.setEmail(email);
            user1.setRemark1(rmark1);
            user1.setRemark2(rmark2);
            user1.setRemark3(rmark3);
            user1.setRemark4(rmark4);
            user1.setRemark5(rmark5);
            int num =iUserService.insertSelective(user1);
            if (num>0){
                map.put("success","true");
            }else {
                map.put("success","false");
            }
        }else{
            map.put("success","false");

        }
        System.out.println(user==null);
        return map;
    }

//查出所有部门
    @RequestMapping("selectAllDept")
    public  String selectAllDept(){
        List<Dept> list =iDeptService.selectAllDept();
        System.out.println("进入了selectAllDept:"+list);
        return "book";
    }
//查出所有职务
    @RequestMapping("selectAllJob")
    public String selectAllJob(){
        List<Job> list = iJobService.selectAllJob();
        System.out.println("进入了selectAllJob:"+list);
        return "book";
    }
//根据登陆登陆名查出一个User备用(1.注册不允许重复用户名  2.登陆时校验用户名和密码,还有账户有效状态,之后才可 登陆)
//或者说下面写的没用,直接就是在redis里查,不进数据库(用户名和密码都存数据库里)
    @RequestMapping("selectByLogName")
    public String selectByLogName(String logName,String password,HttpServletRequest request){
        String string =IpGetter.getLocalIp(request);
        System.out.println(string);
        User user =iUserService.selectByLogName(logName);
        System.out.println(user);
        return "book";
    }
}
