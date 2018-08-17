package com.javasm.goodsAndGifts.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.book.action.BookHandler;
import com.javasm.book.model.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/goodsAndGifts")
public class TestHandler {
    Logger log = LogManager.getLogger(TestHandler.class);

    @RequestMapping("index")
    public String jumpIndexPage(Model model) {
        log.debug("Debug日志测试");
        log.info("info级别的日志");
        log.error("error级别日志");
        return "goodsAndGifts/index";
    }

}
