package com.zhkj.inventory_control_api.dto;

/**
 * 审核后给后台发送数据
 *
 * @author
 * @Version 1.0
 * @Data 2018/7/10 17:13
 */
public class sendToBackGroundMessage {

    /**
     * 审核状态
     * 操作人
     * 不通过原因
     * 唯一标识
     */
    private int state;

    private String operation;
}
