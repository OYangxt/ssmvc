package com.neoway.ssmvc.dao;


import com.neoway.ssmvc.domain.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById() {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll() {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber() {
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }

}