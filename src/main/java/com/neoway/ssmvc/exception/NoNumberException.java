package com.neoway.ssmvc.exception;

/**
 * 库存不足异常
 * @author 20190712713
 * @date 2019/8/26 20:43
 */
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
