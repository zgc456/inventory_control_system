package com.zhkj.inventory_control_controller;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.api.UserService;
import com.zhkj.inventory_control_api.dto.StatisticsDto;
import com.zhkj.inventory_control_api.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping(value = "/index",produces="application/json;charset=UTF-8")
    public Boolean index(){
        UserVo userVo=new UserVo();
        userVo.setUserAccount("13838448089");
        userVo.setUserPassword("123465");
        return userService.isLogin(userVo);
    }

    @Autowired
   private StatisticsService statisticsService;
    @ResponseBody
    @RequestMapping(value = "/logins")
    public List<StatisticsDto> statisticsDtos(){
        return statisticsService.selectStatisticsAll();
    }
}
