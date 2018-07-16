package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.PercentageDTO;
import com.zhkj.inventory_control_api.dto.week.WeekDTO;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_tools.Result;
import com.zhkj.inventory_control_tools.SendURI;
import com.zhkj.inventory_control_tools.TablePage;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/getweek",method = RequestMethod.GET)
    public WeekDTO getWeek(){
        String week= SendURI.doGet("https://www.sojson.com/open/api/weather/json.shtml?city=洛阳");
        System.out.println(week);
        WeekDTO weekDTO= JSONObject.parseObject(week,WeekDTO.class);
        return weekDTO;
    }

    @RequestMapping(value = "/insertStatiscs",method = RequestMethod.GET)
    public Result insertStatiscs(@ModelAttribute  StatisticsEntity statisticsEntity){
        //添加一条记录
        return statisticsService.insertStatiscs(statisticsEntity);
    }

    @RequestMapping("/selectByExample")
    public Result selectByExample(@ModelAttribute  StatisticsVO statisticsVO){
        //点击搜索
        TablePage.setThisIndex(1);
//        StatisticsVO statisticsVO=new StatisticsVO();
////      statisticsEntity.setStatisticsCreateTime();
//        statisticsVO.setStatisticsTypeId(0);
//        statisticsVO.setFinanceTypeId(0);
//        statisticsVO.setStatisticsCreateTime("2018-6-14");
//        statisticsVO.setEndTime("2018-6-15");
         return statisticsService.selectStatiscsCondition(statisticsVO);
    }

    @RequestMapping(value = "selectToPage")
    public Result selectPage(@ModelAttribute  StatisticsVO statisticsVO,@RequestParam("state") Integer state){
        if (state==1){
            //首页
            TablePage.setThisIndex(1);
        }else if (state==2){
            //末页
            TablePage.setThisIndex(TablePage.getThisIndex()-1);
        }else if (state==3){
            //上一页
            TablePage.setThisIndex(TablePage.getThisIndex()-1);
        }else if (state==4){
            // 下一页
            TablePage.setThisIndex(TablePage.getCount());
        }
        return statisticsService.selectStatiscsCondition(statisticsVO);
//        StatisticsVO statisticsVO=new StatisticsVO();
////      statisticsEntity.setStatisticsCreateTime();
//        statisticsVO.setStatisticsTypeId(0);
//        statisticsVO.setFinanceTypeId(0);
//        statisticsVO.setStatisticsCreateTime("2018-6-14");
//        statisticsVO.setEndTime("2018-6-15");
    }

    @RequestMapping("/outPutExcelByStatistics")
    public void outPutExcelByStatistics(HttpServletRequest request, HttpServletResponse response){
        //导出资源报表
        statisticsService.outPutExcelByStatistics(request,response);
    }

    @RequestMapping("/theMouthStatistics")
    public List<StatisticsEntity> theMouthStatistics(HttpServletRequest request){
      //查看当月消费情况
        return statisticsService.financeStatuscs();
    }

    @RequestMapping("/getPercentage")
    public PercentageDTO getPercentage(){
        System.out.println(statisticsService.incomeAndExpensesPercentage());
        //计算当月收支占总金额的百分比
      return   statisticsService.incomeAndExpensesPercentage();
    }
    @RequestMapping(value = "/selectStatiscs",method = RequestMethod.POST)
    public Result selectStatiscsAll(){
        return statisticsService.selectStatiscsEntityAll();
    }
}
