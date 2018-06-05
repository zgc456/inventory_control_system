package com.zhkj.inventory_control_api.vo;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/5 7:39
 */
public class StatisticsVO {
    //规格类型1
    int speciflcationDetailed;
    //规格类型2
    int specificationDetailed2;
    //商品名称
    String commodityName;
    //查看是什么状态 1 进货 2 退货 3卖出
    int typeId;


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getSpecificationDetailed2() {
        return specificationDetailed2;
    }

    public void setSpecificationDetailed2(int specificationDetailed2) {
        this.specificationDetailed2 = specificationDetailed2;
    }

    public int getSpeciflcationDetailed() {
        return speciflcationDetailed;
    }

    public void setSpeciflcationDetailed(int speciflcationDetailed) {
        this.speciflcationDetailed = speciflcationDetailed;
    }
}
