package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;

import java.util.List;

/**
 * 统计表Service
 */
public interface StatisticsService {
    /**
     * 查询所有统计表
     *
     * @return
     */
    List<StatisticsDTO> selectStatiscsEntityAll();

    /**
     * 删除所有统计表数据
     */
    Boolean delStatiscsEntity();

    /**
     * 根据条件查询统计表类型
     * @param statisticsEntity
     * @return
     */
    List<StatisticsDTO> selectStatiscsCondition(StatisticsEntity statisticsEntity);

    /**
     * 添加一条统计类型
     * @param statisticsEntity
     * @return
     */
    Boolean insertStatiscs(StatisticsEntity statisticsEntity);


}
