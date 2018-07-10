package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 * 商品表
 */
public class CommodityEntity {
    private int id;
    //商品名称
    private String commodityName;
    //商品介绍
    private String commodityIntroduce;
    //商品图片路径
    private String commodityBigPictureUrl;
    // 商品供应商
    private Integer supplierId;


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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}
