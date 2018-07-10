package com.zhkj;

import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.dto.week.WeekDTO;
import com.zhkj.inventory_control_config.KafkaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

import static javax.swing.UIManager.get;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/19 21:31
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(KafkaConfig.class);
        KafkaTemplate<String, String> kafkaTemplate = applicationContext.getBean(KafkaTemplate.class);
        kafkaTemplate.send("test", 0,"msg","{\"id\":2}").addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                ex.printStackTrace();
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("发送消息成功....");
            }
        });
    }
}
