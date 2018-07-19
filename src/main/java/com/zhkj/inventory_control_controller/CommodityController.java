package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_api.vo.CommodityInventoryVo;
import com.zhkj.inventory_control_api.vo.CommodityVo;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_service.inventory_control_inventory.CommodityInventoryServiceImpl;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CommodityController {
    @Autowired
    private CommodityInventoryServiceImpl commodityInventoryService;
    /**
     * 根据条件查询
     *      查询条件
     *          commodityName:商品名称
     *          commoditySku:商品规格
     *          createTime:开始时间
     *      分页条件
     *          skip:按钮页数跳转
     *              -1:首页          -2:末页
     *               1:上一页         2:下一页
     *          customPage:自定义页数跳转
     * @param json
     * @return
     */
    @RequestMapping(value = "/listCommodityByCondition",method = RequestMethod.POST)
    public DataTables listCommodityByCondition(String json, HttpServletRequest request){
        CommodityConditionVo commodityVo = JSON.parseObject(json,CommodityConditionVo.class);
        return commodityInventoryService.listCommodityByCondition(commodityVo,request);
    }

    /**
     * 添加商品
     * @param json 商品信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/insertCommodity",method = RequestMethod.POST)
    public Result insertCommodity(String json,HttpServletRequest request){
        CommodityVo commodityVo = JSON.parseObject(json,CommodityVo.class);
        return commodityInventoryService.insertCommodityInventory(commodityVo,request);
    }

    /**
     * 根据库存 id 查询商品库存
     * @param commodityId 库存 id
     * @return
     */
    @RequestMapping(value = "/selectCommodity",method = RequestMethod.POST)
    public Result selectCommodityByCommodityId(Integer commodityId){
        return commodityInventoryService.selectCommodityByCommodityInventoryId(commodityId);
    }

    /**
     * 修改商品信息
     * @param json 商品信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateCommodity",method = RequestMethod.POST)
    public Result updateCommodityByCommodityId(String json,HttpServletRequest request){
        CommodityInventoryVo commodityInventoryVo = JSON.parseObject(json,CommodityInventoryVo.class);
        return commodityInventoryService.updateCommodityByCommodityId(commodityInventoryVo,request);
    }

    /**
     * 根据商品 id 删除商品
     * @param commodityId 商品 id
     * @param request
     * @return
     */
    @RequestMapping(value = "/deleteCommodity",method = RequestMethod.POST)
    public Result deleteCommodityByCommodityId(Integer commodityId,HttpServletRequest request){
        return commodityInventoryService.deleteCommodityByCommodityInventoryId(commodityId,request);
    }
}
