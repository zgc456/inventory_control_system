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
    private Integer specificationTopicId;
    private Integer specificationDetailedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
