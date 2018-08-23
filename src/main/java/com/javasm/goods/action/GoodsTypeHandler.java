package com.javasm.goods.action;

import com.javasm.goods.model.GoodsType;
import com.javasm.goods.service.IGoodsTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        Integer pageNum,pageSize;
        if(request.getParameter("pageNum")!=null&&request.getParameter("pageSize")!=null){
            pageNum=Integer.parseInt(request.getParameter("pageNum"));
            pageSize=Integer.parseInt(request.getParameter("pageSize"));
        }else{
            pageNum=1;
            pageSize=5;
        }
        pageNum=(pageNum-1)*pageSize;
        System.out.println(pageNum+"------"+pageSize);
        List<GoodsType> goodsTypeList = goodsTypeService.selectGoodsTypeListLimit(pageNum,pageSize);
        model.addAttribute("goodsTypeList", goodsTypeList);
        System.out.println(goodsTypeList);
        return "goods/show_goods_type";
    }

    @RequestMapping("/goods_type_ajax")
    @ResponseBody
    public Map<String,Object> getGoodsTypeListByPageNum(HttpServletRequest request, HttpServletResponse response, Model model) {
        Integer pageNum,pageSize;
        if(request.getParameter("pageNum")!=null&&request.getParameter("pageSize")!=null){
            pageNum=Integer.parseInt(request.getParameter("pageNum"));
            pageSize=Integer.parseInt(request.getParameter("pageSize"));
        }else{
            pageNum=1;
            pageSize=5;
        }
        pageNum=(pageNum-1)*pageSize;
        System.out.println(pageNum+"------"+pageSize);
        List<GoodsType> goodsTypeList = goodsTypeService.selectGoodsTypeListLimit(pageNum,pageSize);
        Map<String,Object> goodsTypeMap=new HashMap<>();
        goodsTypeMap.put("code",0);
        goodsTypeMap.put("msg","");
        goodsTypeMap.put("count",12);
        model.addAttribute("goodsTypeList", goodsTypeList);
        goodsTypeMap.put("data",goodsTypeList);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsTypeMap;
    }

}
