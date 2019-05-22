package com.shuma.oneproject.infrastructure.data.main.repository;

import com.shuma.oneproject.domain.UnitOfWork;
import com.shuma.oneproject.domain.main.authorization.aggregate.account.Account;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.UserRepository;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.AccountUnitOfWork;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.UserUnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.Optional;

/**
 * 用户仓储
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/8
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    UserUnitOfWork userUnitOfWork;

    @Autowired
    AccountUnitOfWork accountUnitOfWork;

    @Override
    public User getByUsername(String username) {
        User user = userUnitOfWork.getByUsername(username);
        Optional.of(user).ifPresent(item -> item.setAccount(getAccount(item.getId())));
        return user;
    }

    @Override
    public UnitOfWork getUnitOfWork() {
        return userUnitOfWork;
    }

    @Override
    public User get(Object id) {
        User user = userUnitOfWork.selectByPrimaryKey(id, User.class);
        Optional.of(user).ifPresent(item -> item.setAccount(getAccount(item.getId())));
        return user;
    }

    @Override
    public Collection<User> getAll() {
        throw new IllegalStateException("不支持查询全部信息接口");
    }

    @Override
    public void insert(User item) {
        Assert.notNull(item, "item is null!");
        userUnitOfWork.insert(item);
        Optional.of(item.getAccount()).ifPresent(account -> account.setId(item.getId()));
        accountUnitOfWork.insert(item.getAccount());
    }

    @Override
    public void insert(Collection<User> items) {
        Optional.of(items).ifPresent(list -> list.forEach(this::insert));
    }

    @Override
    public void delete(User item) {
        throw new IllegalStateException("不支持删除接口");
    }

    @Override
    public void delete(Collection<User> items) {
        throw new IllegalStateException("不支持删除接口");
    }

    @Override
    public void update(User item) {
        Assert.notNull(item, "item is null");
        userUnitOfWork.update(item);
        accountUnitOfWork.update(item.getAccount());
    }

    @Override
    public void update(Collection<User> items) {
        Optional.of(items).ifPresent(list -> list.forEach(this::update));
    }

    private Account getAccount(Long userId) {
        return accountUnitOfWork.selectByPrimaryKey(userId, Account.class);
    }

}
