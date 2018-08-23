package com.javasm.goods.action;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IFirstGoodsService;
import com.javasm.goods.service.IProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class FirstGoodsHandler {
    Logger log = LogManager.getLogger(ProductHandler.class);

    @Autowired
    IFirstGoodsService firstGoodsService;

    //显示页面
    @RequestMapping("first_goods")
    public String jumpFirstGoodsPage(Model model) {

        return "goods/show_goods";
    }

    //返回数据 分页
    @RequestMapping("/first_goods_list")
    @ResponseBody
    public Map<String, Object> selectALLFirstGoods(int page, int pageSize){
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo pager =firstGoodsService.selectFirstGoodsListWithProduct(page,pageSize);
        //总条数
        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());
        return resultMap;
    }


    @RequestMapping("creat_first_goods")
    public String jumpCreatFirstGoodsPage(HttpServletRequest request,Model model) {
        Object product=JSON.parseObject(request.getParameter("product"));
        if(product!=null){
           model.addAttribute("product",product);
        }else{
            model.addAttribute("product","xxx");
        }
        return "goods/creat_first_goods";
    }


}
