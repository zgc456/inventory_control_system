package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_api.vo.CommodityVo;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;

import javax.servlet.http.HttpServletRequest;

public interface CommodityInventoryService {


    /**
     * 根据条件查询商品
     * @param commodityVo 查询条件
     * @return
     */
    DataTables listCommodityByCondition(CommodityConditionVo commodityVo, HttpServletRequest request);

    /**
     * 根据商品名称查询商品
     * @param commodityName 商品名称
     * @return
     */
    Result selectCommodityByCommodityName(String commodityName);
    /**
     * 根据库存中的商品id 查询商品
     * @param commodityId 库存商品 id
     * @return
     */
    Result selectCommodityByCommodityId(Integer commodityId);

    /**
     * 根据库存id查询库存信息
     * @param commodityInventoryId 库存id
     * @return
     */
    Result selectCommodityByCommodityInventoryId(Integer commodityInventoryId);

    /**
     * 添加商品
     * @param commodityVo 商品信息
     * @return
     */
    Result insertCommodityInventory(CommodityVo commodityVo,HttpServletRequest request);

    /**
     * 根据库存id删除商品
     * @param commodityId 库存id
     * @return
     */
    Result deleteCommodityByCommodityInventoryId(Integer commodityId);
}
