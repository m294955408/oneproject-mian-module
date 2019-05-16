package com.shuma.oneproject.application.main.exception;

/**
 * 登录异常
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/14
 */
public final class LoginException extends RuntimeException {

    public LoginException (String errorMessage) {
        super (errorMessage);
    }

}
