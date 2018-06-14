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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticstypeEntity that = (StatisticstypeEntity) o;
        return id == that.id &&
                Objects.equals(statisticsTypeName, that.statisticsTypeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, statisticsTypeName);
    }
}
