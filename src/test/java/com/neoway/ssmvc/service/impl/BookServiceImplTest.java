package com.neoway.ssmvc.service.impl;

import com.neoway.ssmvc.dao.BaseTest;
import com.neoway.ssmvc.dto.AppointExecution;
import com.neoway.ssmvc.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() {
        long bookId = 1003;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }


}