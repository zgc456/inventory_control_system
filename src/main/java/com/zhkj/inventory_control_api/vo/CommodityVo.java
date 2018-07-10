package com.zhkj.inventory_control_api.vo;

public class CommodityVo {
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品供应商
     */
    private Integer supplier;
    /**
     * 商品供应商名称
     */
    private String supplierName;
    /**
     * 商品数量
     */
    private Integer[] commodityNumber;
    /**
     * 商品警戒线
     */
    private Integer[] commoditySecurityLine;
    /**
     * 商品价格
     */
    private Double[] commodityPrice;
    /**
     * 商品规格
     */
    private String[] commoditySku;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer[] getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer[] commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public Integer[] getCommoditySecurityLine() {
        return commoditySecurityLine;
    }

    public void setCommoditySecurityLine(Integer[] commoditySecurityLine) {
        this.commoditySecurityLine = commoditySecurityLine;
    }

    public Double[] getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double[] commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String[] getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String[] commoditySku) {
        this.commoditySku = commoditySku;
    }
}
