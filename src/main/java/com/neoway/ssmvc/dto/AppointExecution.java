package com.neoway.ssmvc.dto;

import com.neoway.ssmvc.domain.Appointment;
import com.neoway.ssmvc.enums.AppointStateEnum;

/**
 * 封装预约执行后的结果
 *
 * @author 20190712713
 * @date 2019/8/26 20:26
 */
public class AppointExecution {


    private long bookId;


    private int state;


    private String stateInfo;


    private Appointment appointment;

    public AppointExecution() {

    }

    /**
     * 预约失败的构造器
     *
     * @param bookId 图书ID
     * @param stateEnum 状态类型
     */
    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /**
     *  预约成功的构造器
     * @param bookId 图书ID
     * @param stateEnum 状态类型
     * @param appointment  预约实体
     */
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }


}
