package com.zhkj.inventory_control_api.dto;

/**
 * 百分比DTO
 * @Version 1.0
 * @Data 2018/6/26 16:05
 */
public class PercentageDTO {

    public PercentageDTO(String expend,String income){
        this.expend=expend;
        this.income=income;
    }
    private String expend;
    private String income;

    public String getExpend() {
        return expend;
    }

    public void setExpend(String expend) {
        this.expend = expend;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
