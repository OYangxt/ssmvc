package com.neoway.ssmvc.enums;

/**
 * @author 20190712713
 */
public enum AppointStateEnum {
    /**
     * SUCCESS：图书预约成功，状态码为1
     */
    SUCCESS(1, "预约成功"),
    /**
     * NO_NUMBER: 图书苦楚不足，状态码为0
     */
    NO_NUMBER(0, "库存不足"),
    /**
     * REPEAT_APPOINT: 重复预约，状态码为-1
     */
    REPEAT_APPOINT(-1, "重复预约"),
    /**
     * INNER_ERROR: 系统异常，状态码为-2
     */
    INNER_ERROR(-2, "系统异常");

    private int state;

    private String stateInfo;

    AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AppointStateEnum stateOf(int index) {
        for (AppointStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
