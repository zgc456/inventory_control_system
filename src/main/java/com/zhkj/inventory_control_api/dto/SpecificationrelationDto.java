package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 商品规格关系dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class SpecificationrelationDto {
    private int id;
    private Integer commodityNumber;
    private BigDecimal commodityPrice;
    private String commoditySmallPictureUrl;
    private Integer commodityId;
    private Integer specificationTopicId;
    private Integer specificationDetailedId;

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

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommoditySmallPictureUrl() {
        return commoditySmallPictureUrl;
    }

    public void setCommoditySmallPictureUrl(String commoditySmallPictureUrl) {
        this.commoditySmallPictureUrl = commoditySmallPictureUrl;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getSpecificationTopicId() {
        return specificationTopicId;
    }

    public void setSpecificationTopicId(Integer specificationTopicId) {
        this.specificationTopicId = specificationTopicId;
    }

    public Integer getSpecificationDetailedId() {
        return specificationDetailedId;
    }

    public void setSpecificationDetailedId(Integer specificationDetailedId) {
        this.specificationDetailedId = specificationDetailedId;
    }


}
