package com.zhkj.inventory_control_service.inventory_control_interaction;

import com.zhkj.inventory_control_api.api.InteractionService;
import com.zhkj.inventory_control_api.dto.WarningcommodityDTO;
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
    //发货退货审核topic
    @Override
    public void sendInteractionService(String message) {
            kafkaTemplate.send("ShipmentReturnKafka1",message).addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
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
    //进货topic
    @Override
    public void orderInteractionService(String message) {
        kafkaTemplate.send("stock", message).addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
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
