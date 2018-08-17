package com.javasm.book.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.javasm.book.dao.BookMapper;
import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;
import com.javasm.redis.RedisDao;


@Service
public class BookServiceImpl implements IBookService{

	Logger log=LogManager.getLogger(BookServiceImpl.class);
	
	@Autowired
	BookMapper bookDao;
/*	@Autowired
	ShardedJedisPool pool;*/
	
	//从spring容器中拿到RedisDao
	//是在redisDaoImpl中通过@Repository注入的
	
	@Autowired
	RedisDao redisDao;
	
	@Override
	public List<Book> selectBookList() {
		//数据 存入 redis
		//先去redis检查 是否有booklist
		String key = "book_list";
		String str = redisDao.getString(key);//json
		log.debug(str);
		//如果有  直接返回
		if(str != null && !str.isEmpty()){
			List<Book> jsonlist = JSONArray.parseArray(str, Book.class);
			log.debug("返回redis里的数据");
		    return jsonlist;
		}
		//如果没有  去数据库查询  存入 redis  并且返回
		List<Book> list = bookDao.selectBookList();

		log.debug("查询数据库 返回list");
		if(list != null && list.size()>0){
			redisDao.setex(key, 60*60, list);
		}
		return list;
	}

	
}
