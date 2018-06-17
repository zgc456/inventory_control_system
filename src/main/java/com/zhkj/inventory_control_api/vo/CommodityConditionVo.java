package com.zhkj.inventory_control_api.vo;

public class CommodityConditionVo {
    private String commodityName;
    private String commoditySku;
    private String createTime;
    private Integer skip;
    private Integer customPage;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String commoditySku) {
        this.commoditySku = commoditySku;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getCustomPage() {
        return customPage;
    }

    public void setCustomPage(Integer customPage) {
        this.customPage = customPage;
    }
}
