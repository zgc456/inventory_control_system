package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/14 9:11
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommodityrelationEntity that = (CommodityrelationEntity) o;
        return id == that.id &&
                Objects.equals(commodityPrimaryTypeId, that.commodityPrimaryTypeId) &&
                Objects.equals(commodityMinorTypeId, that.commodityMinorTypeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, commodityPrimaryTypeId, commodityMinorTypeId);
    }
}
