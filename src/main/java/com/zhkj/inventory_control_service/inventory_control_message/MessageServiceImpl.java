package com.zhkj.inventory_control_service.inventory_control_message;

import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_api.dto.MessageDto;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import com.zhkj.inventory_control_dao.entity.MessageTypeEntity;
import com.zhkj.inventory_control_dao.mapper.MessageMapper;
import com.zhkj.inventory_control_dao.mapper.MessageTypeMapper;
import com.zhkj.inventory_control_tools.ConverDateTools;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private MessageTypeMapper messageTypeMapper;
    @Override
    public Result listMessageAll() {
        Result result = new Result();
        List<MessageEntity> messageEntityList = messageMapper.listMessageAll();
        List<MessageTypeEntity> messageTypeEntityList = messageTypeMapper.listMessageTypeAll();
        List<MessageDto> messageDtoList = convertToMessageDto(messageEntityList,messageTypeEntityList);
        result.setData(true);
        result.setData(messageDtoList);
        return result;
    }

    @Override
    public Result listMessageSumByUnread() {
        Result result = new Result();
        List<MessageEntity> messageEntityList = messageMapper.listMessageByUnread();
        result.setSuccess(true);
        result.setData(messageEntityList.size());
        return result;
    }

    @Override
    public Result listMessageByCondition(MessageVo messageVo) {
        Result result = new Result();
        String param = jointParam(messageVo.getMessageStatus(),messageVo.getMessageType(),messageVo.getMessageTitle());
        List<MessageEntity> messageEntityList = messageMapper.listMessageByCondition(param);
        List<MessageTypeEntity> messageTypeEntityList = messageTypeMapper.listMessageTypeAll();
        List<MessageDto> messageDtoList = convertToMessageDto(messageEntityList,messageTypeEntityList);
        result.setSuccess(true);
        result.setData(messageDtoList);
        return result;
    }

    /**
     * 拼接参数
     * @param status 消息状态
     * @param typeId 消息类型
     * @param messageTitle 消息标题
     * @return
     */
    private String jointParam(Integer status,Integer typeId,String messageTitle){
        StringBuffer param = new StringBuffer();
        if(null != status && status > 0){
            param.append(" AND messageStatus = " + status);
        }
        if(null != typeId && typeId > 0){
            param.append(" AND messageTypeId = " + typeId);
        }
        if(null != messageTitle && !messageTitle.equals("")){
            param.append(" AND messageTitle LIKE '%" + messageTitle + "%'");
        }
        return param.toString();
    }
    /**
     * 转换 DTO
     * @param messageEntityList 消息列表
     * @param messageTypeEntityList 消息类型列表
     * @return 消息 DTO 列表
     */
    private List<MessageDto> convertToMessageDto(List<MessageEntity> messageEntityList, List<MessageTypeEntity> messageTypeEntityList){
        List<MessageDto> messageDtoArrayList = new ArrayList<>();
        if(null != messageEntityList && messageEntityList.size() > 0){
            for(int i = 0;i < messageEntityList.size();i++){
                MessageDto messageDto = new MessageDto();
                messageDto.setId(messageEntityList.get(i).getId());
                messageDto.setMessageTitle(messageEntityList.get(i).getMessageTitle());
                messageDto.setMessagetContent(messageEntityList.get(i).getMessageContent());
                messageDto.setMessageStatus(messageEntityList.get(i).getMessageStatus() == 1?"已读":"未读");
                messageDto.setMessageCreateTime(ConverDateTools.convertDateByCondition(messageEntityList.get(i).getMessageCreateTime()
                        ,ConverDateTools.YEAR_MONTH_DATE_HOUR_MINUTE_SECOND));
                for(int j = 0;j < messageTypeEntityList.size();j++){
                    if(messageEntityList.get(i).getMessageTypeId() == messageTypeEntityList.get(j).getId()){
                        messageDto.setMessageType(messageTypeEntityList.get(j).getMessageTypeName());
                        break;
                    }
                }
                messageDtoArrayList.add(messageDto);
            }
        }
        return messageDtoArrayList;
    }
}
