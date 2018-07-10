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
     * @param messageToken 订单号
     * @param messageCreateTime 创建时间
     * @param messageStatus 是否处理
     *
     * @return 集合
     */
    List<MessageEntity> findMessageAll(@Param("messageToken") String messageToken ,@Param("messageCreateTime") Date messageCreateTime ,@Param("messageStatus") Integer messageStatus);
}
