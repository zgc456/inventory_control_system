package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_service.inventory_control_inventory.CommodityInventoryServiceImpl;
import com.zhkj.inventory_control_tools.Result;
import org.omg.CORBA.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class CommodityController {
    @Autowired
    private CommodityInventoryServiceImpl commodityInventoryService;
    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping(value = "/listCommodityHomePage",method = RequestMethod.POST)
    public Result listCommodityHomePage(HttpServletRequest request) {
        return commodityInventoryService.listCommodityHomePage(request);
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
     * @param json
     * @return
     */
    @RequestMapping(value = "/listCommodityByCondition",method = RequestMethod.POST)
    public Result listCommodityByCondition(String json){
        CommodityConditionVo commodityVo = JSON.parseObject(json,CommodityConditionVo.class);
        return null;
    }

    /**
     * 根据商品库存 id 查询商品
     * @param commodityId 商品 id
     * @return
     */
    @RequestMapping(value = "/selectCommodity",method = RequestMethod.POST)
    public Result selectCommodityById(Integer commodityId){
        return null;
    }


}
