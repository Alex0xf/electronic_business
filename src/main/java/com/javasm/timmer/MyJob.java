package com.javasm.timmer;

import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 
 * ClassName: MyJob 
 * @Description: 任务调度 执行的类
 * @author Alex
 * @date 2018年8月9日
 */

public class MyJob {
	
	@Autowired
    IBookService bookService;
	
	public void doJob(){//定时任务 可以链接数据库
		System.out.println("测试dojob");
		List<Book> list=bookService.selectBookList();
		System.out.println(list);
		//HttpClientDemo.testPost();
	}
	
}
