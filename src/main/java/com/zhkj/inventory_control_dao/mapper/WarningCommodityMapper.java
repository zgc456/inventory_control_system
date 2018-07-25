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

     int updateWarningCommodityCondition(@Param("WarningcommodityEntity") WarningcommodityEntity warningcommodityEntity);
}
