package com.zhkj.inventory_control_api.api;

/**
 * kafka交互接口
 *
 * @author
 * @Version 1.0
 * @Data 2018/7/9 10:49
 */
public interface InteractionService {
    /**
     *  kafka发送一条消息
     *
     * @param Message 消息
     */
     void sendInteractionService(String Message);
}
