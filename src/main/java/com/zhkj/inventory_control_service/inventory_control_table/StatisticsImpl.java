package com.zhkj.inventory_control_service.inventory_control_table;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.CommodityinventoryDTO;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_dao.entity.StatisticstypeEntity;
import com.zhkj.inventory_control_dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
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
    @Autowired
    private FinanceTypeMapper financeTypeMapper;

    @Override
    public List<StatisticsDTO> selectStatiscsEntityAll() {
        //查询所有的统计表
       List<StatisticsEntity> statisticsEntities= statisticsMapper.findStatisticsAll();
        return ConverToDTO(statisticsEntities);
    }

    @Override
    public Boolean delStatiscsEntity() {
        //删除统计表 所有数据
       int state= statisticsMapper.delStatistics();
       if (state==1){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public List<StatisticsDTO> selectStatiscsCondition(StatisticsEntity statisticsEntity) {
        //根据条件查询统计表
        List<StatisticsEntity> statisticsEntities= statisticsMapper.findStatisticsCondition(statisticsEntity);
        return ConverToDTO(statisticsEntities);

    }

    @Override
    public Boolean insertStatiscs(StatisticsEntity statisticsEntity) {
        //添加一条统计表数据
       int state= statisticsMapper.insertStatistics(statisticsEntity);
        if (state==1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 类型转换 方法
     * @param statisticsEntities
     * @return
     */
    private List<StatisticsDTO> ConverToDTO(List<StatisticsEntity> statisticsEntities) {
        List<StatisticsDTO> statisticsDtos=new ArrayList<>();
        for (int i=0;i<statisticsEntities.size();i++){
            StatisticsEntity statisticsEntity=statisticsEntities.get(i);
            StatisticsDTO statisticsDto=new StatisticsDTO();
            statisticsDto.setId(statisticsEntity.getId());
            //创建时间
            statisticsDto.setStatisticsCreateTime(statisticsEntity.getStatisticsCreateTime());
            //进货金额
            statisticsDto.setFinancePrice(statisticsEntity.getFinancePrice());
            //库存数量
            statisticsDto.setStatisticsNumber(statisticsEntity.getStatisticsNumber());
            StatisticstypeEntity statisticstypeEntity= statisticsTypeMapper.selectStatisticsTypeToId(statisticsEntity.getStatisticsTypeId());
            //拿到财务往来id
            Integer financeTypeId= statisticsEntity.getFinanceTypeId();
            //根据id查找财务往来类型
            String financeTypeName=financeTypeMapper.selectFinanceTypeToId(financeTypeId).getFinanceTypeName();
            statisticsDto.setFinanceType(financeTypeName);
            //统计表类型
            statisticsDto.setStatisticsType(statisticstypeEntity.getStatisticsTypeName());

            Integer commodityInventoryId= statisticsEntity.getCommodityInventoryId();
            //根据商品库存id，查询商品库存
            CommodityinventoryEntity commodityinventoryEntity= commodityInventoryMapper.selectCommodityinventoryToId(commodityInventoryId);
            CommodityinventoryDTO commodityinventoryDTO=new CommodityinventoryDTO();
            commodityinventoryDTO.setCommodityNumber(commodityinventoryEntity.getCommodityNumber());
            commodityinventoryDTO.setCommodityPrice(commodityinventoryEntity.getCommodityPrice());
            commodityinventoryDTO.setId(commodityinventoryEntity.getId());
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

