package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.SupplierDto;
import com.zhkj.inventory_control_api.vo.SupplierVo;

import java.util.List;

/**
 * 供应商接口
 * @author
 * @Version 1.0
 * @Data 2018/5/17 15:03
 */
public interface SupplierService {
    /**
     * 查询所有的供应商
     * @return 供应商集合
     */
     List<SupplierDto> selectSupplier();

    /**
     * 根据姓名查询供应商
     * @param name 供应商名字
     * @return 供应商实体类
     */
     SupplierDto selectSupplierToSupplierName(String name);

    /**
     * 保存供应商信息
     * @param supplierVo 供应商实体类VO
     */
     boolean insertSupplier(SupplierVo supplierVo);

    /**
     * 录错修改接口
     * @param supplierVo 供应商实体类VO
     */
     boolean updateSupplier(SupplierVo supplierVo);
}
