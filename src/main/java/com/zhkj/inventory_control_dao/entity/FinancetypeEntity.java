package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 */
public class FinancetypeEntity {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancetypeEntity that = (FinancetypeEntity) o;
        return id == that.id &&
                Objects.equals(financeTypeName, that.financeTypeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, financeTypeName);
    }
}
