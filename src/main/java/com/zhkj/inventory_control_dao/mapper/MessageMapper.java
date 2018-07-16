package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.MessageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface MessageMapper {
    /**
     * 添加一条消息
     *
     * @param messageEntity 消息表实体类
     * @return
     */
    int addMessageByMessageEntity(@Param("messageEntity") MessageEntity messageEntity);

    /**
     * 删除一条信息根据id查找
     *
     * @param id
     * @return
     */
    int delMessageById(@Param("id") Integer id);

    /**
     * 查询消息
     * @param messageTitle 订单号
     * @param messageCreateTime 创建时间
     * @param messageStatus 是否处理
     *messageVo.getMessageTiele(),messageVo.getMessageCreateTime(),messageVo.getMessageType(),startNumber,MessageConstant.PAGE_LENGTH
     * @return 集合
     */
    List<MessageEntity> findMessageAll(@Param("messageTitle") String messageTitle ,@Param("messageCreateTime") Date messageCreateTime ,@Param("messageStatus") Integer messageStatus,@Param("startNumber") Integer startNumber,@Param("end") Integer end);

    /**
     * 根据id查询消息实体类
     * @param id
     * @return
     */
    List<MessageEntity> findMessageById(@Param("id") int id);

    /**
     * 修改处理状态
     */
    int alterMessageAudit(int messageId,int messageStatus);

}
