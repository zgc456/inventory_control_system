package com.zhkj.inventory_control_service.inventory_control_table;

import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.CommodityinventoryDTO;
import com.zhkj.inventory_control_api.dto.StatisticsDto;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_dao.entity.StatisticstypeEntity;
import com.zhkj.inventory_control_dao.mapper.*;
import com.zhkj.inventory_control_tools.ServiceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 统计表实现类
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/4 16:30
 */
@Service
public class StatisticsImpl implements StatisticsService {
    @Autowired
   private StatisticsMapper statisticsMapper;
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private CommodityInventoryMapper commodityInventoryMapper;
    @Autowired
    private SpecificationDetailedMapper specificationDetailedMapper;
    @Autowired
    private StatisticsTypeMapper statisticsTypeMapper;
    private  List<StatisticsEntity> list=null;
    private List<StatisticsDto> statisticsDtos=null;
    @Override
    public List<StatisticsDto> selectStatisticsStock() {
        list= statisticsMapper.selectStatistics(ServiceConstant.STOCK);
        statisticsDtos=ConverToDTO(list);
        return statisticsDtos;
    }

    @Override
    public List<StatisticsDto> selectStatisticsSaleReturn() {
        list= statisticsMapper.selectStatistics(ServiceConstant.SALES_RETURN);
        statisticsDtos=ConverToDTO(list);
        return statisticsDtos;
    }

    @Override
    public List<StatisticsDto> selectStatisticsSale() {
        list= statisticsMapper.selectStatistics(ServiceConstant.SALE);
        statisticsDtos=ConverToDTO(list);
        return statisticsDtos;
    }

    @Override
    public List<StatisticsDto> selectStatisticsAll() {
        list= statisticsMapper.selectStatistics(ServiceConstant.STOCK_AND_EXPEND_AND_INCOME_AND_EXPEND);
        statisticsDtos=ConverToDTO(list);
        return statisticsDtos;
    }

    @Override
    public void insertStatistics(StatisticsEntity statisticsEntity) {
        statisticsMapper.insertStatistics(statisticsEntity);
    }

    @Override
    public boolean insertStatisticsALL(List<StatisticsVO> Statistics) {

        for (int i=0;i<Statistics.size();i++){
            StatisticsVO statisticsVO=Statistics.get(i);
            String topic=""+statisticsVO.getSpeciflcationDetailed()+","+statisticsVO.getSpecificationDetailed2();
            //根据商品名称 查询到商品id
            Integer commodityId= commodityMapper.selectCommodityToName(statisticsVO.getCommodityName());
            //根据商品id 查询库存id
            List<CommodityinventoryEntity> commodityinventoryEntities= commodityInventoryMapper.selectCommodityinventoryToCommmodityId(commodityId);
            //拿到库存id集合 遍历库存id （根据前台传来的类型id数组集合，查询库存id 添加数据库）
            for (int j=0;j<commodityinventoryEntities.size();j++){
               CommodityinventoryEntity commodityinventoryEntities1=commodityinventoryEntities.get(i);
                if (commodityinventoryEntities1.getCommoditySku().equals(topic)){
                    StatisticsEntity statisticsEntity=new StatisticsEntity();
                    Date date=new Date();
                    Timestamp timestamp=new Timestamp(date.getTime());
                    statisticsEntity.setCommodityInventoryId(commodityinventoryEntities1.getId());
                    statisticsEntity.setStatisticsCreateTime(timestamp);
                    statisticsEntity.setStatisticsTypeId(statisticsVO.getTypeId());
                    insertStatistics(statisticsEntity);
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public List<StatisticsDto> ConverToDTO(List<StatisticsEntity> statisticsEntities) {
        List<StatisticsDto> statisticsDtos=new ArrayList<>();
        for (int i=0;i<statisticsEntities.size();i++){
            StatisticsEntity statisticsEntity=statisticsEntities.get(i);
            StatisticsDto statisticsDto=new StatisticsDto();
            //创建时间
            statisticsDto.setStatisticsCreateTime(statisticsEntity.getStatisticsCreateTime());
            //库存数量
            statisticsDto.setStatisticsNumber(statisticsEntity.getStatisticsNumber());
            StatisticstypeEntity statisticstypeEntity= statisticsTypeMapper.selectStatisticsTypeToId(statisticsEntity.getStatisticsTypeId());
            //统计表类型
            statisticsDto.setStatisticsType(statisticstypeEntity.getStatisticsTypeName());

           Integer commodityInventoryId= statisticsEntity.getCommodityInventoryId();
            //根据商品库存id，查询商品库存
           CommodityinventoryEntity commodityinventoryEntity= commodityInventoryMapper.selectCommodityinventoryToId(commodityInventoryId);
            CommodityinventoryDTO commodityinventoryDTO=new CommodityinventoryDTO();
            commodityinventoryDTO.setCommodityNumber(commodityinventoryEntity.getCommodityNumber());
            commodityinventoryDTO.setCommodityPrice(commodityinventoryEntity.getCommodityPrice());
            //获取商品id
            Integer commodityId= commodityinventoryEntity.getCommodityId();
            //根据商品id 查询商品名字
            String commodityName= commodityMapper.selectCommodityToId(commodityId);
            commodityinventoryDTO.setCommodityName(commodityName);
            //根据商品规格id 查询商品详细规格
            String specificationSku=commodityinventoryEntity.getCommoditySku();
            //根据逗号分割
            String specificationdetailedId= specificationSku.split(",")[0];
            String specificationdetailedId1= specificationSku.split(",")[1];
            //根据类型id 查询规格名字
           String detaiedName=specificationDetailedMapper.selectSpecificationDetailedId(Integer.parseInt(specificationdetailedId));
           String detaiedName1=specificationDetailedMapper.selectSpecificationDetailedId(Integer.parseInt(specificationdetailedId1));
            commodityinventoryDTO.setCommoditySku(detaiedName+","+detaiedName1);
            statisticsDto.setCommodityInventory(commodityinventoryDTO);
            statisticsDtos.add(statisticsDto);
        }
        return statisticsDtos;
    }
}
