package com.neoway.ssmvc.domain;

import java.util.Date;

/**
 * 预约图书实体
 *
 * @author 20190712713
 * @date 2019/8/26 19:02
 */
public class Appointment {


    private long bookId;

    private long studentId;

    private Date appointTime;
    /**
     *唯一复合属性
     */
    private Book book;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
