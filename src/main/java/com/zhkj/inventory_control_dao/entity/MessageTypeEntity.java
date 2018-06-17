package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

public class MessageTypeEntity {
    private int id;
    private String messageTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageTypeName() {
        return messageTypeName;
    }

    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName;
    }

}