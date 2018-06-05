package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.FinanceEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 收支表数据库映射
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/6/4 14:31
 */
@Repository
public interface FinanceMapper {

    /**
     * 根据财务类型查看财务收支情况
     * 1 收入 2 支出
     *
     * @param financeTypeId 财务收支类型
     * @return 财务表集合
     */
    List<FinanceEntity> selctFinance(@Param("financeTypeId") int financeTypeId);

    /**
     * 添加财务收支
     *
     * @param financeEntity 收支表实体类
     */
    void insertFinance(@Param("FinanceEntity") FinanceEntity financeEntity);

    /**
     * 删除收支表所有数据
     *
     */
    void delFinanceAll();
}
