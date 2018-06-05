package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 统计类型表dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class StatisticstypeDto{
    private int id;
    private String statisticsTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatisticsTypeName() {
        return statisticsTypeName;
    }

    public void setStatisticsTypeName(String statisticsTypeName) {
        this.statisticsTypeName = statisticsTypeName;
    }

}
