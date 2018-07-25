package com.zhkj.inventory_control_service.inventory_control_timer;

import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.WarningcommodityEntity;
import com.zhkj.inventory_control_dao.mapper.*;
import com.zhkj.inventory_control_service.inventory_control_inventory.CommodityInventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WarningCommodityTimerService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private WarningCommodityMapper warningCommodityMapper;
    @Autowired
    private CommodityInventoryMapper commodityInventoryMapper;
    @Autowired
    private SpecificationDetailedMapper specificationDetailedMapper;
    @Autowired
    private CommodityInventoryServiceImpl commodityInventoryService;

    public void execute(){
        List<CommodityinventoryEntity> commodityinventoryEntityList = commodityInventoryMapper.listCommodityInventorySecurityLine();
        if(null != commodityinventoryEntityList && commodityinventoryEntityList.size() > 0){
            commodityinventoryEntityList.forEach(
                    commodityinventoryEntity -> {
                        commodityMapper.listCommodityByCondition(null).forEach(
                                commodityEntity -> {
                                    if(commodityinventoryEntity.getCommodityId() == commodityEntity.getId()){
                                        if(warningCommodityMapper.listWarningCommodityByCommodityName(commodityEntity.getCommodityName(),1).size() > 0
                                                || warningCommodityMapper.listWarningCommodityByCommodityName(commodityEntity.getCommodityName(),2).size() == 0){
                                            warningCommodityMapper.insertWarningCommodity(convertWarningCommodityEntity(commodityinventoryEntity));
                                        }
                                    }
                                }
                        );
                    }
            );
        }
    }
    private WarningcommodityEntity convertWarningCommodityEntity(CommodityinventoryEntity commodityinventoryEntity){
        WarningcommodityEntity warningcommodityEntity = new WarningcommodityEntity();
        // 商品名称
        commodityMapper.listCommodityByCondition(null).forEach(
                commodityEntity -> {
                    if(commodityinventoryEntity.getCommodityId() == commodityEntity.getId()){
                        warningcommodityEntity.setCommodityName(commodityEntity.getCommodityName());
                    }
                }
        );
        // 商品规格
        warningcommodityEntity.setCommoditySpecification(commodityInventoryService.splitCommoditySku(commodityinventoryEntity.getCommoditySku()
                ,specificationDetailedMapper.getSpecificationDetailed()));
        // 商品剩余数量
        warningcommodityEntity.setCommodityCount(commodityinventoryEntity.getCommodityNumber());
        // 商品供应商
        commodityMapper.listCommodityByCondition(null).forEach(
                commodityEntity -> {
                    if(commodityinventoryEntity.getCommodityId() == commodityEntity.getId()){
                        supplierMapper.listSupplierAll().forEach(
                                supplierEntity -> {
                                    if(commodityEntity.getSupplierId() == supplierEntity.getId()){
                                        warningcommodityEntity.setCommoditySupplier(supplierEntity.getSupplierName());
                                    }
                                }
                        );
                    }
                }
        );
        return warningcommodityEntity;
    }
}
