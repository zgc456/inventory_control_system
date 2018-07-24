package com.zhkj.inventory_control_service.inventory_control_message;

import com.zhkj.inventory_control_api.api.InventoryWarningService;
import com.zhkj.inventory_control_api.dto.WarningcommodityDTO;
import com.zhkj.inventory_control_dao.entity.WarningcommodityEntity;
import com.zhkj.inventory_control_dao.mapper.WarningCommodityMapper;
import com.zhkj.inventory_control_tools.DataTables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author
 * 库存预警表
 * @Version 1.0
 * @Data 2018/7/24 7:39
 */
@Service
public class InventoryWarningImpl implements InventoryWarningService {
    @Autowired
    private WarningCommodityMapper warningCommodityMapper;
//生成采购计划单
    //采购计划单填写数量，交给后台审核
    //审核通过 生成采购开单 进货
    //拿进货单 补货 通知后台 补货
    public DataTables warningcommodityEntityList(int state, Date messageCreateTime, String commodityName, HttpServletRequest request){

        List<WarningcommodityEntity> warningcommodityEntities= warningCommodityMapper.findWarningCommodityByCondition(state,messageCreateTime,commodityName);
        DataTables dataTables = new DataTables();
        if (-1 != state||messageCreateTime!=null||commodityName!=null) {
            Integer startNumber = Integer.valueOf(request.getParameter("start"));

            List<WarningcommodityDTO> messageDTOS = convert(warningcommodityEntities);
            List<WarningcommodityEntity> Messagecount = warningCommodityMapper.findWarningCommodityByCondition(-1, null, null);

            dataTables.setiTotalDisplayRecords(Messagecount.size());
            dataTables.setiTotalRecords(messageDTOS.size());
            dataTables.setData(messageDTOS);
        } else {
            dataTables.setiTotalDisplayRecords(Integer.valueOf(0));
            dataTables.setiTotalRecords(Integer.valueOf(0));
            dataTables.setData(new ArrayList<>());
        }
        return dataTables;
    }

    private List<WarningcommodityDTO> convert(List<WarningcommodityEntity> warningcommodityEntities){
        List<WarningcommodityDTO> warningcommodityDTOS=new ArrayList<>();
        for (int i=0;i<warningcommodityEntities.size();i++){
            WarningcommodityDTO warningcommodityDTO=new WarningcommodityDTO();
            WarningcommodityEntity warningcommodityEntity= warningcommodityEntities.get(i);
            warningcommodityDTO.setId(i+1);
            warningcommodityDTO.setCommodityCount(warningcommodityEntity.getCommodityCount());
            warningcommodityDTO.setCommodityName(warningcommodityEntity.getCommodityName());
            warningcommodityDTO.setCommoditySpecification(warningcommodityEntity.getCommoditySpecification());
          String state="";
           if (warningcommodityEntity.getCommodityState()==1){
               state="已提交";
           }else if(warningcommodityEntity.getCommodityState()==2){
               state="未处理";
           }
            warningcommodityDTO.setCommodityState(state);
            warningcommodityDTO.setCommoditySupplier(warningcommodityEntity.getCommoditySupplier());
            warningcommodityDTO.setCommodityWaitCount(warningcommodityEntity.getCommodityWaitCount());
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            warningcommodityDTO.setCreateTime(sd.format(warningcommodityEntity.getCreateTime()));

            warningcommodityDTOS.add(warningcommodityDTO);
        }
            return warningcommodityDTOS;
    }


}
