package com.javasm.goods.service;

import com.javasm.goods.model.FirstProduct;

import java.awt.print.Book;
import java.util.List;

public interface IProductService {

    List<FirstProduct> selectProductList();
}
