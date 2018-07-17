package com.zhkj.inventory_control_api.dto;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/16 18:08
 */
public class MessageAuditDTO {
   private String auditMessage;

    public String getAuditMessage() {
        return auditMessage;
    }

    public void setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
    }
    public  MessageAuditDTO(String auditMessage){
        this.auditMessage=auditMessage;
    }
}
