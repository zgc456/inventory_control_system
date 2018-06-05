package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 商品分类对应关系表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class CommodityrelationDto {
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
