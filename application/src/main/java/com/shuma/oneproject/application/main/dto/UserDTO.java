package com.shuma.oneproject.application.main.dto;

import com.shuma.oneproject.domain.main.authorization.aggregate.user.Gender;
import lombok.Data;

/**
 * 用户数据传输对象
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/15
 */
@Data
public class UserDTO {

    private Long id;

    /**
     * 用户名
     */
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
     */
    private Gender gender;

}
