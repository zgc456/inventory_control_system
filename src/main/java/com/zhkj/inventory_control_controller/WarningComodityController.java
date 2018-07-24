package com.zhkj.inventory_control_controller;
import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.api.InventoryWarningService;
import com.zhkj.inventory_control_api.dto.WarningcommodityDTO;
import com.zhkj.inventory_control_api.vo.WarningVO;
import com.zhkj.inventory_control_tools.DataTables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
/**
 * 预警
 * @author
 * @Version 1.0
 * @Data 2018/7/24 8:50
 */
@RestController
public class WarningComodityController {
    @Autowired
   private InventoryWarningService inventoryWarningService;
    @RequestMapping("/findWarningCommodity")
    public DataTables fingMessageByWarningCommodity(@RequestParam("json") String json, HttpServletRequest request){
        WarningVO warningVO= JSONObject.parseObject(json,WarningVO.class);
        return inventoryWarningService.warningcommodityEntityList(warningVO.getState(),warningVO.getMessageCreateTime(),warningVO.getCommodityName(),request);
    }

    //根据id查询信息
    @RequestMapping("/findWarningById")
    public WarningcommodityDTO findWarningById(int id){
        WarningcommodityDTO warningcommodityDTO=inventoryWarningService.findWarningCommdityEntityById(id);
        return warningcommodityDTO;
    }
    //提交审核
}
