package com.zhkj.inventory_control_service.inventory_control_timer;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/23 14:53
 */
public class Timer {
    @Scheduled(cron = "0/5 * * * * ?") //每五秒执行一次
    public void timer(){
        //定时任务
    }
}
