package com.zhkj.inventory_control_tools;

import javax.servlet.http.HttpServletRequest;

public class GetSessionTools {
    /**
     * 获取用户 id
     * @param request
     * @return
     */
    public static Integer getUserIdBySession(HttpServletRequest request){
        int userId = (int) request.getSession().getAttribute("userId");
        return Integer.valueOf(userId);
    }

    /**
     * 获取用户名称
     * @param request
     * @return
     */
    public static String getUserNameBySession(HttpServletRequest request){
        String userName = (String) request.getSession().getAttribute("userName");
        return userName;
    }

    /**
     * 获取用户登录名称
     * @param request
     * @return
     */
    public static String getUserAccountBySession(HttpServletRequest request){
        String userAccount = (String) request.getSession().getAttribute("userAccount");
        return userAccount;
    }

    /**
     * 获取用户密码
     * @param request
     * @return
     */
    public static String getUserPasswordBySession(HttpServletRequest request){
        String userPassword = (String) request.getSession().getAttribute("userPassword");
        return userPassword;
    }
}
