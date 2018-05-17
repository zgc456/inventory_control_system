package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class StatisticsEntity implements Serializable {
    private int id;
    private Timestamp statisticsCreateTime;
    private Integer statisticsTypeId;
    private Integer commodityId;
    private Integer statisticsNumber;

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

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getStatisticsNumber() {
        return statisticsNumber;
    }

    public void setStatisticsNumber(Integer statisticsNumber) {
        this.statisticsNumber = statisticsNumber;
    }


}
