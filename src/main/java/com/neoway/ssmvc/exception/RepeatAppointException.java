package com.neoway.ssmvc.exception;

/**
 * 重复预约异常
 * @author 20190712713
 * @date 2019/8/26 20:43
 */
public class RepeatAppointException extends RuntimeException {


    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
