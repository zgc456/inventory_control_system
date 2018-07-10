package com.zhkj.inventory_control_service.inventory_control_message;

import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import com.zhkj.inventory_control_dao.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public Boolean insertMessage(MessageEntity messageEntity) {
       Integer state= messageMapper.addMessageByMessageEntity(messageEntity);
       if (state==1){
           //成功
           return true;
       }else{
           //失败
           return false;
       }
    }

    @Override
    public Boolean DeleteAmessage(Integer id) {
        Integer state= messageMapper.delMessageById(id);
        if (state==1){
            //成功
            return true;
        }else{
            //失败
            return false;
        }
    }

    @Override
    public List<MessageDTO> findMessageByCondition(String messageToken, Date messageCreateTime, Integer messageStatus) {
        List<MessageEntity> list=   messageMapper.findMessageAll(messageToken,messageCreateTime,messageStatus);
        return convertToMessageDTO(list);
    }

    /**
     *用来转换信息表DTO
     *
     * @param messageEntities 消息表集合
     * @return 消息表DTO对象
     */
    private List<MessageDTO> convertToMessageDTO(List<MessageEntity> messageEntities){
        List<MessageDTO> messageDTOS=new ArrayList<>();
        for (int i=0;i<messageEntities.size();i++){
            MessageEntity messageEntity=messageEntities.get(i);
            MessageDTO messageDTO=new MessageDTO();
            messageDTO.setMessageContent(messageEntity.getMessageContent());
            messageDTO.setMessageCreateTime(messageEntity.getMessageCreateTime());
            //1已处理 2未处理
            Integer status=messageEntity.getMessageStatus();
            String statusMessage=null;
            if (status==1){
                statusMessage="已处理";
            }else if (status==2){
                statusMessage="未处理";
            }
            messageDTO.setMessageStatus(statusMessage);
            messageDTO.setMessageTitle(messageEntity.getMessageTitle());
            messageDTO.setMessageToken(messageEntity.getMessageToken());
            //进货 退货 3.货物调度
            Integer type=messageEntity.getMessageStatus();
            String messageType=null;
            if (status==1){
                messageType="进货";
            }else if (status==2){
                messageType="退货";
            }else if (status==3){
                messageType="货物调度";
            }
            messageDTO.setMessageTypeId(messageType);
            messageDTO.setSendMessageName(messageEntity.getSendMessageName());
            messageDTOS.add(messageDTO);
        }
        return messageDTOS;
    }
}
