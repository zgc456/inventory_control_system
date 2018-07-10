package com.zhkj.inventory_control_service.inventory_control_supplier;
import com.zhkj.inventory_control_api.api.OperationLogService;
import com.zhkj.inventory_control_api.api.SupplierService;
import com.zhkj.inventory_control_api.dto.SupplierDto;
import com.zhkj.inventory_control_api.vo.SupplierVo;
import com.zhkj.inventory_control_dao.entity.OperationlogEntity;
import com.zhkj.inventory_control_dao.entity.SupplierEntity;
import com.zhkj.inventory_control_dao.mapper.SupplierMapper;
import com.zhkj.inventory_control_tools.Conver_Type;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.MessageConstant;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private OperationLogService operationLogService;
    @Override
    public DataTables selectSupplier(HttpServletRequest request) {
        DataTables dataTables = new DataTables();
        Integer startNumber = Integer.valueOf(0);
        Integer lengthNumber = Integer.valueOf(10);
        if(null != request.getParameter("start")){
            startNumber = Integer.valueOf(request.getParameter("start"));
            lengthNumber = Integer.valueOf(request.getParameter("length"));
        }
        List<SupplierEntity> supplierEntityList = supplierMapper.listSupplierLimit(startNumber,lengthNumber);
        if(null != supplierEntityList && supplierEntityList.size() > 0){
            dataTables.setiTotalRecords(supplierMapper.countSupplier());
            dataTables.setiTotalDisplayRecords(supplierEntityList.size());
            dataTables.setData(supplierEntityList);
        }else {
            dataTables.setiTotalRecords(supplierMapper.countSupplier());
            dataTables.setiTotalDisplayRecords(supplierEntityList.size());
            dataTables.setData(supplierEntityList);
        }
        return dataTables;
    }
    @Override
    public Result selectSupplierToSupplierName(String name) {
        Result result = new Result();
        if(null != name && !"".equals(name)){
            name = "'%"+ name +"%'";
            List<SupplierEntity> supplierEntity= supplierMapper.selectSupplierToSupplierName(name);
            if(null != supplierEntity && supplierEntity.size() > 0){
                result.setSuccess(true);
                result.setData(supplierEntity);
            }
        }
        return result;
    }

    @Override
    public Result selectSupplierBySupplierId(Integer supplierId) {
        Result result = new Result();
        if(null != supplierId && supplierId > 0){
            SupplierEntity supplierEntity = supplierMapper.selectSupplierBySupplierId(supplierId);
            if(null != supplierEntity){
                result.setSuccess(true);
                result.setData(supplierEntity);
            }
        }
        return result;
    }

    @Override
    public Result insertSupplier(SupplierVo supplierVo,HttpServletRequest request) {
        Result result = new Result();
        if(null != supplierVo){
            SupplierEntity supplierEntity=new SupplierEntity();
            supplierEntity=Conver_Type.convert(supplierEntity,supplierVo);
            int isTrue = supplierMapper.insertSupplier(supplierEntity);
            if(isTrue > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.INSERT_SUPPLIER_SUCCEED);
                String operationDescribe = "供应商名称:" + supplierVo.getSupplierName()
                        + "\n供应商电话:" + supplierVo.getSupplierPhone()
                        + "\n供应商介绍:" + supplierVo.getSupplierRemark() ;
                operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_SUPPLIER,MessageConstant.OPERATION_MODEL_ACTION_SUPPLIER_INSERT
                ,operationDescribe,request);
            }
        }
        return result;
    }
    @Override
    public Result updateSupplier(SupplierVo supplierVo,HttpServletRequest request) {
        Result result = new Result();
        if(null != supplierVo){
            SupplierEntity supplierEntity=new SupplierEntity();
            supplierEntity=Conver_Type.convert(supplierEntity,supplierVo);
            int isTrue = supplierMapper.updateSupplier(supplierEntity);
            if(isTrue > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.UPDATE_SUPPLIER_SUCCEED);
                String operationDescribe = "供应商名称:" + supplierVo.getSupplierName()
                        + "\n供应商电话:" + supplierVo.getSupplierPhone()
                        + "\n供应商介绍:" + supplierVo.getSupplierRemark() ;
                operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_SUPPLIER,MessageConstant.OPERATION_MODEL_ACTION_SUPPLIER_UPDATE
                        ,operationDescribe,request);
            }
        }
        return result;
    }

    @Override
    public Result deleteSupplierBySupplierId(Integer supplierId,HttpServletRequest request) {
        Result result = new Result();
        if(null != supplierId && supplierId > 0){
            SupplierEntity supplierEntity = supplierMapper.selectSupplierBySupplierId(supplierId);
            int isTrue = supplierMapper.deleteSupplierBySupplierId(supplierId);
            if(isTrue > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.DELETE_SUPPLIER_SUCCEED);
                String operationDescribe = "供应商名称:" + supplierEntity.getSupplierName()
                        + "\n供应商电话:" + supplierEntity.getSupplierPhone()
                        + "\n供应商介绍:" + supplierEntity.getSupplierRemark() ;
                operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_SUPPLIER,MessageConstant.OPERATION_MODEL_ACTION_SUPPLIER_DELETE
                        ,operationDescribe,request);
            }
        }
        return result;
    }
}