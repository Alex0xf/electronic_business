package com.javasm.goods.action;

import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IProductService;
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
public class ProductHandler {
    Logger log = LogManager.getLogger(ProductHandler.class);

    @Autowired
    IProductService productService;

    @RequestMapping("first_product")
    public String jumpIndexPage(Model model) {
        log.debug("Debug日志测试");
        List<FirstProduct> firstProductList = productService.selectProductList();
        model.addAttribute("productsList", firstProductList);
        return "goods/first_product";
    }
   @RequestMapping("/first_product_list")
   @ResponseBody
    public  Map<String,Object> jumpIndexPage(HttpServletResponse response) {
        List<FirstProduct> firstProductList = productService.selectProductList();
        Map<String,Object> firstProductMap=new HashMap<>();
        firstProductMap.put("code",0);
        firstProductMap.put("msg","");
        firstProductMap.put("count",13);
      /* for (FirstProduct product: firstProductList) {
           int brand_id=product.getGoodsBrand().getId();
           product.setBrandId(brand_id);
       }*/
       firstProductMap.put("data",firstProductList);
       response.setHeader("Access-Control-Allow-Origin", "*");
       return firstProductMap;
    }

}
