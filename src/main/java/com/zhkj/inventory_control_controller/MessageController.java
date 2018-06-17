package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_service.inventory_control_message.MessageServiceImpl;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;
    @RequestMapping(value = "/getUnreadySum",method = RequestMethod.POST)
    public Result GetUnreadySum(){
        return messageService.listMessageSumByUnread();
    }
    @RequestMapping(value = "/listMessageAll",method = RequestMethod.POST)
    public Result listMessageAll(){
        return messageService.listMessageAll();
    }
    @RequestMapping(value = "/listMessage",method = RequestMethod.POST)
    public Result listMessage(String json){
        MessageVo messageVo = JSON.parseObject(json,MessageVo.class);
        return messageService.listMessageByCondition(messageVo);
    }
}
