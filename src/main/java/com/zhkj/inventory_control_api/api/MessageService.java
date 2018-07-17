package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.MessageAuditDTO;
import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import com.zhkj.inventory_control_tools.DataTables;

import javax.servlet.http.HttpServletRequest;
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
     * @return
     */
    DataTables findMessageByCondition(MessageVo messageVo, HttpServletRequest request);


    /**
     * 根据id查询信息表信息
     * @param id
     * @return
     */
    List<MessageDTO> findMessageById(int id);

    /**
     * 审核结果
     * @param id 审核的id
     * @param state 审核状态 1通过 -1拒绝
     * @param messageTitle 审核类型  发货 or 退货
     * @return 审核状态
     */
    MessageAuditDTO isApprove(int id, int state, String messageTitle, HttpServletRequest request);




}
