package com.zhkj.inventory_control_dao.entity;

import java.sql.Date;
import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/24 8:07
 */
public class WarningcommodityEntity {
    private int id;
    private String commodityName;
    private String commoditySpecification;
    private int commodityCount;
    private String commoditySupplier;
    private Integer commodityWaitCount;
    private Date createTime;
    private int commodityState;
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
    public Integer getCommodityWaitCount() {
        return commodityWaitCount;
    }
    public void setCommodityWaitCount(Integer commodityWaitCount) {
        this.commodityWaitCount = commodityWaitCount;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public int getCommodityState() {
        return commodityState;
    }
    public void setCommodityState(int commodityState) {
        this.commodityState = commodityState;
    }
}
