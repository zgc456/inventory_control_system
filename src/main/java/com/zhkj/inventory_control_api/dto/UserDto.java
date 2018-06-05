package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 用户表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class UserDto {
    private int id;
    private String userName;
    private String userAccount;
    private String userPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
