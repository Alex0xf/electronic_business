package com.javasm.book.service;

import java.util.List;

import com.javasm.book.model.Book;

public interface IBookService {
	List<Book> selectBookList();
}
