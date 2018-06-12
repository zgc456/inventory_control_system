package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.FinancetypeEntity;
import org.springframework.stereotype.Repository;

/**
 * 财务往来类型
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/5 17:14
 */
@Repository
public interface FinanceTypeMapper {
    /**
     * 根据id查询财务往来类型
     * @param id 财务往来表id
     * @return 财务往来实体类
     */
    FinancetypeEntity selectFinanceTypeToId(Integer id);
}
