package com.shuma.oneproject.domain.main.authorization.aggregate.account;

import com.shuma.oneproject.domain.AbstractEntityLong;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

/**
 * 账户实体
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/11
 */
@Data
@NoArgsConstructor
public class Account extends AbstractEntityLong {

    /**
     * 经过加密后的密码
     */
    private String encryptedPassword;

    /**
     * 密码加密所使用的盐值
     */
    private String passwordSalt;

    /**
     * 验证密码是否正确
     * @param password
     * @return
     */
    public boolean validPassword(String password) {
        return doEncrypt(password, this.passwordSalt)
                .equals(this.encryptedPassword);
    }

    /**
     * 密码加密
     * @param password 要加密的密码
     */
    public void encrypted(String password) {
        this.encryptedPassword = doEncrypt(password, this.passwordSalt);
    }

    private String doEncrypt(String password, String salt) {
        if (password == null) {
            throw new IllegalArgumentException ("password is null");
        }

        return DigestUtils.md5DigestAsHex(
                (StringUtils.isEmpty(salt) ? password : password + salt).getBytes());
    }

}
