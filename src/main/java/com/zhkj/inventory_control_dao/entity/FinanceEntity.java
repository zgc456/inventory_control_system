package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class FinanceEntity implements Serializable {
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


}
