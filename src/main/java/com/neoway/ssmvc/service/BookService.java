package com.neoway.ssmvc.service;

import com.neoway.ssmvc.domain.Book;
import com.neoway.ssmvc.dto.AppointExecution;

import java.util.List;

/**
 * @author 20190712713
 * @date 2019/8/26 20:54
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId 图书id
     * @return 图书对象
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return 图书对象列表
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId 图书ID
     * @param studentId 学生学号
     * @return 自定义异常
     */
    AppointExecution appoint(long bookId, long studentId);

}
