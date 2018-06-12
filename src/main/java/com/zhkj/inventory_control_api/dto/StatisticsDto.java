package com.zhkj.inventory_control_api.dto;

import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
/**
 * 统计表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class StatisticsDto{
    //id
    private int id;
    //添加进货表时间
    private Timestamp statisticsCreateTime;
    //统计类型
    private String statisticsType;
    //库存表
    private CommodityinventoryDTO commodityInventory;
    //数量
    private Integer statisticsNumber;
    //财务类型
    private String financeType;
    //交易金额
    private BigDecimal financePrice;

    public String getFinanceType() {
        return financeType;
    }

    public void setFinanceType(String financeType) {
        this.financeType = financeType;
    }

    public BigDecimal getFinancePrice() {
        return financePrice;
    }

    public void setFinancePrice(BigDecimal financePrice) {
        this.financePrice = financePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getStatisticsCreateTime() {
        return statisticsCreateTime;
    }

    public void setStatisticsCreateTime(Timestamp statisticsCreateTime) {
        this.statisticsCreateTime = statisticsCreateTime;
    }


    public String getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
    }

    public CommodityinventoryDTO getCommodityInventory() {
        return commodityInventory;
    }

    public void setCommodityInventory(CommodityinventoryDTO commodityInventory) {
        this.commodityInventory = commodityInventory;
    }

    public Integer getStatisticsNumber() {
        return statisticsNumber;
    }

    public void setStatisticsNumber(Integer statisticsNumber) {
        this.statisticsNumber = statisticsNumber;
    }


}
