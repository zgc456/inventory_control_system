package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

public class CommoditytypeEntity {
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
