package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.SpecificationrelationEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/22 18:29
 * 商品规格关系表
 */
@Repository
public interface SpecificationRelationMapper {
    /**
     * 查询规格
     * @return 规格列表
     */
    List<SpecificationrelationEntity> listSpecificationRelation();
}
