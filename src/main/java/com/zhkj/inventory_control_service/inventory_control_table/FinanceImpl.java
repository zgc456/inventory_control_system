package com.zhkj.inventory_control_service.inventory_control_table;

import com.zhkj.inventory_control_api.api.FinanceService;
import com.zhkj.inventory_control_dao.entity.FinanceEntity;
import com.zhkj.inventory_control_dao.mapper.FinanceMapper;
import com.zhkj.inventory_control_tools.ServiceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/4 15:57
 */
@Service
public class FinanceImpl implements FinanceService {
    @Autowired
    private FinanceMapper financeMapper;
    @Override
    public List<FinanceEntity> selectFinanceToIncome() {
        return financeMapper.selctFinance(ServiceConstant.INCOME);
    }

    @Override
    public List<FinanceEntity> selectFinanceToExpend() {
        return financeMapper.selctFinance(ServiceConstant.EXPEND);
    }

    @Override
    public List<FinanceEntity> selectFinanceAll() {
        return financeMapper.selctFinance(ServiceConstant.INCOME_AND_EXPEND);
    }

    @Override
    public boolean delFinanceAll() {
        try {
            financeMapper.delFinanceAll();
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
