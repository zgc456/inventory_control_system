package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;

public class CommoditytypeDto {
    private int id;
    private String commodityTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }


}
