package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class CommodityEntity implements Serializable {
    private int id;
    private String commodityName;
    private String commodityIntroduce;
    private String commodityBigPictureUrl;
    private Integer commodityRelationId;

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

    public String getCommodityIntroduce() {
        return commodityIntroduce;
    }

    public void setCommodityIntroduce(String commodityIntroduce) {
        this.commodityIntroduce = commodityIntroduce;
    }

    public String getCommodityBigPictureUrl() {
        return commodityBigPictureUrl;
    }

    public void setCommodityBigPictureUrl(String commodityBigPictureUrl) {
        this.commodityBigPictureUrl = commodityBigPictureUrl;
    }

    public Integer getCommodityRelationId() {
        return commodityRelationId;
    }

    public void setCommodityRelationId(Integer commodityRelationId) {
        this.commodityRelationId = commodityRelationId;
    }


}
