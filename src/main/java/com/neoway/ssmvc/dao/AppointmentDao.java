package com.neoway.ssmvc.dao;

import com.neoway.ssmvc.domain.Appointment;
import org.apache.ibatis.annotations.Param;

/**
 * 预约DAO
 * @author 20190712713
 * @date 2019/8/26
 */
public interface AppointmentDao {

    /**
     * 插入预约图书记录
     *
     * @param bookId 图书ID
     * @param studentId 学生学号
     * @return 插入的行数
     */
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     *
     * @param bookId 图书id
     * @param studentId 学生id
     * @return 预约实体记录
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

}
