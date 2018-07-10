package com.zhkj.inventory_control_service.inventory_control_interaction;

import com.zhkj.inventory_control_api.api.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * kafka交互页
 *
 * @author
 * @Version 1.0
 * @Data 2018/7/9 10:35
 */
@Service
public class InteractionServiceImpl implements InteractionService {

    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Override
    public void sendInteractionService(String Message) {
            kafkaTemplate.send("inventoryControlSystemMessage", 0,"msg","{\"id\":2}").addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
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
