package com.zhkj.inventory_control_service.inventory_control_interaction;

import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/9 10:48
 */
@Component
public class KafkaListener {
    @Autowired
   private MessageService messageService;
    /**
     * 监听后台传入的信息
     *
     * @param message
     */
    @org.springframework.kafka.annotation.KafkaListener(id="client_one",topics = "ShipmentReturnKafka")
    public void receive(String message) {
        //收到消息
            System.out.println("接收到消息"+message);
            MessageEntity messageEntity= JSONObject.parseObject(message,MessageEntity.class);
            //存入数据库操作
            messageService.insertMessage(messageEntity);

    }
//    //kafka监听器 topics 订阅
//    @org.springframework.kafka.annotation.KafkaListener(id="client_two",topics = "ShipmentReturnKafka1")
//    public void receive(Integer message) {
//        //收到消息
//        System.out.println("收到的的Integer消息为:" + message);
//    }
}
