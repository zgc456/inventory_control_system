package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.StatisticstypeEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 统计类型 数据库映射
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/5 9:22
 */
@Repository
public interface StatisticsTypeMapper {
    /**
     * 根据id查询统计类型
     *
     * @param id 统计类型表id
     * @return 统计类型实体类
     */
    StatisticstypeEntity selectStatisticsTypeToId(@Param("id") Integer id);
}
