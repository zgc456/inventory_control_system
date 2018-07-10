package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_api.vo.CommodityVo;
import com.zhkj.inventory_control_service.inventory_control_inventory.CommodityInventoryServiceImpl;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CommodityController {
    @Autowired
    private CommodityInventoryServiceImpl commodityInventoryService;
    @RequestMapping(value = "/setSession")
    public void setSession(HttpServletRequest request,String text){
        request.getSession().setAttribute("message",text);
        System.out.println(request.getSession().getAttribute("message"));
    }

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
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/listCommodityByCondition",method = RequestMethod.POST)
    public DataTables listCommodityByCondition(CommodityConditionVo commodityVo,HttpServletRequest request){
        return commodityInventoryService.listCommodityByCondition(commodityVo,request);
    }

    /**
     * 根据商品库存 id 查询商品
     * @param commodityId 商品 id
     * @return
     */
    @RequestMapping(value = "/selectCommodity",method = RequestMethod.POST)
    public Result selectCommodityById(Integer commodityId){
        return commodityInventoryService.selectCommodityByCommodityInventoryId(commodityId);
    }

    /**
     * 根据商品名称查询商品是否存在
     * @param commodityName 商品名称
     * @return
     */
    @RequestMapping(value = "/selectCommodityByName",method = RequestMethod.POST)
    public Result selectCommodityByName(String commodityName){
        return commodityInventoryService.selectCommodityByCommodityName(commodityName);
    }

    /**
     * 添加商品
     * @param json 商品信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/insertCommodity",method = RequestMethod.POST)
    public Result insertCommodity(String json, HttpServletRequest request){
        CommodityVo commodityVo = JSON.parseObject(json,CommodityVo.class);
        return commodityInventoryService.insertCommodityInventory(commodityVo,request);
    }

    /**
     * 删除商品
     * @param commodityInventoryId 商品库存id
     * @return
     */
    @RequestMapping(value = "/deleteCommodity",method = RequestMethod.POST)
    public Result deleteCommodityByCommodityInventoryId(Integer commodityInventoryId){
        return commodityInventoryService.deleteCommodityByCommodityInventoryId(commodityInventoryId);
    }
}
