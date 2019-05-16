package com.shuma.oneproject.domain.main.authorization.aggregate.user;

import com.shuma.oneproject.domain.Repository;

/**
 * 用户仓储接口
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/10
 */
public interface UserRepository extends Repository<User> {

    /**
     * 根据用户名获取用户
     *
     * @param username 用户名
     * @return 用户
     */
    User getByUsername (String username);

}
