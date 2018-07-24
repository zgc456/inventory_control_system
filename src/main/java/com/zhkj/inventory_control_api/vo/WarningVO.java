package com.zhkj.inventory_control_api.vo;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * 库存预警VO
 * @author
 * @Version 1.0
 * @Data 2018/7/24 9:42
 */
public class WarningVO {
    private Integer state;
   private Date messageCreateTime;
   private String commodityName;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Date messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
