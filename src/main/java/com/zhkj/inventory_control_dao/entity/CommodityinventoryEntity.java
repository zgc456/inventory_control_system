package com.zhkj.inventory_control_dao.entity;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 * 商品存货表
 */
public class CommodityinventoryEntity {
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
    //商品外键id
    private Integer commodityId;

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

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommodityinventoryEntity that = (CommodityinventoryEntity) o;
        return id == that.id &&
                Objects.equals(commodityNumber, that.commodityNumber) &&
                Objects.equals(commoditySecurityLine, that.commoditySecurityLine) &&
                Objects.equals(commodityPrice, that.commodityPrice) &&
                Objects.equals(commoditySmallPictureUrl, that.commoditySmallPictureUrl) &&
                Objects.equals(commoditySku, that.commoditySku) &&
                Objects.equals(commodityId, that.commodityId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, commodityNumber, commoditySecurityLine, commodityPrice, commoditySmallPictureUrl, commoditySku, commodityId);
    }
}
