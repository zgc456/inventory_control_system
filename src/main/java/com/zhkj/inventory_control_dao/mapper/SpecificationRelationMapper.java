package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.SpecificationrelationEntity;

import java.util.List;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/22 18:29
 * 商品规格关系表
 */
public interface SpecificationRelationMapper {
    /**
     * 增加一条商品规格
     * @param specificationrelationEntity 商品规格实体类
     */
   void insertSpecificationRelation(SpecificationrelationEntity specificationrelationEntity);

    /**
     * 删除商品规格
     * @param id 商品规格id
     */
   void deleteSpecificationRelation(Integer id);
    //修改
    void updateSpecificationRelation(SpecificationrelationEntity specificationrelationEntity);
    //查询
    List<SpecificationrelationEntity> getSpecificationRelation();
}
