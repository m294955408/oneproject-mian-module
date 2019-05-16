package com.shuma.oneproject.api.main.controller;

import com.alibaba.fastjson.JSON;
import com.shuma.oneproject.api.main.vo.LoginVO;
import com.shuma.oneproject.api.main.vo.RegisterVO;
import com.shuma.oneproject.application.main.dto.UserDTO;
import com.shuma.oneproject.application.main.service.UserService;
import com.shuma.oneproject.domain.main.authorization.aggregate.user.Gender;
import com.shuma.oneproject.userinterface.common.authority.AuthorityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 账号服务接口
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/15
 */
@RestController
@RequestMapping ("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @PostMapping ("/register")
    @ResponseBody
    public Boolean register (@RequestBody @Validated RegisterVO registerVO) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(registerVO, userDTO);
        userDTO.setGender(Gender.values()[registerVO.getGender()]);
        userService.register(userDTO, registerVO.getPassword());
        return Boolean.TRUE;
    }

    @PostMapping ("/login")
    @ResponseBody
    public Boolean login (@RequestBody @Validated LoginVO loginVO, HttpSession session) {
        UserDTO user = userService.login(loginVO.getUsername(), loginVO.getPassword());
        AuthorityUtils.login(session, JSON.toJSONString(user));
        return Boolean.TRUE;
    }

}
