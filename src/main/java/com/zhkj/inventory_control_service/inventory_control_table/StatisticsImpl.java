package com.zhkj.inventory_control_service.inventory_control_table;
import com.zhkj.inventory_control_api.api.StatisticsService;
import com.zhkj.inventory_control_api.dto.CommodityinventoryDTO;
import com.zhkj.inventory_control_api.dto.PercentageDTO;
import com.zhkj.inventory_control_api.dto.StatisticsDTO;
import com.zhkj.inventory_control_api.vo.StatisticsVO;
import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import com.zhkj.inventory_control_dao.entity.FinancetypeEntity;
import com.zhkj.inventory_control_dao.entity.StatisticsEntity;
import com.zhkj.inventory_control_dao.entity.StatisticstypeEntity;
import com.zhkj.inventory_control_dao.mapper.*;
import com.zhkj.inventory_control_tools.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.invoke.empty.Empty;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
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

    private Result result=new Result();

    @Override
    public Result selectStatiscsEntityAll() {
        //查询所有的统计表
       List<StatisticsEntity> statisticsEntities= statisticsMapper.findStatisticsAll();
        result.setSuccess(ServiceConstant.SUCCERSS);
        result.setData(ConverToDTO(statisticsEntities));
        return result;
    }

    @Override
    public List<StatisticsEntity> financeStatuscs() {
        //查询当月财务统计
     List<StatisticsEntity> statisticsEntities= statisticsMapper.findStatisticsAll();
     List<StatisticsEntity> returnStatistics=new ArrayList<>();
     for (int i=0;i<statisticsEntities.size();i++){
       StatisticsEntity statisticsEntity=statisticsEntities.get(i);
       Timestamp timestamp= statisticsEntities.get(i).getStatisticsCreateTime();


       //年
       String year=  DataTools.getYear(timestamp);
         //月
       String mouth=  DataTools.getMonth(timestamp);
         //日
       String day=  DataTools.getDay(timestamp);
       if (returnStatistics.size()==0){
           returnStatistics.add(statisticsEntity);
           //添加后返回
           continue;
       }
         Boolean state=false;
         for (int j=0;j<returnStatistics.size();j++){
             StatisticsEntity statisticsEntity1= returnStatistics.get(j);
             String returnStatisticsYear= DataTools.getYear(statisticsEntity1.getStatisticsCreateTime());
             //月
             String returnStatisticsMouth=  DataTools.getMonth(statisticsEntity1.getStatisticsCreateTime());
             //日
             String returnStatisticsDay=  DataTools.getDay(statisticsEntity1.getStatisticsCreateTime());
              state=false;
             if (year.equals(returnStatisticsYear)&&mouth.equals(returnStatisticsMouth)&&day.equals(returnStatisticsDay)&&statisticsEntity1.getFinanceTypeId()==statisticsEntity.getFinanceTypeId()){
               //发现有相同 向下走
                 state=true;
                 break;
             }

             if (state==false&&j==(returnStatistics.size()-1)){
                 returnStatistics.add(statisticsEntity);
                 break;
             }
         }
         if (state==false){
             //没发现相同标识已经添加集合 所以循环第二次
             continue;
         }

       for (int j=0;j<returnStatistics.size();j++){
           StatisticsEntity statisticsEntity1= returnStatistics.get(j);
           //年
           String returnStatisticsYear= DataTools.getYear(statisticsEntity1.getStatisticsCreateTime());
           //月
           String returnStatisticsMouth=  DataTools.getMonth(statisticsEntity1.getStatisticsCreateTime());
           //日
           String returnStatisticsDay=  DataTools.getDay(statisticsEntity1.getStatisticsCreateTime());
           if (year.equals(returnStatisticsYear)&&mouth.equals(returnStatisticsMouth)&&day.equals(returnStatisticsDay)&&statisticsEntity1.getFinanceTypeId()==statisticsEntity.getFinanceTypeId()){
               double money= statisticsEntity1.getFinancePrice()+statisticsEntity.getFinancePrice();
               returnStatistics.get(j).setFinancePrice(money);
                break;
           }else{

           }
       }
     }
        return returnStatistics;
    }

    @Override
    public Result delStatiscsEntity() {
        //删除统计表 所有数据
       int state= statisticsMapper.delStatistics();
       if (state==1){
           result.setSuccess(ServiceConstant.SUCCERSS);

       }else {
           result.setSuccess(ServiceConstant.DEFEATED);
           result.setMessage(MessageConstant.DELETE_STATUSTICS_ERROR);
       }
       return result;
    }

    @Override
    public Result selectStatiscsCondition(StatisticsVO statisticsVO) {
        List<StatisticsEntity> statisticsEntities=null;
        List<StatisticsEntity> StatisticsEntity=   statisticsMapper.findStatisticsAll();
        if ( StatisticsEntity.size()%TablePage.getPageCount()==0){
            TablePage.setCount(StatisticsEntity.size()%TablePage.getPageCount());
        }else{
            TablePage.setCount(StatisticsEntity.size()/TablePage.getPageCount()+1);
        }
        if (statisticsVO==null){
            statisticsEntities= statisticsMapper.findStatisticsCondition(null,null,null,(TablePage.getThisIndex()-1)*TablePage.getPageCount(),TablePage.getPageCount());
        }else{
            StatisticsEntity statisticsEntity=new StatisticsEntity();
            statisticsEntity.setFinanceTypeId(statisticsVO.getFinanceTypeId());
            statisticsEntity.setStatisticsTypeId(statisticsVO.getStatisticsTypeId());
            //根据条件查询统计表
            statisticsEntities= statisticsMapper.findStatisticsCondition(statisticsEntity,statisticsVO.getEndTime(),statisticsVO.getStatisticsCreateTime(),(TablePage.getThisIndex()-1)*TablePage.getPageCount(),TablePage.getPageCount());
        }
        result.setSuccess(ServiceConstant.SUCCERSS);
        result.setData(ConverToDTO(statisticsEntities));
        return result;
    }

    @Override
    public Result insertStatiscs(StatisticsEntity statisticsEntity) {
        //添加一条统计表数据
       int state= statisticsMapper.insertStatistics(statisticsEntity);
        if (state==1){
            result.setSuccess(ServiceConstant.SUCCERSS);
        }else {
            result.setSuccess(ServiceConstant.DEFEATED);
            result.setMessage(MessageConstant.DINSERT_STATUSTICS_ERROR);
        }
        return result;
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
            int length= specificationSku.split(",").length;
            List<String> specificationdetailed =new ArrayList<>();
            for (int j=0;j<length;j++){
                String specificationdetailedId= specificationSku.split(",")[j];
                specificationdetailed.add(specificationdetailedId);
            }
            String detaiedName="";
            for (int k=0;k<specificationdetailed.size();k++){
                String detaiedName1=specificationDetailedMapper.selectSpecificationDetailedId(Integer.parseInt(specificationdetailed.get(k)));
                if ((specificationdetailed.size()-k)==1){
                    detaiedName+=detaiedName1;
                }else{
                    detaiedName+=detaiedName1+",";
                }
            }

            commodityinventoryDTO.setCommoditySku(detaiedName);
            statisticsDto.setCommodityInventory(commodityinventoryDTO);
            statisticsDtos.add(statisticsDto);
        }
        return statisticsDtos;
    }

    /**
     * 查询当前统计表 并导出Excel
     *
     * @param request
     * @param response
     */
    @Override
    public void outPutExcelByStatistics(HttpServletRequest request, HttpServletResponse response){
        //查询所有的统计表数据
        Result result= selectStatiscsEntityAll();
        //查询所有的数据
        List<StatisticsDTO> statisticsEntities = (List<StatisticsDTO>) result.getData();
        List<String[]> statisticsMessage=new ArrayList<>();
        for (int i=0;i<statisticsEntities.size();i++){
            StatisticsDTO statisticsDTO=statisticsEntities.get(i);
            //遍历数据集合 拿到Excel列
            String[] statisticsMessages= {""+statisticsDTO.getStatisticsCreateTime(),statisticsDTO.getFinanceType(),statisticsDTO.getCommodityInventory().getCommodityName()+"-"+statisticsDTO.getCommodityInventory().getCommoditySku(),statisticsDTO.getFinanceType(),""+statisticsDTO.getFinancePrice(),""+statisticsDTO.getStatisticsNumber()};
            statisticsMessage.add(statisticsMessages);
        }
        try {
            //生成Excel
            OutPutExcel.exportData(request,response,ServiceConstant.STATISTICS_FILE_NAME,ServiceConstant.statisticsTiele,statisticsMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public PercentageDTO incomeAndExpensesPercentage() {
        //获得报表百分比
        //支出
      List<StatisticsEntity> expend= statisticsMapper.findStatisticsToExpend();
        //收入
      List<StatisticsEntity> income= statisticsMapper.findStatisticsToIncome();
       //支出总金额
      double expendPrice=0;
      //收入总金额
      double incomePrice=0;
      for (int i=0;i<expend.size();i++){
          expendPrice+=expend.get(i).getFinancePrice();
      }
      for (int i=0;i<income.size();i++){
          incomePrice+=income.get(i).getFinancePrice();
      }
       String expendPrices= percnet(expendPrice,expendPrice+incomePrice);
       String incomesPrices= percnet(incomePrice,expendPrice+incomePrice);
        return new PercentageDTO(expendPrices,incomesPrices);
    }

    /**
     * 计算百分比
     */
    private   String percnet(double d,double e){
        double p = d/e;
        DecimalFormat nf = (DecimalFormat) NumberFormat.getPercentInstance();
        nf.applyPattern("00%"); //00表示小数点2位
        nf.setMaximumFractionDigits(2); //2表示精确到小数点后2位
        return nf.format(p);
    }
}

