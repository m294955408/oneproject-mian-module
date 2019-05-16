package com.shuma.oneproject.api.main.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录视图对象
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/13
 */
@Data
public class LoginVO {

    /**
     * 用户名
     */
    @NotBlank (message = "用户名必须输入")
    private String username;

    /**
     * 密码
     */
    @NotBlank (message = "密码必须输入")
    private String password;

}
