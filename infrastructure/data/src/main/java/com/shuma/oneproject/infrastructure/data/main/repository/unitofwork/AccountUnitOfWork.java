package com.shuma.oneproject.infrastructure.data.main.repository.unitofwork;

import com.shuma.oneproject.domain.main.authorization.aggregate.account.Account;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.mapper.BaseAccountMapper;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model.AccountDO;
import com.shuma.oneproject.infrastructure.data.mybaits.AbstractMybatisUnitOfWork;
import org.springframework.stereotype.Component;

/**
 * 账号工作单元
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/10
 */
@Component
public class AccountUnitOfWork extends AbstractMybatisUnitOfWork<Account, AccountDO> {

    @Override
    protected Class<?> getMapper() {
        return BaseAccountMapper.class;
    }

    @Override
    protected AccountDO createDO() {
        return new AccountDO();
    }

    @Override
    protected Account createEntity() {
        return new Account();
    }
}
