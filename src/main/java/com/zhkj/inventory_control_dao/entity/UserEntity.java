package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

public class UserEntity {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userAccount, that.userAccount) &&
                Objects.equals(userPassword, that.userPassword);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, userAccount, userPassword);
    }
}
