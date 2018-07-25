package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.WarningcommodityEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/24 8:15
 */
@Repository
public interface WarningCommodityMapper {
    /**
     * 查看预警信息并展示
     * @param state 审核状态
     * @param messageCreateTime 审核创建时间
     * @param commodityName 商品姓名
     * @return
     */
     List<WarningcommodityEntity> findWarningCommodityByCondition(@Param("commodityState") int state,@Param("createTime") Date messageCreateTime,@Param("commodityName") String commodityName);

    /**
     * 根据id查询消息表
     * @param id
     * @return
     */
     WarningcommodityEntity findWarningById(@Param("id") int id);

    /**
     * 根据商品名称查询预警是否被审核
     * @param commodityName 商品名称
     * @return
     */
     List<WarningcommodityEntity> listWarningCommodityByCommodityName(@Param("commodityName") String commodityName,@Param("commodityState") int commodityState);

    /**
     * 查询警告表中的数据
     * @return
     */
     int countWarningCommodity();

    /**
     * 添加预警
     * @param warningcommodityEntity 预警信息
     * @return
     */
     int insertWarningCommodity(@Param("we") WarningcommodityEntity warningcommodityEntity);
}
