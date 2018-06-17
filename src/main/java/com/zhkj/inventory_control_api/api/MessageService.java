package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.MessageDto;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_tools.Result;

import java.util.List;

public interface MessageService {
    /**
     * 查询所有消息
     * @return 消息列表
     */
    Result listMessageAll();

    /**
     * 查询所有未读消息
     * @return 消息条数
     */
    Result listMessageSumByUnread();

    /**
     * 根据条件查询消息
     * @param messageVo 查询条件
     * @return 消息列表
     */
    Result listMessageByCondition(MessageVo messageVo);
}
