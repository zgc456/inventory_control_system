package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.SpecificationtopicDto;

import java.util.List;

/**
 * 商品
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/5 16:37
 */
public interface CommodityService {
    /**
     * 进货
     */
    boolean stock();
    /**
     * 退货
     */
    boolean salesReturn();
    /**
     * 修改库存
     */
    boolean inventoryChanges();
    /**
     * 删除货物
     */
    boolean deleteInventory();
    /**
     * 查看所有规格
     */
    List<SpecificationtopicDto> selectSpecificationtopic();
}
