package com.shuma.oneproject.domain.main.authorization.aggregate.role;

import com.shuma.oneproject.domain.AbstractEntityLong;
import lombok.Getter;
import lombok.Setter;

/**
 * 角色实体
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/15
 */
public class Role extends AbstractEntityLong {

    @Setter
    @Getter
    private String name;

}
