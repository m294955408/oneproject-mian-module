package com.shuma.oneproject.api.main.vo;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 注册视图对象
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/10
 */
@Data
public class RegisterVO {

    /**
     * 用户名
     */
    @NotBlank (message = "用户名必须输入")
    private String username;

    /**
     * 手机号
     */
    private String cellphoneNumber;

    /**
     * 邮箱
     */
    private String emailAddress;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     * 0 未知
     * 1 男
     * 2 女
     */
    @Min(value = 0, message = "无法识别的性别")
    @Max(value = 2, message = "无法识别的性别")
    private Byte gender;

    /**
     * 密码
     */
    @NotBlank (message = "密码必须输入")
    private String password;

}
