package com.shuma.oneproject.api.main.controller;

import com.shuma.oneproject.application.main.dto.UserDTO;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.User;
import com.shuma.oneproject.userinterface.controller.ApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务接口
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/15
 */
@RestController
@RequestMapping ("/user")
public class UserController extends ApiController<User, UserDTO> {

}
