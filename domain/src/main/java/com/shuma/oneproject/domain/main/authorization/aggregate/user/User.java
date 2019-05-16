package com.shuma.oneproject.domain.main.authorization.aggregate.user;

import com.shuma.oneproject.domain.AbstractEntityLong;
import com.shuma.oneproject.domain.main.authorization.aggregate.account.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * 用户实体
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/11
 */
@NoArgsConstructor
public class User extends AbstractEntityLong {

    /**
     * 用户名
     * 用户唯一标识
     */
    @Getter
    @Setter
    private String username;

    /**
     * 手机号
     * 唯一
     */
    @Getter
    @Setter
    private String cellphoneNumber;

    /**
     * 邮箱地址
     * 唯一
     */
    @Getter
    @Setter
    private String emailAddress;

    /**
     * 昵称
     */
    @Getter
    @Setter
    private String nickName;

    /**
     * 性别
     */
    @Getter
    @Setter
    private Gender gender;

    /**
     * 生日
     */
    @Getter
    @Setter
    private LocalDate birthday;

    /**
     * 账号信息
     */
    @Getter
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
        this.account.setId(this.getId());
    }

}
