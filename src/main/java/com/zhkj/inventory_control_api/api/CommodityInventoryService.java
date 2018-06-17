package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_tools.Result;

import javax.servlet.http.HttpServletRequest;

public interface CommodityInventoryService {
    /**
     * 查询首页数据
     * @return
     */
    Result listCommodityHomePage(HttpServletRequest request);

    /**
     * 根据条件查询商品
     * @param commodityVo 查询条件
     * @return
     */
    Result listCommodityByCondition(CommodityConditionVo commodityVo, HttpServletRequest request);

    /**
     * 根据商品库存 id 查询商品
     * @param commodityInventoryId 商品库存 id
     * @return
     */
    Result selectCommodityByCommodityInventoryId(Integer commodityInventoryId);
}
