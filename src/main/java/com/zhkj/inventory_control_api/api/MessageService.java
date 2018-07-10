package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_dao.entity.MessageEntity;

import java.sql.Date;
import java.util.List;

/**
 * 消息表
 */
public interface MessageService {
    /**
     * 添加一条消息
     *
     * @param messageEntity 消息表实体类
     * @return
     */
    Boolean insertMessage(MessageEntity messageEntity);

    /**
     * 删除一条消息
     *
     * @param id 消息表id
     * @return
     */
    Boolean DeleteAmessage(Integer id);

    /**
     * 根据条件查询消息
     *
     * @param messageToken 订单编号
     * @param messageCreateTime 消息创建时间
     * @param messageStatus 消息处理状态
     * @return
     */
    List<MessageDTO> findMessageByCondition(String messageToken , Date messageCreateTime , Integer messageStatus);


}
