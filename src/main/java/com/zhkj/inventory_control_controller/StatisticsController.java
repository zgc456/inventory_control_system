package com.zhkj.inventory_control_controller;

import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/5 7:37
 */
@RestController
public class StatisticsController {
    @Autowired
    private StatisticsService statisticsService;
    @RequestMapping(value = "/insertStatiscs",method = RequestMethod.GET)
    public Result insertStatiscs(@ModelAttribute  StatisticsEntity statisticsEntity){
        //添加一条记录
        return statisticsService.insertStatiscs(statisticsEntity);
    }

    @RequestMapping("/selectByExample")
    public Result selectByExample(@ModelAttribute  StatisticsVO statisticsVO){
//        StatisticsVO statisticsVO=new StatisticsVO();
////        statisticsEntity.setStatisticsCreateTime();
//        statisticsVO.setStatisticsTypeId(0);
//        statisticsVO.setFinanceTypeId(0);
//        statisticsVO.setStatisticsCreateTime("2018-6-14");
//        statisticsVO.setEndTime("2018-6-15");
        return statisticsService.selectStatiscsCondition(statisticsVO);
    }

    @RequestMapping("/outPutExcelByStatistics")
    public void outPutExcelByStatistics(HttpServletRequest request, HttpServletResponse response){
        //导出资源报表
        statisticsService.outPutExcelByStatistics(request,response);
    }
}
