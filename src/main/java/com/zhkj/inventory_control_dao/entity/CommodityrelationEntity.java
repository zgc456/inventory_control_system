package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

public class CommodityrelationEntity {
    private int id;
    private Integer commodityPrimaryTypeId;
    private Integer commodityMinorTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCommodityPrimaryTypeId() {
        return commodityPrimaryTypeId;
    }

    public void setCommodityPrimaryTypeId(Integer commodityPrimaryTypeId) {
        this.commodityPrimaryTypeId = commodityPrimaryTypeId;
    }

    public Integer getCommodityMinorTypeId() {
        return commodityMinorTypeId;
    }

    public void setCommodityMinorTypeId(Integer commodityMinorTypeId) {
        this.commodityMinorTypeId = commodityMinorTypeId;
    }

}
