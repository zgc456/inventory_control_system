package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 统计表映射
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/6/4 15:29
 */
@Repository
public interface StatisticsMapper {
    /**
     * 根据 进货 退货 卖出 状态查询对应标题的统计
     * @param statisticsTypeId 统计类型
     * @return 统计表集合
     */
    List<StatisticsEntity> selectStatistics(@Param("statisticsTypeId") int statisticsTypeId);
    /**
     * 根据 进货 退货 卖出 状态查询对应标题的统计
     * @param
     */
    void insertStatistics(@Param("StatisticsEntity") StatisticsEntity statisticsEntity);

    /**
     * 删除数据库中所有的数据
     */
    void delStatistics();



}
