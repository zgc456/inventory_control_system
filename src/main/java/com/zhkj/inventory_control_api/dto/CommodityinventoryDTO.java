package com.zhkj.inventory_control_api.dto;

import java.math.BigDecimal;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/5 9:41
 */
public class CommodityinventoryDTO {
    private int id;
    //商品数量
    private Integer commodityNumber;
    //库存报警值
    private Integer commoditySecurityLine;
    //商品价格
    private BigDecimal commodityPrice;
    //商品图片
    private String commoditySmallPictureUrl;
    //库存规格关系json 引用topic 自己查询所属规格
    private String commoditySku;
    //商品名称
    private String commodityName;

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

    public String getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String commoditySku) {
        this.commoditySku = commoditySku;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
