package com.zhkj.inventory_control_service.inventory_control_login;

import com.zhkj.inventory_control_api.api.UserService;
import com.zhkj.inventory_control_api.vo.UserVo;
import com.zhkj.inventory_control_dao.entity.UserEntity;
import com.zhkj.inventory_control_dao.mapper.UserMapper;
import com.zhkj.inventory_control_tools.Conver_Type;
import com.zhkj.inventory_control_tools.GetSessionTools;
import com.zhkj.inventory_control_tools.MessageConstant;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/21 10:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result isLogin(UserVo userVo, HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        UserEntity userEntity=new UserEntity();
        userEntity.setUserAccount(userVo.getUserAccount());
        userEntity.setUserPassword(userVo.getUserPassword());
        UserEntity resultUserEntity = userMapper.selectUserToLogin(userEntity);
        if(null != resultUserEntity){
            // session永不过期
            request.getSession().setMaxInactiveInterval(-1);
            // Session 中存储用户信息
            request.getSession().setAttribute("userId",resultUserEntity.getId());
            request.getSession().setAttribute("userName",resultUserEntity.getUserName());
            request.getSession().setAttribute("userAccount",resultUserEntity.getUserAccount());
            request.getSession().setAttribute("userPassword",resultUserEntity.getUserPassword());
            // 选择记住我
            if(userVo.isRememberMe()){

                Cookie userAccountCookie = new Cookie("userAccount",resultUserEntity.getUserAccount());
                Cookie userPasswordCookie = new Cookie("userPassword",resultUserEntity.getUserPassword());
                // 设置过期时间
                userAccountCookie.setMaxAge(60 * 60 * 24);
                userAccountCookie.setPath("/");
                userPasswordCookie.setMaxAge(60 * 60 * 24);
                userAccountCookie.setPath("/");
                response.addCookie(userAccountCookie);
                response.addCookie(userPasswordCookie);
            }else {
                /*
                        没有选择记住我
                        如果 Cookie 中有记录 清空记录
                  */
                Cookie[] cookies = request.getCookies();
                if(null != cookies && cookies.length > 0){
                    for(int i = 0;i < cookies.length;i++){
                        if(resultUserEntity.getUserAccount().equals(cookies[i].getValue())){
                            Cookie userAccountCookie = new Cookie("userAccount","");
                            userAccountCookie.setMaxAge(0);
                            userAccountCookie.setPath("/");
                            response.addCookie(userAccountCookie);
                        }else if(resultUserEntity.getUserPassword().equals(cookies[i].getValue())){
                            Cookie userPasswordCookie = new Cookie("userPassword","");
                            userPasswordCookie.setMaxAge(0);
                            userPasswordCookie.setPath("/");
                            response.addCookie(userPasswordCookie);
                        }
                    }
                }
            }
            result.setSuccess(true);
        }else {
            result.setSuccess(false);
            result.setMessage(MessageConstant.PASSWORD_ACCOUNT_ERROR);
        }
        return result;
    }

    @Override
    public Result verifyPassword(HttpServletRequest request,String password) {
        Result result = new Result();
        String oldPassword = GetSessionTools.getUserPasswordBySession(request);
        if(oldPassword.equals(password)){
            result.setSuccess(true);
        }else {
            result.setSuccess(false);
            result.setMessage(MessageConstant.PASSWORD_DISCREPANCY);
        }
        return result;
    }

    @Override
    public Result updatePassword(HttpServletRequest request,String password) {
        Result result = new Result();
        if(null != password && !password.equals("")){
            int userId = GetSessionTools.getUserIdBySession(request);
            if(userMapper.updatePasswordByUserId(password,userId) > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.PASSWORD_UPDATE_SUCCEED);
            }
        }
        return result;
    }
}
