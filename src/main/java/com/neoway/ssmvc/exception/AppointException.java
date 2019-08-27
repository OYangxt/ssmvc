package com.neoway.ssmvc.exception;

/**
 * 预约业务异常
 *
 * @author 20190712713
 * @date 2019/8/26 20:44
 */
public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
