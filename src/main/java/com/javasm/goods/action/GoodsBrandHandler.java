package com.javasm.goods.action;

import com.javasm.goods.model.GoodsBrand;
import com.javasm.goods.service.IGoodsBrandService;
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
public class GoodsBrandHandler {

    Logger log = LogManager.getLogger(GoodsBrandHandler.class);

    @Autowired
    IGoodsBrandService goodsBrandService;

    @RequestMapping("goods_brand")
    public String jumpGoodsBrandPage(HttpServletRequest request,Model model) {
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
        List<GoodsBrand> goodsBrandList = goodsBrandService.selectGoodsBrandListLimit(pageNum,pageSize);
        model.addAttribute("goodsBrandList", goodsBrandList);
        System.out.println(goodsBrandList);
        return "goods/show_goods_brand";
    }

    @RequestMapping("/goods_brand_ajax")
    @ResponseBody
    public Map<String,Object> getGoodsBrandListByPageNum(HttpServletRequest request, HttpServletResponse response, Model model) {
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
        List<GoodsBrand> goodsBrandList = goodsBrandService.selectGoodsBrandListLimit(pageNum,pageSize);
        Map<String,Object> goodsBrandMap=new HashMap<>();
        goodsBrandMap.put("code",0);
        goodsBrandMap.put("msg","");
        goodsBrandMap.put("count",9);
        model.addAttribute("goodsBrandList", goodsBrandList);
        goodsBrandMap.put("data",goodsBrandList);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsBrandMap;
    }


}
