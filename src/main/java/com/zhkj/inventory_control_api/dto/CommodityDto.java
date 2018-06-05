package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 商品表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class CommodityDto {
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
