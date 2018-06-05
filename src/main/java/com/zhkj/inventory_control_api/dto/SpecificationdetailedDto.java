package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 商品规格详细dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class SpecificationdetailedDto{
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
