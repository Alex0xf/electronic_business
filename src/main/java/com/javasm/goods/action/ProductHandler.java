package com.javasm.goods.action;

import com.github.pagehelper.PageInfo;
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
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class ProductHandler {
    Logger log = LogManager.getLogger(ProductHandler.class);

    @Autowired
    IProductService productService;


    @RequestMapping("first_product")
    public String jumpIndexPage(HttpServletRequest request,Model model) {

        return "goods/first_product";
    }

    @RequestMapping("/first_product_list")
    @ResponseBody
    public Map<String, Object> selectALLFirstproduct(int page, int pageSize){
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo pager =productService.selectProductList(page,pageSize);
        //总条数
        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());
        return resultMap;
    }


   /* @RequestMapping("/first_product_table")
    @ResponseBody
    public  Map<String,Object> refreshProductTablePage(HttpServletRequest request,HttpServletResponse response,Model model) {
        Integer pageNum,pageSize;
        if(request.getParameter("pageNum")!=null&&request.getParameter("pageSize")!=null){
            pageNum=Integer.parseInt(request.getParameter("pageNum"));
            pageSize=Integer.parseInt(request.getParameter("pageSize"));
        }else{
            pageNum=1;
            pageSize=5;
        }
        pageNum=(pageNum-1)*pageSize;
        List<FirstProduct> firstProductList = productService.selectProductListLimit(pageNum,pageSize);
        Map<String,Object> firstProductMap=new HashMap<>();
        firstProductMap.put("code",0);
        firstProductMap.put("msg","");
        firstProductMap.put("count",12);
        //List<FirstProduct> firstProductList = productService.selectProductListLimit(pageNum,pageSize);
        model.addAttribute("productsList", firstProductList);
        firstProductMap.put("data",firstProductList);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return firstProductMap;
    }*/

   /*@RequestMapping("/first_product_list")
   @ResponseBody
    public  Map<String,Object> jumpIndexPage(HttpServletResponse response) {
        List<FirstProduct> firstProductList = productService.selectProductList();
        Map<String,Object> firstProductMap=new HashMap<>();
        firstProductMap.put("code",0);
        firstProductMap.put("msg","");
        firstProductMap.put("count",12);
      *//* for (FirstProduct product: firstProductList) {
           int brand_id=product.getGoodsBrand().getId();
           product.setBrandId(brand_id);
       }*//*
       firstProductMap.put("data",firstProductList);
       response.setHeader("Access-Control-Allow-Origin", "*");
       return firstProductMap;
    }*/
}
