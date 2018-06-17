package com.zhkj.inventory_control_tools;

public class MessageConstant {
    /**
     *  错误信息
     */
    public static final String PASSWORD_ACCOUNT_ERROR = "用户名或密码错误";
    public static final String PASSWORD_DISCREPANCY = "输入密码与原密码不相符";
    public static final String USER_PASSWORD_EXCEPTION = "用户密码与原密码不相符";
    /**
     * 信息提示
     */
    public static final String PASSWOR_UPDATE_SUCCEED = "修改密码成功,您需要重新登录";
    /**
     * 消息类型
     *      1.后台消息
     *      2.库存预警
     *      3.系统消息
     */
    public static final Integer BACKGROUND_MESSAGE = Integer.valueOf(1);
    public static final Integer INVENTORY_EARLY_WARNING = Integer.valueOf(2);
    public static final Integer SYSTEM_MESSAGE = Integer.valueOf(3);
}
