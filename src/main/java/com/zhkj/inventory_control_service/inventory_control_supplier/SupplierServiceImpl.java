package com.zhkj.inventory_control_service.inventory_control_supplier;
import com.zhkj.inventory_control_api.dto.SupplierDto;
import com.zhkj.inventory_control_api.vo.SupplierVo;
import com.zhkj.inventory_control_dao.entity.SupplierEntity;
import com.zhkj.inventory_control_dao.mapper.SupplierMapper;
import com.zhkj.inventory_control_tools.Conver_Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements com.zhkj.inventory_control_api.api.SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public List<SupplierDto> selectSupplier() {
        try {
            List<SupplierDto> supplierEntityList =new ArrayList<SupplierDto>();
            supplierEntityList=  Conver_Type.convertToList(supplierEntityList,supplierMapper.selectSupplier(),SupplierDto.class);
            return supplierEntityList;
        }catch (Exception e){
             return null;
        }
    }
    @Override
    public SupplierDto selectSupplierToSupplierName(String name) {
        try {
            SupplierDto supplierDto=new SupplierDto();
            if (null==name){
                System.out.println("传入参数为空");
                return null;
            }
            SupplierEntity supplierEntity=supplierMapper.selectSupplierToSupplierName(name);
            supplierDto=Conver_Type.convert(supplierDto,supplierEntity);
            return supplierDto;
        }catch (Exception e){
            System.out.println("出错了");
             return null;
        }

    }
    @Override
    public boolean insertSupplier(SupplierVo supplierVo) {
        if (null==supplierVo){
            System.out.println("传入参数失败");
            return false;
        }
        try {
            SupplierEntity supplierEntity=new SupplierEntity();
            supplierEntity=Conver_Type.convert(supplierEntity,supplierVo);
            supplierMapper.insertSupplier(supplierEntity);
            return true;
        }catch (Exception e){
            System.out.println("出错了");
            return false;
        }
    }
    @Override
    public boolean updateSupplier(SupplierVo supplierVo) {
        if (null==supplierVo){
            System.out.println("传入参数失败");
            return false;
        }
        try {
            SupplierEntity supplierEntity=new SupplierEntity();
            supplierEntity=Conver_Type.convert(supplierEntity,supplierVo);
            supplierMapper.updateSupplier(supplierEntity);
            return true;
        }catch (Exception e){
            System.out.println("出错了");
            return false;
        }
    }
}
