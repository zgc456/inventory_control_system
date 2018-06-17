package com.zhkj.inventory_control_service.inventory_control_inventory;

import com.zhkj.inventory_control_api.api.CommodityInventoryService;
import com.zhkj.inventory_control_api.dto.CommInventoryDto;
import com.zhkj.inventory_control_api.vo.CommodityConditionVo;
import com.zhkj.inventory_control_dao.entity.CommodityEntity;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.Page;
import com.zhkj.inventory_control_dao.entity.SpecificationdetailedEntity;
import com.zhkj.inventory_control_dao.mapper.CommodityInventoryMapper;
import com.zhkj.inventory_control_dao.mapper.CommodityMapper;
import com.zhkj.inventory_control_dao.mapper.SpecificationDetailedMapper;
import com.zhkj.inventory_control_tools.GetSessionTools;
import com.zhkj.inventory_control_tools.PageTools;
import com.zhkj.inventory_control_tools.Result;
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
    @Override
    public Result listCommodityHomePage(HttpServletRequest request) {
        Result result = new Result();
        Page page = GetSessionTools.getCommodityPage(request);
        page.setiTotalRecords(commodityInventoryMapper.listCommodityByCondition(null).size());
        PageTools.helpPageSkip(page,0,0);
        List<CommodityinventoryEntity> commodityInventoryEntityList = commodityInventoryMapper.listCommodityByConditionLimit(null
                ,page.getiDisplayStart(),page.getPageDisplayLength());
        if(null != commodityInventoryEntityList){
            page.setPageData(getCommodityInventoryDto(commodityInventoryEntityList));
            result.setSuccess(true);
            result.setData(page);
        }
        return result;
    }

    @Override
    public Result listCommodityByCondition(CommodityConditionVo commodityVo, HttpServletRequest request) {
        Result result = new Result();
        if(null != commodityVo){
            Page page = GetSessionTools.getCommodityPage(request);
            String condition = joinParam(commodityVo);
            page.setiTotalRecords(commodityInventoryMapper.listCommodityByCondition(condition).size());
            PageTools.helpPageSkip(page,commodityVo.getSkip(),commodityVo.getCustomPage());
            List<CommodityinventoryEntity> commodityInventoryEntityList = commodityInventoryMapper.listCommodityByConditionLimit(condition
                    ,page.getiDisplayStart(),page.getPageDisplayLength());
            if(null != commodityInventoryEntityList){
                page.setPageData(getCommodityInventoryDto(commodityInventoryEntityList));
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return result;
    }

    @Override
    public Result selectCommodityByCommodityInventoryId(Integer commodityInventoryId) {
        Result result = new Result();
        if(null != commodityInventoryId && commodityInventoryId > 0){
            String condition = "AND commodityId = " + commodityInventoryId;
            List<CommodityinventoryEntity> commodityinventoryEntityList = commodityInventoryMapper.listCommodityByCondition(condition);
            if(null != commodityinventoryEntityList){
                result.setData(getCommodityInventoryDto(commodityinventoryEntityList));
                result.setSuccess(true);
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
        if(null != commodityVo.getCommoditySku() && !commodityVo.getCommoditySku().equals("")){
            stringBuffer.append(" AND commoditySku = " + commodityVo.getCommoditySku());
        }
        if(null != commodityVo.getCreateTime() && !commodityVo.getCreateTime().equals("")){
            stringBuffer.append(" AND commodityCreateTime > " + commodityVo.getCreateTime());
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
            commInventoryDto.setCommodityPrice(commodityInventoryEntityList.get(i).getCommodityPrice());
            commInventoryDto.setCommoditySmallPictureUrl(commodityInventoryEntityList.get(i).getCommoditySmallPictureUrl());
            commInventoryDto.setCommoditySku(getCommoditySku(commodityInventoryEntityList.get(i).getCommoditySku(),specificationdetailedEntityList));
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
}
