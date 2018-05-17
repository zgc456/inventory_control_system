package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class CommodityrelationEntity implements Serializable {
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
