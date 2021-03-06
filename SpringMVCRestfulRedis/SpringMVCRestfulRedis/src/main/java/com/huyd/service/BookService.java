package com.huyd.service;

import com.huyd.model.Book;

import java.util.List;

/**
 * Author: huyd
 * Date: 2017/9/10 20:01
 * Description:
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();
}