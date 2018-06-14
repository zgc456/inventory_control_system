package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/14 9:11
 */
public class MessagetypeEntity {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagetypeEntity that = (MessagetypeEntity) o;
        return id == that.id &&
                Objects.equals(messageTypeName, that.messageTypeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, messageTypeName);
    }
}
