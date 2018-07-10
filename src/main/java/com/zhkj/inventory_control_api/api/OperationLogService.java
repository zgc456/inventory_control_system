package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.OperationLogDTO;
import com.zhkj.inventory_control_api.vo.OperationLogVO;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OperationLogService {
    /**
     * 查询操作日志
     * @param operationLogVO 查询信息
     * @param request
     * @return
     */
    DataTables listOperationLog(OperationLogVO operationLogVO , HttpServletRequest request);

    /**
     * 根据 id 查询操作日志
     * @return
     */
    Result selectOperationById(Integer operationId);
    /**
     * 添加操作日志
     * @param operationModel 操作模块
     * @param modelAction 操作模块动作
     * @param operationDescribe 操作日志说明
     * @param request
     * @return
     */
    Result insertOperationLog(String operationModel,String modelAction,String operationDescribe,HttpServletRequest request);

    /**
     * 删除操作日志
     * @param operationLogId 操作日志 id
     * @return
     */
    Result deleteOperationLog(Integer operationLogId);
}
