package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.StatisticsDto;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;

import java.util.List;

/**
 * 统计表Service
 */
public interface StatisticsService {
    /**
     * 查询进货统计
     *
     * @return 统计集合dto
     */
    List<StatisticsDto> selectStatisticsStock();

    /**
     * 查询退货统计
     *
     * @return 统计集合dto
     */
    List<StatisticsDto> selectStatisticsSaleReturn();

    /**
     * 查询卖出统计
     *
     * @return 统计集合dto
     */
    List<StatisticsDto> selectStatisticsSale();

    /**
     * 查询所有统计
     *
     * @return 统计集合dto
     */
    List<StatisticsDto> selectStatisticsAll();

    /**
     * 添加记录
     */
    void insertStatistics(StatisticsEntity statisticsEntity);

    /**
     * 添加一条记录
     */
    boolean insertStatisticsALL(List<StatisticsVO> Statistics);

    /**
     * 用做查询给前台返回数据 类型转换
     *
     * @param statisticsEntities 统计表集合
     * @return 统计表DTO集合
     */
    List<StatisticsDto> ConverToDTO(List<StatisticsEntity> statisticsEntities);
}
