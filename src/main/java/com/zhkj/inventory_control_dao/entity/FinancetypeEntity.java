package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class FinancetypeEntity implements Serializable {
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
