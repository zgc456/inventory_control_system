package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 */
public class StatisticstypeEntity {
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
