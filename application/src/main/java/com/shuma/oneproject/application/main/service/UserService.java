package com.shuma.oneproject.application.main.service;

import com.shuma.oneproject.application.Service;
import com.shuma.oneproject.application.main.dto.UserDTO;
import com.shuma.oneproject.application.main.exception.LoginException;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;

/**
 * 用户服务
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/8
 */
public interface UserService extends Service<User, UserDTO> {

    /**
     * 注册
     *
     * @param user 用户信息
     * @param password 密码
     */
    void register(UserDTO user, String password);

    /**
     * 登录
     *
     * @param loginName 登录名称
     * @param password 密码
     * @throws LoginException 登录异常，登录失败时会抛出
     * @return 登录用户信息，登录成功后会返回
     */
    UserDTO login(String loginName, String password) throws LoginException;

}
