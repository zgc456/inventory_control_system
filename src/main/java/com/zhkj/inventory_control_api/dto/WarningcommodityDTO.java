package com.zhkj.inventory_control_api.dto;

import java.util.Date;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/24 9:58
 */
public class WarningcommodityDTO {
    private int id;
    private String commodityName;
    private String commoditySpecification;
    private int commodityCount;
    private String commoditySupplier;
    private int commodityWaitCount;
    private String createTime;
    private String commodityState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommoditySpecification() {
        return commoditySpecification;
    }

    public void setCommoditySpecification(String commoditySpecification) {
        this.commoditySpecification = commoditySpecification;
    }

    public int getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(int commodityCount) {
        this.commodityCount = commodityCount;
    }

    public String getCommoditySupplier() {
        return commoditySupplier;
    }

    public void setCommoditySupplier(String commoditySupplier) {
        this.commoditySupplier = commoditySupplier;
    }

    public int getCommodityWaitCount() {
        return commodityWaitCount;
    }

    public void setCommodityWaitCount(int commodityWaitCount) {
        this.commodityWaitCount = commodityWaitCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(String commodityState) {
        this.commodityState = commodityState;
    }
}
