package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
/**
 * 财务表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class FinanceDto {
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
