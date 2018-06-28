package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.PercentageDTO;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.FinancetypeEntity;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_tools.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    Result selectStatiscsEntityAll();

    /**
     * 查询当月财务统计
     * @return
     */
    List<StatisticsEntity> financeStatuscs();
    /**
     * 删除所有统计表数据
     */
    Result delStatiscsEntity();

    /**
     * 根据条件查询统计表类型
     * @param statisticsVO
     * @return
     */
    Result selectStatiscsCondition(StatisticsVO statisticsVO);

    /**
     * 添加一条统计类型
     * @param statisticsEntity
     * @return
     */
    Result insertStatiscs(StatisticsEntity statisticsEntity);

    /**
     *
     * @param request
     * @param response
     */
    void outPutExcelByStatistics(HttpServletRequest request, HttpServletResponse response);

    /**
     * 计算本月收支百分比
     * @return 返回收支情况
     */
     PercentageDTO incomeAndExpensesPercentage();

}