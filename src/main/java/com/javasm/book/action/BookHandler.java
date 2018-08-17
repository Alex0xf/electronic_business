package com.javasm.book.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookHandler {
    Logger log = LogManager.getLogger(BookHandler.class);

    @Autowired
    IBookService bookService;

    @RequestMapping("list")
    public String jumpListPage(Integer pageNum, Integer pageSize, Model model) {
        if (pageNum == null || pageNum == 0) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        PageHelper.startPage(pageNum, pageSize);
        //pageNum当前页数，第二个参数是每页多少条
        List<Book> list = bookService.selectBookList();
        //model.addAttribute("bookList",list);
        //查询的数据放在分页对象里
        PageInfo<Book> p = new PageInfo<>(list);
        model.addAttribute("page", p);
        log.debug("Debug日志测试");
        log.info("info级别的日志");
        log.error("error级别日志");
        //JSON格式的时候只需要返回这个page对象即可 page中有list属性
        return "book/list";
    }

    @RequestMapping("/listAjax")
    @ResponseBody
    public PageInfo<Book> getJSONList(Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageNum == 0) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Book> list = bookService.selectBookList();
        //查询的数据放在分页对象里
        PageInfo<Book> p = new PageInfo<>(list);

        return p;
    }

}
