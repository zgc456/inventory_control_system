package com.zhkj.inventory_control_service.inventory_control_inventory;

import com.zhkj.inventory_control_api.api.CommodityInventoryService;
import com.zhkj.inventory_control_api.api.OperationLogService;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.CommInventoryDto;
import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_api.vo.CommodityInventoryVo;
import com.zhkj.inventory_control_api.vo.CommodityVo;
import com.zhkj.inventory_control_dao.entity.CommodityEntity;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.SpecificationdetailedEntity;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_dao.mapper.CommodityInventoryMapper;
import com.zhkj.inventory_control_dao.mapper.CommodityMapper;
import com.zhkj.inventory_control_dao.mapper.SpecificationDetailedMapper;
import com.zhkj.inventory_control_tools.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommodityInventoryServiceImpl implements CommodityInventoryService {
    @Autowired
    private CommodityInventoryMapper commodityInventoryMapper;
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private SpecificationDetailedMapper specificationDetailedMapper;
    @Autowired
    private OperationLogService operationLogService;
    @Autowired
    private StatisticsService statisticsService;

    @Override
    public DataTables listCommodityByCondition(CommodityConditionVo commodityVo, HttpServletRequest request) {
        // 创建 DataTables 对象
        DataTables dataTables = new DataTables();
        // 拼合查询参数
        String condition = joinParam(commodityVo);
        // 获取分页起始位
        Integer startNumber = Integer.valueOf(request.getParameter("start"));
        // 根据条件查询,并分页
        List<CommodityinventoryEntity> commodityInventoryEntityList = commodityInventoryMapper.listCommodityByConditionLimit(condition
                ,startNumber,MessageConstant.PAGE_LENGTH);
        // 转换返回参数类型
        List<CommInventoryDto> commodityinventoryDTOList = getCommodityInventoryDto(commodityInventoryEntityList);
        // 获取查询总条数
        dataTables.setiTotalDisplayRecords(commodityInventoryMapper.listCommodityByCondition(condition).size());
        // 获取查询的条数
        dataTables.setiTotalRecords(commodityinventoryDTOList.size());
        // 存入查询的信息
        dataTables.setData(commodityinventoryDTOList);
        return dataTables;
    }

    @Override
    public Result selectCommodityByCommodityName(String commodityName) {
        Result result = new Result();
        if(null != commodityName && !"".equals(commodityName)){
            Integer resultCommodityCount = commodityMapper.selectCommodityByCommodityName(commodityName);
            if(resultCommodityCount > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.COMMODITY_NAME_REITERATION);
            }
        }
        return result;
    }

    @Override
    public Result selectCommodityByCommodityId(Integer commodityId) {
        Result result = new Result();
        if(null != commodityId && commodityId > 0){
            String condition = "AND commodityId = " + commodityId;
            List<CommodityinventoryEntity> commodityinventoryEntityList = commodityInventoryMapper.listCommodityByCondition(condition);
            if(null != commodityinventoryEntityList && commodityinventoryEntityList.size() > 0){
                result.setData(getCommodityInventoryDto(commodityinventoryEntityList));
                result.setSuccess(true);
            }
        }
        return result;
    }

    @Override
    public Result selectCommodityByCommodityInventoryId(Integer commodityInventoryId) {
        Result result = new Result();
        if(null != commodityInventoryId && commodityInventoryId > 0){
            String commodityInventory = "AND id = " + commodityInventoryId;
            List<CommodityinventoryEntity> commodityinventoryEntityList = commodityInventoryMapper.listCommodityByCondition(commodityInventory);
            if(null != commodityinventoryEntityList && commodityinventoryEntityList.size() > 0){
                result.setData(getCommodityInventoryDto(commodityinventoryEntityList));
                result.setSuccess(true);
            }
        }
        return result;
    }

    @Override
    public Result insertCommodityInventory(CommodityVo commodityVo,HttpServletRequest request) {
        Result result = new Result();
        if(null != commodityVo){
            CommodityEntity commodityEntity = new CommodityEntity();
            commodityEntity.setCommodityName(commodityVo.getCommodityName());
            commodityEntity.setSupplierId(commodityVo.getSupplier());
            int resultBoolean = commodityMapper.insertCommodity(commodityEntity);
            if(resultBoolean > 0){
                Integer resultCommodityId = commodityMapper.selectLastCommodityId();
                String sql = convertCommoditySku(resultCommodityId,commodityVo,specificationDetailedMapper.getSpecificationDetailed());
                int resultInt = commodityInventoryMapper.insertCommodityInventory(sql);
                if(resultInt > 0){
                    result.setSuccess(true);
                    result.setMessage(MessageConstant.INSERT_COMMODITY_SUCCEED);
                    operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_SHOP,MessageConstant.OPERATION_MODEL_ACTION_SHOP_INSERT
                            ,joinMessage(commodityVo,null,1),request);
                    insertFinance(resultBoolean);
                }
            }
        }
        return result;
    }

    @Override
    public Result deleteCommodityByCommodityInventoryId(Integer commodityId) {
        System.out.println(1);
        Result result = new Result();
        if(null != commodityId){
            CommodityinventoryEntity commodityinventoryEntity = commodityInventoryMapper
                    .selectCommodityinventoryToId(commodityId);
            int isTrue = commodityMapper.delCommodity(commodityinventoryEntity.getCommodityId());
            if(isTrue > 0){
                if(commodityInventoryMapper.delCommodityInventory(commodityId) > 0){
                    result.setSuccess(true);
                    result.setMessage(MessageConstant.DELETE_COMMODITY_SUCCEED);
                }
            }
        }
        return result;
    }

    @Override
    public Result updateCommodityByCommodityId(CommodityInventoryVo commodityInventoryVo,HttpServletRequest request) {
        Result result = new Result();
        if(null != commodityInventoryVo){
            // 获取要修改的商品库存信息
            CommodityinventoryEntity resultCommodityInventoryEntity = commodityInventoryMapper.selectCommodityinventoryToId(commodityInventoryVo.getId());
            if(commodityMapper.selectCommodityToName(commodityInventoryVo.getCommodityName()) < 1){
                /*
                    修改商品信息
                */
                CommodityEntity commodityEntity = new CommodityEntity();
                commodityEntity.setId(resultCommodityInventoryEntity.getCommodityId());
                commodityEntity.setCommodityName(commodityInventoryVo.getCommodityName());
                commodityEntity.setSupplierId(commodityInventoryVo.getSupplierId());
                commodityMapper.updateCommodity(commodityEntity);
            }
            // 获取商品规格信息
            List<SpecificationdetailedEntity> specificationdetailedEntityList = specificationDetailedMapper.getSpecificationDetailed();
            /*
                修改商品库存信息
             */
            CommodityinventoryEntity commodityInventoryEntity = new CommodityinventoryEntity();
            commodityInventoryEntity.setId(commodityInventoryVo.getId());
            commodityInventoryEntity.setCommodityNumber(commodityInventoryVo.getCommodityNumber());
            commodityInventoryEntity.setCommodityPrice(commodityInventoryVo.getCommodityPrice());
            commodityInventoryEntity.setCommoditySecurityLine(commodityInventoryVo.getCommoditySecurityLine());
            commodityInventoryEntity.setCommoditySku(splitCommoditySku(commodityInventoryVo.getCommoditySku(),specificationdetailedEntityList));
            if(commodityInventoryMapper.updateCommodityInventory(commodityInventoryEntity) > 0){
                result.setSuccess(true);
                result.setMessage(MessageConstant.OPERATION_MODEL_ACTION_SHOP_INSERT);
                CommodityVo commodityVo = new CommodityVo();
                commodityVo.setCommodityName(commodityInventoryVo.getCommodityName());
                commodityVo.setSupplierName(commodityInventoryVo.getSupplierName());
                operationLogService.insertOperationLog(MessageConstant.OPERATION_MODEL_SHOP,MessageConstant.OPERATION_MODEL_ACTION_SHOP_UPDATE
                ,joinMessage(commodityVo,commodityInventoryVo,2),request);
            }
        }
        return result;
    }

    private List<CommInventoryDto> getCommodityInventoryDto(List<CommodityinventoryEntity> commodityinventoryEntityList){
        String ids = joinParam(commodityinventoryEntityList);
        List<CommodityEntity> commodityEntityList = commodityMapper.listCommodityByCondition(ids);
        List<SpecificationdetailedEntity> specificationDetailedEntityList = specificationDetailedMapper.getSpecificationDetailed();
        return convertToDTO(commodityinventoryEntityList,commodityEntityList,specificationDetailedEntityList);
    }
    /**
     * 整合参数
     * @param commodityInventoryEntityList 要整合的参数信息
     * @return id 列表
     */
    private String joinParam(List<CommodityinventoryEntity> commodityInventoryEntityList){
        StringBuffer result = new StringBuffer();
        if(commodityInventoryEntityList.size() > 0){
            result.append("id IN (");
            if(commodityInventoryEntityList.size() > 1){
                 result.append(commodityInventoryEntityList.get(0).getCommodityId().toString());
                 for(int i = 1;i < commodityInventoryEntityList.size();i++){
                     result.append("," + commodityInventoryEntityList.get(i).getCommodityId().toString());
                 }
            }else {
                 result.append(commodityInventoryEntityList.get(0).getCommodityId().toString());
            }
            result.append(")");
        }
        return result.toString();
    }

    /**
     * 整合参数
     * @param commodityVo 查询条件
     * @return
     */
    private String joinParam(CommodityConditionVo commodityVo){
        StringBuffer stringBuffer = new StringBuffer();
        if(null != commodityVo){
            if(null != commodityVo.getCommodityName() && !commodityVo.getCommodityName().equals("")){
                List<CommodityEntity> commodityEntityList = commodityMapper.listCommodityByCondition(" AND commodityName LIKE '%"
                        + commodityVo.getCommodityName()+ "%'");
                if(null != commodityEntityList && commodityEntityList.size() > 0){
                    stringBuffer.append(" AND commodityId IN (");
                    if(commodityEntityList.size() > 1){
                        stringBuffer.append(commodityEntityList.get(0).getId());
                        for(int i = 1;i < commodityEntityList.size();i++){
                            stringBuffer.append("," + commodityEntityList.get(i).getId());
                        }
                    }else {
                        stringBuffer.append(commodityEntityList.get(0).getId());
                    }
                    stringBuffer.append(")");
                }
            }
            if(null != commodityVo.getCommoditySku() && !("").equals(commodityVo.getCommoditySku())){
                Integer commoditySku = Integer.valueOf(commodityVo.getCommoditySku());
                if(commoditySku > 0){
                    stringBuffer.append(" AND commoditySku = " + commodityVo.getCommoditySku());
                }
            }
            if(null != commodityVo.getCreateTime() && !commodityVo.getCreateTime().equals("")){
                stringBuffer.append(" AND commodityCreateTime > '" + commodityVo.getCreateTime() + " 00:00:00'");
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 拼合消息参数
     * @param commodityVo 商品信息
     * @param commodityInventoryVo 商品库存信息
     * @param index 标识
     * @return
     */
    private String joinMessage(CommodityVo commodityVo,CommodityInventoryVo commodityInventoryVo,int index){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("商品名称:" + commodityVo.getCommodityName());
        stringBuffer.append("\n供应厂商:" + commodityVo.getSupplierName());
        if(index == 1){
            for(int i = 0;i < commodityVo.getCommoditySku().length;i++){
                stringBuffer.append("\n商品规格:" + commodityVo.getCommoditySku()[i] + " 商品数量:" + commodityVo.getCommodityNumber()[i]
                        + " 商品警戒数量:" + commodityVo.getCommoditySecurityLine()[i] + " 商品价格:" + commodityVo.getCommodityPrice()[i]);
            }
        }else {
            stringBuffer.append("\n商品规格:" + commodityInventoryVo.getCommoditySku() + "商品数量:" + commodityInventoryVo.getCommodityNumber()
            + "商品警戒数量:" + commodityInventoryVo.getCommoditySecurityLine() + "商品价格:" + commodityInventoryVo.getCommodityPrice());
        }
        return stringBuffer.toString();
    }
    /**
     * 转换信息为DTO
     * @param commodityInventoryEntityList 商品库存列表
     * @param commodityEntityList 商品列表
     * @param specificationdetailedEntityList 规格详细列表
     * @return
     */
    private List<CommInventoryDto> convertToDTO(List<CommodityinventoryEntity> commodityInventoryEntityList,List<CommodityEntity> commodityEntityList
            ,List<SpecificationdetailedEntity> specificationdetailedEntityList){
        List<CommInventoryDto> commInventoryDtoList = new ArrayList<>();
        for(int i = 0;i < commodityInventoryEntityList.size();i++){
            CommInventoryDto commInventoryDto = new CommInventoryDto();
            commInventoryDto.setId(commodityInventoryEntityList.get(i).getId());
            commInventoryDto.setCommodityNumber(commodityInventoryEntityList.get(i).getCommodityNumber());
            commInventoryDto.setCommoditySecurityLine(commodityInventoryEntityList.get(i).getCommoditySecurityLine());
            commInventoryDto.setCommodityPrice(commodityInventoryEntityList.get(i).getCommodityPrice() + ".00");
            commInventoryDto.setCommoditySku(getCommoditySku(commodityInventoryEntityList.get(i).getCommoditySku(),specificationdetailedEntityList));
            commInventoryDto.setCommodityCreateTime(ConverDateTools.convertDateByCondition(commodityInventoryEntityList.get(i).getCommodityCreateTime()
                    ,ConverDateTools.YEAR_MONTH_DATE_HOUR_MINUTE_SECOND));
            for(int j = 0;j < commodityEntityList.size();j++){
                if(commodityInventoryEntityList.get(i).getCommodityId() == commodityEntityList.get(j).getId()){
                    commInventoryDto.setCommodity(commodityEntityList.get(j));
                    break;
                }
            }
            commInventoryDtoList.add(commInventoryDto);
        }
        return commInventoryDtoList;
    }

    /**
     * 获取商品详情名称
     * @param ids 商品详情
     * @param specificationdetailedEntityList 详细信息
     * @return 整合后的商品详情
     */
    private String[] getCommoditySku(String ids,List<SpecificationdetailedEntity> specificationdetailedEntityList){
        String[] id = ids.split(",");
        String[] sku = new String[id.length];
        for(int i = 0;i < id.length;i++){
            for(int j = 0;j < specificationdetailedEntityList.size();j++){
                if(id[i].equals(specificationdetailedEntityList.get(j).getId() + "")){
                    sku[i] = specificationdetailedEntityList.get(j).getDetailedName();
                    break;
                }
            }
        }
        return sku;
    }

    /**
     * 添加商品库存所需参数
     * @param commodityId 商品id
     * @param commodityVo 传入参数
     * @param specificationdetailedEntityList 规格详细集合
     * @return
     */
    private String convertCommoditySku(int commodityId,CommodityVo commodityVo,List<SpecificationdetailedEntity> specificationdetailedEntityList){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i < commodityVo.getCommoditySku().length;i++){
            String commoditySkuBuffer = splitCommoditySku(commodityVo.getCommoditySku()[i],specificationdetailedEntityList);
            if(commodityVo.getCommoditySku().length == 1 || i == (commodityVo.getCommoditySku().length - 1)){
                stringBuffer.append("("+commodityVo.getCommodityNumber()[i]+","+commodityVo.getCommoditySecurityLine()[i]
                        +"," +commodityVo.getCommodityPrice()[i] +",'"+commoditySkuBuffer+"',"+commodityId+",now())");
            }else{
                stringBuffer.append("("+commodityVo.getCommodityNumber()[i]+","+commodityVo.getCommoditySecurityLine()[i]
                        +"," +commodityVo.getCommodityPrice()[i] +",'"+commoditySkuBuffer+"',"+commodityId+",now())"+ ",");
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 拆分商品规格
     * @param commoditySku 要拆分的商品规格
     * @param specificationdetailedEntityList 商品规格
     * @return
     */
    private String splitCommoditySku(String commoditySku,List<SpecificationdetailedEntity> specificationdetailedEntityList){
        int index = 0;
        String[] commoditySkuStringList = commoditySku.split(" ");
        StringBuffer commoditySkuBuffer = new StringBuffer();
        for(int k = 1;k < commoditySkuStringList.length;k++){
            for(int u= 0;u < specificationdetailedEntityList.size();u++){
                if(specificationdetailedEntityList.get(u).getDetailedName().equals(commoditySkuStringList[k])){
                    if(commoditySkuStringList.length == 1 || (k == commoditySkuStringList.length - 1)){
                        commoditySkuBuffer.append(specificationdetailedEntityList.get(u).getId());
                    }else {
                        commoditySkuBuffer.append(specificationdetailedEntityList.get(u).getId() + ",");
                    }
                    index ++;
                    if(index == commoditySkuStringList.length - 1) break;
                }
            }
        }
        return commoditySkuBuffer.toString();
    }
    private void insertFinance(Integer index){
         List<CommodityinventoryEntity> commodityinventoryEntityList = commodityInventoryMapper.listCommodityByConditionLimit("1 = 1 ORDER BY id DESC"
                 ,0,index);
         for(CommodityinventoryEntity commodityinventoryEntity : commodityinventoryEntityList){
             StatisticsEntity statisticsEntity = new StatisticsEntity();
             statisticsEntity.setCommodityInventoryId(commodityinventoryEntity.getId());
             statisticsEntity.setStatisticsNumber(commodityinventoryEntity.getCommodityNumber());
             statisticsEntity.setFinancePrice(commodityinventoryEntity.getCommodityNumber() * commodityinventoryEntity.getCommodityPrice());
             statisticsEntity.setStatisticsTypeId(MessageConstant.STATISTICS_SHIPMENT);
             statisticsEntity.setFinanceTypeId(MessageConstant.FINANCE_EXPEND);
             statisticsService.insertStatiscs(statisticsEntity);
         }

    }
}
