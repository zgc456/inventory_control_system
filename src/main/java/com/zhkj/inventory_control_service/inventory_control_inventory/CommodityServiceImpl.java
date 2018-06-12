package com.zhkj.inventory_control_service.inventory_control_inventory;

import com.zhkj.inventory_control_api.api.CommodityService;
import com.zhkj.inventory_control_api.dto.SpecificationtopicDto;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/5 17:44
 */
public class CommodityServiceImpl implements CommodityService {
    @Override
    public boolean stock() {
        return false;
    }

    @Override
    public boolean salesReturn() {
        return false;
    }

    @Override
    public boolean inventoryChanges() {
        return false;
    }

    @Override
    public boolean deleteInventory() {
        return false;
    }

    @Override
    public List<SpecificationtopicDto> selectSpecificationtopic() {
        return null;
    }
}
