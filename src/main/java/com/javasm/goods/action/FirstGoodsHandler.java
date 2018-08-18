package com.javasm.goods.action;

import com.javasm.goods.model.FirstProduct;
import com.javasm.goods.service.IProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class FirstGoodsHandler {
    Logger log = LogManager.getLogger(ProductHandler.class);

    @RequestMapping("creat_first_goods")
    public String jumpIndexPage(Model model) {
        log.debug("Debug日志测试");
        return "goods/creat_first_goods";
    }

}
