package com.zhkj.inventory_control_api.vo;

import java.sql.Timestamp;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/5 7:39
 */
public class StatisticsVO {
    private int id;
    private String statisticsCreateTime;
    private Integer statisticsTypeId;
    private Integer statisticsNumber;
    private Integer financeTypeId;
    private double financePrice;
    private Integer CommodityInventoryId;
    private String endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatisticsCreateTime() {
        return statisticsCreateTime;
    }

    public void setStatisticsCreateTime(String statisticsCreateTime) {
        this.statisticsCreateTime = statisticsCreateTime;
    }

    public Integer getStatisticsTypeId() {
        return statisticsTypeId;
    }

    public void setStatisticsTypeId(Integer statisticsTypeId) {
        this.statisticsTypeId = statisticsTypeId;
    }

    public Integer getStatisticsNumber() {
        return statisticsNumber;
    }

    public void setStatisticsNumber(Integer statisticsNumber) {
        this.statisticsNumber = statisticsNumber;
    }

    public Integer getFinanceTypeId() {
        return financeTypeId;
    }

    public void setFinanceTypeId(Integer financeTypeId) {
        this.financeTypeId = financeTypeId;
    }

    public double getFinancePrice() {
        return financePrice;
    }

    public void setFinancePrice(double financePrice) {
        this.financePrice = financePrice;
    }

    public Integer getCommodityInventoryId() {
        return CommodityInventoryId;
    }

    public void setCommodityInventoryId(Integer commodityInventoryId) {
        CommodityInventoryId = commodityInventoryId;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
