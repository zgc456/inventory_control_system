package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.vo.UserVo;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/21 9:56
 */
public interface UserService {
    /**
     * 判断该用户登陆是否成功
     * @param userVo 用户参数
     * @return
     */
    Result isLogin(UserVo userVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * 判断密码是否与原密码相同
     * @param request
     * @param password 输入的密码
     * @return
     */
    Result verifyPassword(HttpServletRequest request,String password);

    /**
     * 根据用户 id 修改用户密码
     * @param request
     * @param password 用户新密码
     * @return
     */
    Result updatePassword(HttpServletRequest request,String password);
}
