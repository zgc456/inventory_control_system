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
    /**
     * 增加商品
     * @param commodityEntity 商品实体类
     */
    int insertCommodity(@Param("commodityEntity")CommodityEntity commodityEntity);

    /**
     * 删除商品
     * @param id 删除的商品id
     */
    int delCommodity(@Param("id") int id);

    /**
     * 修改商品
     * @param commodityEntity 商品实体类
     */
    int updateCommodity(@Param("CommodityEntity")CommodityEntity commodityEntity);

    /**
     *  查找商品
     * @return 商品集合
     */
    List<CommodityEntity> getCommodity();

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

    /**
     * 根据商品 id 查询商品信息
     * @param commodityId 商品 id
     * @return
     */
    CommodityEntity selectCommodityByCommodityId(@Param("commodityId")Integer commodityId);
    /**
     * 根据条件查询商品信息
     * @param conditionSql 查询条件列表
     * @return 商品列表
     */
    List<CommodityEntity> listCommodityByCondition(@Param("conditionSql") String conditionSql);

    /**
     * 根据商品名称查询商品
     * @param commodityName 商品名称
     * @return 符号条件的个数
     */
    Integer selectCommodityByCommodityName(@Param("commodityName") String commodityName);
    /**
     * 查找最后一个商品的id
     * @return 商品id
     */
    Integer selectLastCommodityId();
}
