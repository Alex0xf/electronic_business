package com.javasm.goods.action;

import com.github.pagehelper.PageInfo;
import com.javasm.goods.service.IGoodsBrandService;
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
public class GoodsBrandHandler {

    Logger log = LogManager.getLogger(GoodsBrandHandler.class);

    @Autowired
    IGoodsBrandService goodsBrandService;

    @RequestMapping("goods_brand")
    public String jumpGoodsBrandPage(HttpServletRequest request,Model model) {

        return "goods/show_goods_brand";
    }

    @RequestMapping("/goods_brand_list")
    @ResponseBody
    public Map<String, Object> selectGoodsBrand(int page, int pageSize){
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo pager =goodsBrandService.selectGoodsBrandList(page,pageSize);
        //总条数
        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());
        return resultMap;
    }


}
