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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommoditytypeEntity that = (CommoditytypeEntity) o;
        return id == that.id &&
                Objects.equals(commodityTypeName, that.commodityTypeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, commodityTypeName);
    }

}
