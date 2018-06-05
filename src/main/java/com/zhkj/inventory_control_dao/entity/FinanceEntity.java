package com.zhkj.inventory_control_dao.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 */
public class FinanceEntity {
    private int id;
    private Integer financeTypeId;
    private BigDecimal financePrice;
    private Timestamp financeCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getFinanceTypeId() {
        return financeTypeId;
    }

    public void setFinanceTypeId(Integer financeTypeId) {
        this.financeTypeId = financeTypeId;
    }

    public BigDecimal getFinancePrice() {
        return financePrice;
    }

    public void setFinancePrice(BigDecimal financePrice) {
        this.financePrice = financePrice;
    }

    public Timestamp getFinanceCreateTime() {
        return financeCreateTime;
    }

    public void setFinanceCreateTime(Timestamp financeCreateTime) {
        this.financeCreateTime = financeCreateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceEntity that = (FinanceEntity) o;
        return id == that.id &&
                Objects.equals(financeTypeId, that.financeTypeId) &&
                Objects.equals(financePrice, that.financePrice) &&
                Objects.equals(financeCreateTime, that.financeCreateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, financeTypeId, financePrice, financeCreateTime);
    }
}
