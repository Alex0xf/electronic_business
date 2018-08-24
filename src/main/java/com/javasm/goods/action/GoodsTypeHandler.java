package com.javasm.goods.action;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.GoodsType;
import com.javasm.goods.service.IGoodsTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsTypeHandler {
    Logger log = LogManager.getLogger(GoodsTypeHandler.class);

    @Autowired
    IGoodsTypeService goodsTypeService;

    @RequestMapping("goods_type")
    public String jumpGoodsTypePage(HttpServletRequest request,Model model) {

        return "goods/show_goods_type";
    }

    @RequestMapping("/goods_type_list")
    @ResponseBody
    public Map<String, Object> selectGoodsType(int page, int pageSize){
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo pager =goodsTypeService.selectGoodsTypeList(page,pageSize);
        //总条数
        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());
        return resultMap;
    }

    //按id删除商品类型
    @RequestMapping("del_goods_type")
    public ModelAndView jumpDeleteGoodsPage(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView();
        int i,delId= 0;
        //delId = Integer.parseInt(request.getParameter("deleteId"));
        try {
            delId = Integer.parseInt(request.getParameter("deleteId"));
        } catch (NumberFormatException e) {
            log.debug("deleteId未获取到");
        }
        if(delId>0){
            log.debug(delId);
            i=goodsTypeService.deleteByPrimaryKey(delId);
            if(i>0){
                mv.addObject("mssg","删除成功");
                log.debug("删除成功");
            }else{
                mv.addObject("mssg","删除失败");
                log.debug("删除失败");
            }
        }
        mv.setViewName("goods/show_goods_type");
        return mv;
    }
    //修改商品类型信息

    @RequestMapping("update_goods_type")
    public ModelAndView jumpUpdateGoodsPage(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView();
        Object type= null;
        String jumpPage=request.getParameter("jumpPage");
        log.debug("jumpPage:xxxx   "+jumpPage);
        int i=0;
        switch (jumpPage){
            case "update_goods_type":{
                //跳转到更新类型属性页面 将当前类型id的属性传过去
                try {
                    type = JSON.parseObject(request.getParameter("goodsType"));
                } catch (Exception e) {
                    log.debug("request.getParameter(\"goodsType\")为空");
                }
                mv.addObject("goodsType",type);
                mv.setViewName("goods/update_goods_type");
                return mv;
            } case "update_goods_type_check":{
                //验证更新的类型属性是否合法
                //拿值
                int goodsTypeId=Integer.parseInt(request.getParameter("goodsType_id"));
                String goodsType_typeName=request.getParameter("goodsType_typeName");
                String goodsType_typeDescribe=request.getParameter("goodsType_typeDescribe");
                //如果合法 更新
                GoodsType goodsType=new GoodsType(goodsTypeId,goodsType_typeName,goodsType_typeDescribe);
                i=goodsTypeService.updateByPrimaryKeySelective(goodsType);
                if(i>0){
                    mv.addObject("mssg","更新成功");
                    log.debug("更新成功");
                }else{
                    mv.addObject("mssg","更新失败");
                    log.debug("更新失败");
                }
                mv.setViewName("goods/show_goods_type");
                return mv;
            }
            default: {
                mv.setViewName("goods/show_goods_type");
                return mv;
            }
        }
    }

    @RequestMapping("add_goods_type")
    public ModelAndView jumpAddGoodsPage(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView();
        String jumpPage=request.getParameter("jumpPage");
        int i=0;
        switch (jumpPage){
            case "add_goods_type":{
                //跳转到新增类型属性页面
                mv.setViewName("goods/add_goods_type");
                return mv;
            } case "add_goods_type_check":{
                //验证新增的类型属性是否合法
                //拿值
                int bid=1;
                int belong=0;
                String goodsType_typeName=request.getParameter("goodsType_typeName");
                String goodsType_typeDescribe=request.getParameter("goodsType_typeDescribe");
                if(request.getParameter("bid")!=null&!request.getParameter("bid").isEmpty()){
                    bid=Integer.parseInt(request.getParameter("bid"));
                }
                if(request.getParameter("belong")!=null&!request.getParameter("belong").isEmpty()){
                    belong=Integer.parseInt(request.getParameter("belong"));
                }
                //如果合法 更新
                GoodsType goodsType=new GoodsType(bid,goodsType_typeName,goodsType_typeDescribe,belong);
                i=goodsTypeService.insertSelective(goodsType);
                if(i>0){
                    mv.addObject("mssg","新增成功");
                    log.debug("新增成功");
                }else{
                    mv.addObject("mssg","新增失败");
                    log.debug("新增失败");
                }
                mv.setViewName("goods/show_goods_type");
                return mv;

            } default: {
                mv.setViewName("goods/show_goods_type");
                return mv;
            }
        }
    }
}
