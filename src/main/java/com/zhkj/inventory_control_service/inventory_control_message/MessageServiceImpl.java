package com.zhkj.inventory_control_service.inventory_control_message;

import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_api.api.OperationLogService;
import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_api.dto.OperationLogDTO;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import com.zhkj.inventory_control_dao.entity.OperationlogEntity;
import com.zhkj.inventory_control_dao.mapper.MessageMapper;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.MessageConstant;
import com.zhkj.inventory_control_tools.ServiceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private OperationLogService operationLogService;

    @Override
    public Boolean insertMessage(MessageEntity messageEntity) {
        Integer state = messageMapper.addMessageByMessageEntity(messageEntity);
        if (state == 1) {
            //成功
            return true;
        } else {
            //失败
            return false;
        }
    }

    @Override
    public Boolean DeleteAmessage(Integer id) {
        Integer state = messageMapper.delMessageById(id);
        if (state == 1) {
            //成功
            return true;
        } else {
            //失败
            return false;
        }
    }

    @Override
    public DataTables findMessageByCondition(MessageVo messageVo, HttpServletRequest request) {
        DataTables dataTables = new DataTables();
        if (null != messageVo) {
            Integer startNumber = Integer.valueOf(request.getParameter("start"));
            List<MessageEntity> list = messageMapper.findMessageAll(messageVo.getMessageTitle(), messageVo.getMessageCreateTime(), messageVo.getMessageStatus(), startNumber, MessageConstant.PAGE_LENGTH);
            List<MessageDTO> messageDTOS = convertToMessageDTO(list);
            List<MessageEntity> Messagecount = messageMapper.findMessageAll(null, null, 0, 0, 0);

            dataTables.setiTotalDisplayRecords(Messagecount.size());
            dataTables.setiTotalRecords(messageDTOS.size());
            dataTables.setData(messageDTOS);
        } else {
            dataTables.setiTotalDisplayRecords(Integer.valueOf(0));
            dataTables.setiTotalRecords(Integer.valueOf(0));
            dataTables.setData(new ArrayList<>());
        }
        return dataTables;

    }

    @Override
    public List<MessageDTO> findMessageById(int id) {
        List<MessageDTO> messageDTOS = convertToMessageDTO(messageMapper.findMessageById(id));
        return messageDTOS;
    }

    @Override
    public String isApprove(int id, int state, String messageTitle, HttpServletRequest request) {
        try {
            if (state == ServiceConstant.IS_PASS) { //审核同意
                //kafka
                //参数（处理人，处理唯一标识，同意 或者 拒绝）
                //判断是发货还是退货
                if (messageTitle.equals("退货")) {   //如果是退货
                    //修改message
                    messageMapper.alterMessageAudit(id, ServiceConstant.MESSAGE_AUDIT_INTEGER_STOCK);
                    //添加日志表
                    operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_MESSAGE, MessageConstant.OPERATION_MODEL_ACTION_MESSAGE_SALESRETURN, "审核通过", request);
                    //加库存
                } else if (messageTitle.equals("发货")) {//如果是发货
                    //修改message
                    messageMapper.alterMessageAudit(id, ServiceConstant.MESSAGE_AUDIT_INTEGER_STOCK);
                    //添加日志表
                    operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_MESSAGE, MessageConstant.OPERATION_MODEL_ACTION_MESSAGE_SHIPMENTS, "审核通过", request);
                    //发货减库存
                }
                return ServiceConstant.MESSAGE_AUDIT_ISOK; //同意审核
            } else if (state == ServiceConstant.NOT_PASS) { //审核拒绝
                //修改message
                messageMapper.alterMessageAudit(id, ServiceConstant.MESSAGE_AUDIT_INTEGER_SALERETURN);
                //添加日志表
                if (messageTitle.equals("退货")) {   //如果是退货
                    operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_MESSAGE, MessageConstant.OPERATION_MODEL_ACTION_MESSAGE_SALESRETURN, "审核未通过", request);
                } else { //发货
                    operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_MESSAGE, MessageConstant.OPERATION_MODEL_ACTION_MESSAGE_SHIPMENTS, "审核未通过", request);
                }
                //kafka
                //参数（处理人，处理唯一标识，同意 或者 拒绝）
                return ServiceConstant.MESSAGE_AUDIT_NOTOK; //拒绝审核
            } else { //非法参数
                messageMapper.alterMessageAudit(id, ServiceConstant.MESSAGE_AUDIT_INTEGER_DISPATCH);
                return ServiceConstant.MESSAGE_AUDIT_ILLEGITMACY;
            }
        } catch (Exception e) {//报异常 走非法参数
            messageMapper.alterMessageAudit(id, ServiceConstant.MESSAGE_AUDIT_INTEGER_DISPATCH);
            return ServiceConstant.MESSAGE_AUDIT_ILLEGITMACY;
        }
    }


    /**
     * 用来转换信息表DTO
     *
     * @param messageEntities 消息表集合
     * @return 消息表DTO对象
     */
    private List<MessageDTO> convertToMessageDTO(List<MessageEntity> messageEntities) {
        List<MessageDTO> messageDTOS = new ArrayList<>();
        for (int i = 0; i < messageEntities.size(); i++) {
            MessageEntity messageEntity = messageEntities.get(i);
            MessageDTO messageDTO = new MessageDTO();
            messageDTO.setMessageContent(messageEntity.getMessageContent());
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            messageDTO.setMessageCreateTime(sd.format(messageEntity.getMessageCreateTime()));
            //1已处理 2未处理
            Integer status = messageEntity.getMessageStatus();
            String statusMessage = null;
            if (status == 1) {
                statusMessage = "同意";
            } else if (status == 2) {
                statusMessage = "拒绝";
            } else if (status == 3) {
                statusMessage = "未处理";
            }
            messageDTO.setShowMessageId(i + 1);
            messageDTO.setId(messageEntity.getId());
            messageDTO.setMessageStatus(statusMessage);
            messageDTO.setMessageTitle(messageEntity.getMessageTitle());
            messageDTO.setMessageToken(messageEntity.getMessageToken());
            //进货 退货 3.货物调度
            Integer type = messageEntity.getMessageTypeId();
            String messageType = null;
            if (type == 1) {
                messageType = "进货";
            } else if (type == 2) {
                messageType = "退货";
            } else if (type == 3) {
                messageType = "货物调度";
            }
            messageDTO.setMessageTypeId(messageType);
            messageDTO.setSendMessageName(messageEntity.getSendMessageName());
            messageDTOS.add(messageDTO);
        }
        return messageDTOS;
    }

}
