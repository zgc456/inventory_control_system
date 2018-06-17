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
import java.util.Enumeration;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 用户登录
     * @param request
     * @param response
     * @param json 登录信息
     *            userAccount:登录名
     *             userPassword:密码
     *             rememberMe:是否记住我
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result toLogin(HttpServletRequest request,HttpServletResponse response,String json){
        UserVo userVo = JSON.parseObject(json,UserVo.class);
        return userService.isLogin(userVo,request,response);
    }

    /**
     * 登出当前账号
     * @param request
     * @return
     */
    @RequestMapping(value = "/loginOut",method = RequestMethod.GET)
    public Result loginOut(HttpServletRequest request){
        Result result = new Result();
        try {
            Enumeration em = request.getSession().getAttributeNames();
            while (em.hasMoreElements()){
                request.getSession().removeAttribute(em.nextElement().toString());
            }
            result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 修改密码
     * @param request
     * @return
     */
    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    public Result updatePassword(HttpServletRequest request,String password){
        return userService.updatePassword(request,password);
    }

    /**
     * 验证输入密码是否与数据库密码相同
     * @param request
     * @return
     */
    @RequestMapping(value = "/verifyPassword",method = RequestMethod.POST)
    public Result verifyPassword(HttpServletRequest request,String password){
        return userService.verifyPassword(request,password);
    }
}
