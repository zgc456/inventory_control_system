package com.zhkj.inventory_control_dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/9 11:38
 */
public class MessageEntity {
    private int id;
    //消息标题
    private String messageTitle;
    //消息内容
    private String messageContent;
    //消息处理状态
    private Integer messageStatus;
    //消息类型  进出退货
    private Integer messageTypeId;
    //创建时间
    private Timestamp messageCreateTime;
    //发送人姓名
    private String sendMessageName;
    //唯一标识
    private String messageToken;

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

    public String getSendMessageName() {
        return sendMessageName;
    }

    public void setSendMessageName(String sendMessageName) {
        this.sendMessageName = sendMessageName;
    }

    public String getMessageToken() {
        return messageToken;
    }

    public void setMessageToken(String messageToken) {
        this.messageToken = messageToken;
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
                Objects.equals(messageCreateTime, that.messageCreateTime) &&
                Objects.equals(sendMessageName, that.sendMessageName) &&
                Objects.equals(messageToken, that.messageToken);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, messageTitle, messageContent, messageStatus, messageTypeId, messageCreateTime, sendMessageName, messageToken);
    }
}
