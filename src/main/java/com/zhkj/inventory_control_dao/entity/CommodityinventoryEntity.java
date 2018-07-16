package com.zhkj.inventory_control_dao.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class CommodityinventoryEntity {
    private int id;
    private Integer commodityNumber;
    private Integer commoditySecurityLine;
    private Double commodityPrice;
    private String commoditySku;
    private Integer commodityId;
    private Timestamp commodityCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public Integer getCommoditySecurityLine() {
        return commoditySecurityLine;
    }

    public void setCommoditySecurityLine(Integer commoditySecurityLine) {
        this.commoditySecurityLine = commoditySecurityLine;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String commoditySku) {
        this.commoditySku = commoditySku;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Timestamp getCommodityCreateTime() {
        return commodityCreateTime;
    }

    public void setCommodityCreateTime(Timestamp commodityCreateTime) {
        this.commodityCreateTime = commodityCreateTime;
    }
}
