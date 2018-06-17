package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.MessageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {
    /**
     * 查询所有消息
     * @return 消息列表
     */
    List<MessageEntity> listMessageAll();

    /**
     * 查询未读消息
     * @return 消息列表
     */
    List<MessageEntity> listMessageByUnread();
    /**
     * 查询条件
     * @param conditionSql 条件语句
     * @return 消息列表
     */
    List<MessageEntity> listMessageByCondition(@Param("conditionSql") String conditionSql);

    /**
     * 添加消息
     *      创建时间不需要传值
     * @param messageEntity 消息信息
     * @return 是否成功
     */
    int insertMessage(@Param("messageEntity") MessageEntity messageEntity);
}
