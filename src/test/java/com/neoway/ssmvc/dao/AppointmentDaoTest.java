package com.neoway.ssmvc.dao;

import com.neoway.ssmvc.domain.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 20190712713
 * @date 2019/8/26 19:50
 */
public class AppointmentDaoTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() {
        long bookId = 1000;
        long studentId = 12345678910L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

}
