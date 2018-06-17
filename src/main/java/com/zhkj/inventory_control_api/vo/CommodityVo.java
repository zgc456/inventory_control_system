package com.zhkj.inventory_control_api.vo;

import java.util.List;

public class CommodityVo {
    private String commodityName;
    private List<CommodityInventoryVo> commodityInventoryVoList;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public List<CommodityInventoryVo> getCommodityInventoryVoList() {
        return commodityInventoryVoList;
    }

    public void setCommodityInventoryVoList(List<CommodityInventoryVo> commodityInventoryVoList) {
        this.commodityInventoryVoList = commodityInventoryVoList;
    }
}
