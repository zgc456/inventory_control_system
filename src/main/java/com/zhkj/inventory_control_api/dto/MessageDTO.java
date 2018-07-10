package com.zhkj.inventory_control_api.dto;

import java.sql.Timestamp;

public class MessageDTO {
    private int id;
    //消息请求头
    private String messageTitle;
    //消息内容
    private String messageContent;
    //消息是否被处理
    private String messageStatus;
    //消息类型
    private String messageTypeId;
    //消息创建时间
    private Timestamp messageCreateTime;
    //提交人姓名
    private String sendMessageName;
    //订单编号
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

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(String messageTypeId) {
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
}
