package com.shuma.oneproject.infrastructure.data.main.repository.unitofwork;

import com.shuma.oneproject.domain.main.authorization.aggregate.user.Gender;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.mapper.BaseUserMapper;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model.UserDO;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model.UserDOExample;
import com.shuma.oneproject.infrastructure.data.mybaits.AbstractMybatisUnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户工作单元
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/9
 */
@Component
public class UserUnitOfWork extends AbstractMybatisUnitOfWork<User, UserDO> {

    @Autowired
    private BaseUserMapper userMapper;

    public User getByUsername (String username) {
        UserDOExample example = new UserDOExample();
        example.createCriteria().andUsernameEqualTo(username);
        return getEntityFromDOS(userMapper.selectByExample(example));
    }

    @Override
    protected Class<?> getMapper() {
        return BaseUserMapper.class;
    }

    @Override
    protected UserDO createDO() {
        return new UserDO();
    }

    @Override
    protected  User createEntity() {
        return new User();
    }

    @Override
    protected void convertEntity(UserDO dataObject, User targetEntity) {
        super.convertEntity(dataObject, targetEntity);
        targetEntity.setGender(Gender.values()[dataObject.getGender()]);
    }

    @Override
    protected void convertDO(User entity, UserDO targetDO) {
        super.convertDO(entity, targetDO);
        targetDO.setGender((byte)entity.getGender().ordinal());
    }

}
