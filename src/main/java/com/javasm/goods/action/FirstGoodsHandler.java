package com.javasm.goods.action;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.model.FirstGoods;
import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.model.GoodsType;
import com.javasm.goods.service.IFirstGoodsService;
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
    public Map<String, Object> selectALLFirstGoods(int page, int pageSize) {
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo pager = firstGoodsService.selectFirstGoodsListWithProduct(page, pageSize);
        //总条数
        resultMap.put("total", pager.getTotal());
        //获取每页数据
        resultMap.put("rows", pager.getList());
        return resultMap;
    }


    @RequestMapping("add_first_goods")
    public ModelAndView jumpAddFirstGoodsPage(HttpServletRequest request, Model model) {
        ModelAndView mv = new ModelAndView();
        String jumpPage = request.getParameter("jumpPage");
        int i = 0;
        switch (jumpPage) {
            case "add_first_goods": {
                //跳转到新增一类商品页面
                //传递一类产品的属性
                Object product=JSON.parseObject(request.getParameter("product"));
                if(product!=null){
                    model.addAttribute("product",product);
                }else{
                    model.addAttribute("product","xxx");
                }
                mv.setViewName("goods/add_first_goods");
                return mv;
            }   case "add_first_goods_check": {
                //验证新增的一类商品是否合法
                //拿值
                String goodsName=request.getParameter("goods_name");//商品名称
                int num=Integer.parseInt(request.getParameter("num"));//最低库存
                int goodsTid=Integer.parseInt(request.getParameter("goods_tid"));//一类商品类型id
                int attribute=0;
                int firstPid=Integer.parseInt(request.getParameter("product_id"));//对应的一类产品id
                Double buyPrice=Double.parseDouble(request.getParameter("buy_price"));//采购价
                Double marketPrice=Double.parseDouble(request.getParameter("market_price"));//市场价
                Double salesPrice=Double.parseDouble(request.getParameter("sales_price"));//商城价
                int isBuy=Integer.parseInt(request.getParameter("is_buy"));//是否可采购 0可采购（默认） 1不可
                //将值放入对象
                FirstGoods firstGoods=new FirstGoods(goodsName,num,goodsTid,attribute,firstPid,buyPrice,marketPrice,salesPrice,isBuy);
                if(firstGoods!=null){
                    //如果合法 更新
                    i=firstGoodsService.insertSelective(firstGoods);
                    if(i>0){
                        mv.addObject("mssg","新增成功");
                        log.debug("新增成功");
                    }else{
                        mv.addObject("mssg","新增失败");
                        log.debug("新增失败");
                    }
                }
                mv.setViewName("goods/show_goods");
                return mv;
            } default: {
                mv.setViewName("goods/show_goods");
                return mv;
            }


        }


    }
}