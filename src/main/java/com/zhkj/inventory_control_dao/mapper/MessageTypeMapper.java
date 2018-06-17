package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.MessageTypeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageTypeMapper {
    /**
     * 查询所有消息类型
     * @return 消息类型列表
     */
    List<MessageTypeEntity> listMessageTypeAll();
}
