package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.CommodityEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 18:49
 * 商品表
 */
@Repository
public interface CommodityMapper {
//    /**
//     * 增加商品
//     * @param commodityEntity 商品实体类
//     */
//    void insertCommodity(@Param("CommodityEntity")CommodityEntity commodityEntity);
//
//    /**
//     * 删除商品
//     * @param id 删除的商品id
//     */
//    void delCommodity(@Param("id") int id);
//
//    /**
//     * 修改商品
//     * @param commodityEntity 商品实体类
//     */
//    void updateCommodity(@Param("CommodityEntity")CommodityEntity commodityEntity);
//
//    /**
//     *  查找商品
//     * @return 商品集合
//     */
//    List<CommodityEntity> getCommodity();

    /**
     * 根据商品名称查询id
     *
     * @param commodityName 商品名称
     * @return 商品id
     */
    Integer selectCommodityToName(@Param("commodityName") String commodityName);

    /**
     * 根据商品id 查询商品名字
     * @param id 商品id
     * @return 商品名称
     */
    String selectCommodityToId(@Param("id") Integer id);
}
