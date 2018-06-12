package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.SpecificationtopicEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 18:30
 * 商品规格标题表
 */
public interface SpecificationTopicMapper {
    /**
     * 新增一条标题
     *
     * @param specificationtopicEntity 标题实体类
     */
    void insertTopic(@Param("SpecificationtopicEntity") SpecificationtopicEntity specificationtopicEntity);

    /**
     * 根据id 删除一条标题
     * @param id 标题表id
     */
    void deleteTopic(@Param("id") int id);

    /**
     * 修改一个标题
     * @param specificationtopicEntity 标题实体类
     */
    void updateTopic(@Param("SpecificationtopicEntity") SpecificationtopicEntity specificationtopicEntity);

    /**
     * 查询所有的标题
     * @return 标题表集合
     */
    List<SpecificationtopicEntity> getTopic();
}
