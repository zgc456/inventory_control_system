package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 * 商品规格关系
 */
public class SpecificationrelationEntity {
    private int id;
    //topicId 1 容量 detailedId 200ML 400ML
    //json 如{"topicId":1,"detailedId":[1,2]},{"topicId":1,"detailedId":[1,2]}
    private String specificationSku;
    //商品id
    private Integer commodityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecificationSku() {
        return specificationSku;
    }

    public void setSpecificationSku(String specificationSku) {
        this.specificationSku = specificationSku;
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
        SpecificationrelationEntity that = (SpecificationrelationEntity) o;
        return id == that.id &&
                Objects.equals(specificationSku, that.specificationSku) &&
                Objects.equals(commodityId, that.commodityId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, specificationSku, commodityId);
    }
}
