package com.zhkj.inventory_control_dao.entity;

import java.sql.Timestamp;
import java.util.Objects;


/**
 * @author
 * @Version 1.0
 * @Data 2018/6/14 9:11
 */

public class MessageEntity {
    private int id;
    private String messageTitle;
    private String messageContent;
    private Integer messageStatus;
    private Integer messageTypeId;
    private Timestamp messageCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Timestamp getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Timestamp messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return id == that.id &&
                Objects.equals(messageTitle, that.messageTitle) &&
                Objects.equals(messageContent, that.messageContent) &&
                Objects.equals(messageStatus, that.messageStatus) &&
                Objects.equals(messageTypeId, that.messageTypeId) &&
                Objects.equals(messageCreateTime, that.messageCreateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, messageTitle, messageContent, messageStatus, messageTypeId, messageCreateTime);
    }

}
