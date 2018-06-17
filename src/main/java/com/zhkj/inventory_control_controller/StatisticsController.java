package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_service.inventory_control_table.StatisticsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/selectStatiscsEntityAll")
    public List<StatisticsDTO> statisticsDTOS(){
        //查询全部统计表记录
       return statisticsService.selectStatiscsEntityAll();
    }
//    @ModelAttribute StatisticsEntity statisticsEntity
    @RequestMapping(value = "/insertStatiscs",method = RequestMethod.GET)
    public Boolean insertStatiscs(){
        StatisticsEntity statisticsEntity=new StatisticsEntity();
//        statisticsEntity.setCommodityInventoryId();
        //添加一条记录
        return statisticsService.insertStatiscs(statisticsEntity);
    }

}
