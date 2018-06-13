package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.vo.UserVo;
import com.zhkj.inventory_control_service.inventory_control_login.UserServiceImpl;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result toLogin(HttpServletRequest request,HttpServletResponse response,String json){
        UserVo userVo = JSON.parseObject(json,UserVo.class);
        return userService.isLogin(userVo,request,response);
    }
}
