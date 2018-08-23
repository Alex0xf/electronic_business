package com.javasm.goods.action;

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


}
