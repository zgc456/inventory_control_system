package com.zhkj.inventory_control_dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 */
public class StatisticsEntity {
    private int id;
    private Timestamp statisticsCreateTime;
    private Integer statisticsTypeId;
    private Integer commodityInventoryId;
    private Integer statisticsNumber;

    public Integer getStatisticsNumber() {
        return statisticsNumber;
    }

    public void setStatisticsNumber(Integer statisticsNumber) {
        this.statisticsNumber = statisticsNumber;
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

    public Integer getStatisticsTypeId() {
        return statisticsTypeId;
    }

    public void setStatisticsTypeId(Integer statisticsTypeId) {
        this.statisticsTypeId = statisticsTypeId;
    }

    public Integer getCommodityInventoryId() {
        return commodityInventoryId;
    }

    public void setCommodityInventoryId(Integer commodityInventoryId) {
        this.commodityInventoryId = commodityInventoryId;
    }
}
