package com.zhkj.inventory_control_controller;

import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_service.inventory_control_table.StatisticsImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value = "/statisDTOS")
    public List<StatisticsDTO> statisticsDTOS(){
       return statisticsService.selectStatiscsEntityAll();
    }
}
