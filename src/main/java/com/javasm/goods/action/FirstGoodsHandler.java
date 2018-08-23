package com.javasm.goods.action;

import com.alibaba.fastjson.JSON;
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

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class FirstGoodsHandler {
    Logger log = LogManager.getLogger(ProductHandler.class);

    @Autowired
    IFirstGoodsService firstGoodsService;

    @RequestMapping("creat_first_goods")
    public String jumpIndexPage(HttpServletRequest request,Model model) {
        Object product=JSON.parseObject(request.getParameter("product"));
        if(product!=null){
           model.addAttribute("product",product);
        }else{
            model.addAttribute("product","xxx");
        }
        return "goods/creat_first_goods";
    }
    @RequestMapping("first_goods")
    public String jumpFirstGoodsPage(Model model) {
        List<FirstGoods> firstGoodsList=firstGoodsService.selectFirstGoodsListWithProduct();
        model.addAttribute("firstGoodsList", firstGoodsList);
        return "goods/show_goods";
    }

}
