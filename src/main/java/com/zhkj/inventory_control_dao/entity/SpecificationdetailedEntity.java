package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 * 商品规格详细表
 */
public class SpecificationdetailedEntity {
    private int id;
    private String detailedName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetailedName() {
        return detailedName;
    }

    public void setDetailedName(String detailedName) {
        this.detailedName = detailedName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecificationdetailedEntity that = (SpecificationdetailedEntity) o;
        return id == that.id &&
                Objects.equals(detailedName, that.detailedName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, detailedName);
    }
}
