package com.shuma.oneproject.infrastructure.data.main.repository;

import com.shuma.oneproject.domain.UnitOfWork;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.UserRepository;
import com.shuma.oneproject.infrastructure.data.AbstractRepository;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.UserUnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 用户仓储
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/8
 */
@Repository
public class UserRepositoryImpl extends AbstractRepository<User> implements UserRepository {

    @Autowired
    UserUnitOfWork userUnitOfWork;

    @Override
    public User getByUsername(String username) {
        return userUnitOfWork.getByUsername(username);
    }

    @Override
    public UnitOfWork getUnitOfWork() {
        return userUnitOfWork;
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

}
