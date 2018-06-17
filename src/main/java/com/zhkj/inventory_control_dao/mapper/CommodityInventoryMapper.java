package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.CommodityinventoryEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/22 17:50
 * 库存数据库映射
 */
@Repository
public interface CommodityInventoryMapper {
    /**
     * 增加一条新的库存
     * @param commodityinventoryEntity 库存实体类
     */
    void insertCommodityInventory(@Param("CommodityinventoryEntity") CommodityinventoryEntity commodityinventoryEntity);

    /**
     * 删除一条商品库存
     * @param id  商品库存id
     */
    void delCommodityInventory(@Param("id") int id);

    /**
     * 修改商品信息
     * @param commodityinventoryEntity 商品库存实体类
     */
    void updateCommodityInventory(@Param("CommodityinventoryEntity") CommodityinventoryEntity commodityinventoryEntity);

    /**
     * 查询商品所有商品库存
     * @return 商品库存集合
     */
    List<CommodityinventoryEntity> getCommodityInventory();

    /**
     * 根据库存中的商品id 查询库存集合
     *
     * @param commodityId 商品id外键
     * @return 库存集合
     */
     List<CommodityinventoryEntity> selectCommodityinventoryToCommmodityId(@Param("commodityId") Integer commodityId);

    /**
     * 根据库存id 查询库存集合
     *
     * @param id 库存id
     * @return 库存实体类
     */
     CommodityinventoryEntity selectCommodityinventoryToId(@Param("id") Integer id);
    /**
     * 根据条件查询商品并且分页
     * @param condition 查询条件
     * @param startNumber 起始条数
     * @param pageNumberLength 每页显示条数
     * @return 商品列表
     */
    List<CommodityinventoryEntity> listCommodityByConditionLimit(@Param("condition") String condition,@Param("startNumber") Integer startNumber
            ,@Param("pageNumberLength") Integer pageNumberLength);

    /**
     * 根据条件查询商品
     * @param condition 查询条件
     * @return 商品列表
     */
    List<CommodityinventoryEntity> listCommodityByCondition(@Param("condition") String condition);

    /**
     * 根据商品库存 id 查询数据
     * @param commodityInventoryId 商品库存 id
     * @return 商品信息
     */
    CommodityinventoryEntity selectCommodityById(@Param("commodityInventoryId")Integer commodityInventoryId);
}
