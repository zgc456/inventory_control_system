package com.zhkj.inventory_control_api.dto;

import com.zhkj.inventory_control_dao.entity.CommodityEntity;

public class CommInventoryDto {
    private int id;
    private Integer commodityNumber;
    private Integer commoditySecurityLine;
    private String commodityPrice;
    private String commoditySmallPictureUrl;
    private String[] commoditySku;
    private CommodityEntity commodity;
    private String commodityCreateTime;

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

    public Integer getCommoditySecurityLine() {
        return commoditySecurityLine;
    }

    public void setCommoditySecurityLine(Integer commoditySecurityLine) {
        this.commoditySecurityLine = commoditySecurityLine;
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommoditySmallPictureUrl() {
        return commoditySmallPictureUrl;
    }

    public void setCommoditySmallPictureUrl(String commoditySmallPictureUrl) {
        this.commoditySmallPictureUrl = commoditySmallPictureUrl;
    }

    public String[] getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String[] commoditySku) {
        this.commoditySku = commoditySku;
    }

    public CommodityEntity getCommodity() {
        return commodity;
    }

    public void setCommodity(CommodityEntity commodity) {
        this.commodity = commodity;
    }

    public String getCommodityCreateTime() {
        return commodityCreateTime;
    }

    public void setCommodityCreateTime(String commodityCreateTime) {
        this.commodityCreateTime = commodityCreateTime;
    }
}
