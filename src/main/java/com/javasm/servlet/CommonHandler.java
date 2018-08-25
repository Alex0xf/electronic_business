package com.javasm.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/common")
public class CommonHandler {

    @RequestMapping("left_side_gifts")
    public String ajaxGiftsLeftPage(HttpServletRequest request, Model model) {

        return "common/left_side_gifts";
    }

    @RequestMapping("left_side_goods")
    public String ajaxGoodsLeftPage(HttpServletRequest request, Model model) {

        return "common/left_side_goods";
    }

}
