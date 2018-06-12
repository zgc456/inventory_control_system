package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.SpecificationdetailedEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 18:30
 * 商品规格详细表
 */
@Repository
public interface SpecificationDetailedMapper {
    /**
     * 增加规格详细
     * @param specificationdetailedEntity 规格详细实体类
     */
    void insertSpecificationDetailed(@Param("SpecificationdetailedEntity") SpecificationdetailedEntity specificationdetailedEntity);

    /**
     * 删除一条规格
     * @param id 规格表id
     */
    void delSpecificationDetailed(@Param("id") int id);

    /**
     * 修改规格
     * @param specificationdetailedEntity 规格实体类
     */
    void updateSpecificationDetailed(@Param("SpecificationdetailedEntity") SpecificationdetailedEntity specificationdetailedEntity);

    /**
     * 查询所有规格
     * @return
     */
    List<SpecificationdetailedEntity> getSpecificationDetailed();

    /**
     * 根据商品规格id 查询商品规格名称
     *
     * @param id 规格id
     * @return 规格名称
     */
   String selectSpecificationDetailedId(Integer id);
}
