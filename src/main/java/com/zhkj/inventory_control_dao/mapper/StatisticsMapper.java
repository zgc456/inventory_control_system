package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
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
     * @param
     */
    int insertStatistics(@Param("StatisticsEntity") StatisticsEntity statisticsEntity);

    /**
     * 删除数据库中所有的数据
     */
    int delStatistics();

    /**
     * 根据条件查询统计表
     *
     * @param statisticsEntity 统计表实体类
     * @return
     */
    List<StatisticsEntity> findStatisticsCondition(@Param("StatisticsEntity") StatisticsEntity statisticsEntity,@Param("endTime") String endTime,@Param("startTime") String startTime,@Param("start") Integer start,@Param("end") Integer end);

    /**
     * 查询所有统计表数据
     * @return
     */
    List<StatisticsEntity> findStatisticsAll();

    List<StatisticsEntity> findStatisticsByLimit(@Param("start") int start, @Param("end")int end);

    /**
     * 查询当月所有收入数据
     * @return 收入实体类
     */
    List<StatisticsEntity> findStatisticsToIncome();

    /**
     * 查询当月所有支出数据
     * @return 支出实体类
     */
    List<StatisticsEntity> findStatisticsToExpend();

    /**
     * 根据id修改库存表
     * @param id
     * @return
     */
    int updateStatisticsById(@Param("id") int id,@Param("financePrice") double financePrice,@Param("statisticsNumber") int statisticsNumber);



}
