package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.api.MessageService;
import com.zhkj.inventory_control_api.dto.MessageDTO;
import com.zhkj.inventory_control_api.vo.MessageVo;
import com.zhkj.inventory_control_dao.entity.MessageEntity;
import com.zhkj.inventory_control_tools.DataTables;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;

    @ResponseBody
    @RequestMapping("/findMessage")
    public DataTables findMessage(@RequestParam("json") String json, HttpServletRequest request) {
        MessageVo messageVo = JSON.parseObject(json, MessageVo.class);
        DataTables dataTables = messageService.findMessageByCondition(messageVo, request);
        return dataTables;
    }

    @RequestMapping("/selectMessageById")
    @ResponseBody
    public List<MessageDTO> selectMessageById(@RequestParam(value = "id", required = false) int id) {
        return messageService.findMessageById(id);
    }
    @RequestMapping("/auditMessage")
    @ResponseBody
    public String auditMessage(@RequestParam(value = "id", required = false) int id,@RequestParam(value = "messageState", required = false) int messageState, HttpServletRequest request,@RequestParam(value = "messageTitle", required = false) String messageTitle){
       //messageState 1 审核通过  -1 审核拒绝
        return messageService.isApprove(id,messageState,messageTitle,request);
    }
}
