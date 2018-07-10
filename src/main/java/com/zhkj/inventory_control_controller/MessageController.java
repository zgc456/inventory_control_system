package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_service.inventory_control_message.MessageServiceImpl;
import com.zhkj.inventory_control_tools.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
public class MessageController {
     @Autowired
     private MessageService  messageService;
     @ResponseBody
     @RequestMapping("/findMessage")
     public List<MessageDTO> findMessage(@RequestParam(value = "messageToken",required = false) String messageToken, @RequestParam(value = "messageCreateTime",required = false) Date messageCreateTime, @RequestParam(value = "messageStatus",required = false) Integer messageStatus){
         List<MessageDTO> messageDTOS= messageService.findMessageByCondition(messageToken,messageCreateTime,messageStatus);
         return messageDTOS;
     }
}
