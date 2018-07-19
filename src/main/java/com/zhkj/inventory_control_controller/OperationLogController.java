package com.zhkj.inventory_control_controller;

import com.zhkj.inventory_control_api.api.OperationLogService;
import com.zhkj.inventory_control_api.dto.OperationLogDTO;
import com.zhkj.inventory_control_api.vo.OperationLogVO;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class OperationLogController {
    @Autowired
    private OperationLogService operationLogService;
    @RequestMapping(value = "/listOperationLog",method = RequestMethod.POST)
    public DataTables listOperationLog(OperationLogVO operationLogVO, HttpServletRequest request){
        return operationLogService.listOperationLog(operationLogVO,request);
    }
    @RequestMapping(value = "/selectOperationLog",method = RequestMethod.POST)
    public Result selectOperationLogByOperationId(Integer operationId){
        return operationLogService.selectOperationById(operationId);
    }
    @RequestMapping(value = "/deleteOperationLog",method = RequestMethod.POST)
    public Result deleteOperationLogByOperationId(Integer operationId){
        return operationLogService.deleteOperationLog(operationId);
    }
}
