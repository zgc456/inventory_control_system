package com.zhkj.inventory_control_service.inventory_control_operation_log;

import com.zhkj.inventory_control_api.api.OperationLogService;
import com.zhkj.inventory_control_api.dto.OperationLogDTO;
import com.zhkj.inventory_control_api.vo.OperationLogVO;
import com.zhkj.inventory_control_dao.entity.OperationlogEntity;
import com.zhkj.inventory_control_dao.mapper.OperationLogMapper;
import com.zhkj.inventory_control_tools.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class OperationLogServiceImpl implements OperationLogService {
    @Autowired
    private OperationLogMapper operationLogMapper;
    @Override
    public DataTables listOperationLog(OperationLogVO operationLogVO , HttpServletRequest request) {
        DataTables dataTables = new DataTables();
        if(null != operationLogVO){
            String condition = joinParam(operationLogVO);
            Integer startNumber = Integer.valueOf(request.getParameter("start"));
            List<OperationlogEntity> operationlogEntityList = operationLogMapper.listOperationLogLimit(condition,startNumber,MessageConstant.PAGE_LENGTH);
            List<OperationLogDTO> operationLogDTOList = convertOperationLog(operationlogEntityList);
            dataTables.setiTotalDisplayRecords(operationLogMapper.countOperationLog(condition));
            dataTables.setiTotalRecords(operationLogDTOList.size());
            dataTables.setData(operationLogDTOList);
        }else {
            dataTables.setiTotalDisplayRecords(Integer.valueOf(0));
            dataTables.setiTotalRecords(Integer.valueOf(0));
            dataTables.setData(new ArrayList<>());
        }
        return dataTables;
    }

    @Override
    public Result selectOperationById(Integer operationId) {
        Result result = new Result();
        if(null != operationId && operationId > 0){
            List<OperationlogEntity> operationLogEntityList = operationLogMapper.selectOperationLogByOperationId(operationId);
            result.setData(convertOperationLog(operationLogEntityList).get(0));
            result.setSuccess(true);
        }
        return result;
    }

    @Override
    public Result insertOperationLog(String operationModel,String modelAction,String operationDescribe,HttpServletRequest request) {
        Result result = new Result();
        OperationlogEntity operationlogEntity = new OperationlogEntity();
        operationlogEntity.setOperationModel(operationModel);
        operationlogEntity.setOperationModelAction(modelAction);
        operationlogEntity.setOperationDescribe(operationDescribe);
        operationlogEntity.setOperationUserName(GetSessionTools.getUserNameBySession(request));
        if(operationLogMapper.insertOperationLog(operationlogEntity) > 0){
            result.setSuccess(true);
        }
        return result;
    }

    @Override
    public Result deleteOperationLog(Integer operationLogId) {
        Result result = new Result();
        if(null != operationLogId && operationLogId > 0){
            if(operationLogMapper.deleteOperationLog(operationLogId) > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.DELETE_OPERATION_LOG_SUCCEED);
            }
        }
        return result;
    }

    /**
     * 拼合参数
     * @param operationLogVO 查询信息
     * @return
     */
    private String joinParam(OperationLogVO operationLogVO){
        StringBuffer condition = new StringBuffer();
        if(null != operationLogVO.getOperationUserName() && !("").equals(operationLogVO.getOperationUserName())){
            condition.append(" AND operationUserName LIKE '%" + operationLogVO.getOperationUserName() + "%'");
        }
        if(null != operationLogVO.getOperationModel() && !("").equals(operationLogVO.getOperationModel())){
            if(!"请选择".equals(operationLogVO.getOperationModel())){
                condition.append(" AND operationModel = '" + operationLogVO.getOperationModel() + "'");
            }
        }
        if(null != operationLogVO.getOperationModelAction() && !("").equals(operationLogVO.getOperationModelAction())){
            if(!"请选择".equals(operationLogVO.getOperationModelAction())) {
                condition.append(" AND operationModelAction LIKE '%" + operationLogVO.getOperationModelAction() + "'");
            }
        }
        if(null != operationLogVO.getOperationCreateTime() && !("").equals(operationLogVO.getOperationCreateTime())) {
            condition.append(" AND operationCreateTime >= '" + operationLogVO.getOperationCreateTime() + " 00:00:00'");
        }
        return condition.toString();
    }

    /**
     * 转换DTO
     * @param operationLogEntityList 要转换的集合
     * @return
     */
    private List<OperationLogDTO> convertOperationLog(List<OperationlogEntity> operationLogEntityList){
        List<OperationLogDTO> operationLogDTOList = new ArrayList<>();
        for(int i = 0;i < operationLogEntityList.size();i++){
            OperationLogDTO operationLogDTO = new OperationLogDTO();
            operationLogDTO.setSortId(i + 1);
            operationLogDTO.setId(operationLogEntityList.get(i).getId());
            operationLogDTO.setOperationModel(operationLogEntityList.get(i).getOperationModel());
            operationLogDTO.setOperationName(operationLogEntityList.get(i).getOperationUserName());
            operationLogDTO.setOperationDescribe(operationLogEntityList.get(i).getOperationDescribe());
            operationLogDTO.setOperationModelAction(operationLogEntityList.get(i).getOperationModelAction());
            operationLogDTO.setOperationCreateTime(ConverDateTools.convertDateByCondition(operationLogEntityList.get(i).getOperationCreateTime()
                    ,ConverDateTools.YEAR_MONTH_DATE_HOUR_MINUTE_SECOND));
            operationLogDTOList.add(operationLogDTO);
        }
        return operationLogDTOList;
    }
}
