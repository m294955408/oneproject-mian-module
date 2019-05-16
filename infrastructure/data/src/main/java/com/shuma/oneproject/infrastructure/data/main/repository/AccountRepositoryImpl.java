package com.shuma.oneproject.infrastructure.data.main.repository;

import com.shuma.oneproject.domain.UnitOfWork;
import com.shuma.oneproject.domain.main.authorization.aggregate.account.Account;
import com.shuma.oneproject.infrastructure.data.AbstractRepository;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.AccountUnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 账户仓储
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/10
 */
@Repository
public class AccountRepositoryImpl extends AbstractRepository<Account> {

    @Autowired
    private AccountUnitOfWork unitOfWork;

    @Override
    public UnitOfWork getUnitOfWork() {
        return unitOfWork;
    }

    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }
}
