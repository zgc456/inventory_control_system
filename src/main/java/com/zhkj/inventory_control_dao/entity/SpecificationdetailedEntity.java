package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class SpecificationdetailedEntity implements Serializable {
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


}
