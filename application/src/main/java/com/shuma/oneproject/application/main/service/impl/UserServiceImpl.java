package com.shuma.oneproject.application.main.service.impl;

import com.shuma.oneproject.application.AbstractService;
import com.shuma.oneproject.application.main.dto.UserDTO;
import com.shuma.oneproject.application.main.exception.LoginException;
import com.shuma.oneproject.application.main.service.UserService;
import com.shuma.oneproject.domain.Repository;
import com.shuma.oneproject.domain.main.authorization.aggregate.account.Account;
import com.shuma.oneproject.domain.main.authorization.aggregate.account.AccountFactory;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/8
 */
@Service
public class UserServiceImpl extends AbstractService<User, UserDTO> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Repository<Account> accountRepository;

    @Transactional
    @Override
    public void register(UserDTO user, String password) {
        User userEntity = createEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.insert(userEntity);

        userEntity.setAccount(AccountFactory.create(password));
        accountRepository.insert(userEntity.getAccount());
    }

    @Override
    public UserDTO login(String loginName, String password) {
        User user = userRepository.getByUsername(loginName);
        if (null == user) {
            throw new LoginException("用户名不存在");
        }
        Account account = accountRepository.get(user.getId());
        user.setAccount(account);
        if (!account.validPassword(password)) {
            throw new LoginException("密码错误");
        }

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    @Override
    protected User createEntity() {
        return new User();
    }

    @Override
    protected UserDTO createEntityDTO() {
        return new UserDTO();
    }

}
