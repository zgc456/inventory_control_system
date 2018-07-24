package com.zhkj.inventory_control_service.inventory_control_timer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * @author
 * @Version 1.0
 * @Data 2018/7/23 14:53
 */
@Component
@EnableScheduling
public class Timer {
    @Scheduled(cron = "0/3 * * * * ?")   //每5秒执行一次
    public void timer(){

    }
}
