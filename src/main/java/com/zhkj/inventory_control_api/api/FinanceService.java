package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_dao.entity.FinanceEntity;

import java.util.List;

/**
 * 财务
 */
public interface FinanceService {
    /**
     * 收入明细
     *
     * @return 收支情况实体类
     */
     List<FinanceEntity> selectFinanceToIncome();

    /**
     * 支出明细
     *
     * @return 收支情况实体类
     */
    List<FinanceEntity> selectFinanceToExpend();

    /**
     * 查询全部收支情况
     *
     * @return 收支情况实体类
     */
     List<FinanceEntity> selectFinanceAll();

    /**
     * 删除所有收支表数据
     */
    boolean delFinanceAll();


}
