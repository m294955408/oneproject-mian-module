package com.shuma.oneproject.domain.main.authorization.aggregate.account;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 账户工厂
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/10
 */
public final class AccountFactory {

    /**
     * 创建账户
     *
     * @param password 账号密码
     * @return
     */
    public static Account create(String password) {
        Account account = new Account();

        // 随机生成盐值
        String salt = RandomStringUtils.randomAlphanumeric(6);
        account.setPasswordSalt(salt);

        // 密码加密存储
        account.encrypted(password);

        return account;
    }

}
