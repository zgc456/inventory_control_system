package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.WarningcommodityDTO;
import com.zhkj.inventory_control_dao.entity.WarningcommodityEntity;
import com.zhkj.inventory_control_tools.DataTables;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 库存预警类
 */
public interface InventoryWarningService {
    /**
     * 查询库存预警
     * @param state
     * @param messageCreateTime
     * @param commodityName
     * @param request
     * @return
     */
    DataTables warningcommodityEntityList(int state, Date messageCreateTime, String commodityName, HttpServletRequest request);

    /**
     * 展示库存预警做审核
     */
    WarningcommodityDTO findWarningCommdityEntityById(int id);

    WarningcommodityEntity findWarningCommdityEntityByIds(int id);

    int updateWarning(WarningcommodityEntity warningcommodityEntity);
}
