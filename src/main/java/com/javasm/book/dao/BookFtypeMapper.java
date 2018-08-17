package com.javasm.book.dao;

import com.javasm.book.model.BookFtype;

public interface BookFtypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(BookFtype record);

    int insertSelective(BookFtype record);

    BookFtype selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(BookFtype record);

    int updateByPrimaryKey(BookFtype record);
}