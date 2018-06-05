package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 财务类型表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class FinancetypeDto {
    private int id;
    private String financeTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinanceTypeName() {
        return financeTypeName;
    }

    public void setFinanceTypeName(String financeTypeName) {
        this.financeTypeName = financeTypeName;
    }


}
