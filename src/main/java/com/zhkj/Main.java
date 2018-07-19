package com.zhkj;

import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.dto.week.WeekDTO;
import com.zhkj.inventory_control_config.KafkaConfig;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
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

    }
}
