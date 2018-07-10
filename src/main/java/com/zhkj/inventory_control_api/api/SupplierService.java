package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.dto.SupplierDto;
import com.zhkj.inventory_control_api.vo.SupplierVo;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;

import javax.servlet.http.HttpServletRequest;
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
     DataTables selectSupplier(HttpServletRequest request);

    /**
     * 根据姓名查询供应商
     * @param name 供应商名字
     * @return 供应商实体类
     */
    Result selectSupplierToSupplierName(String name);

    /**
     * 根据id查询
     * @param supplierId 供应商id
     * @return
     */
    Result selectSupplierBySupplierId(Integer supplierId);

    /**
     * 保存供应商信息
     * @param supplierVo 供应商实体类VO
     */
    Result insertSupplier(SupplierVo supplierVo,HttpServletRequest request);

    /**
     * 修改接口
     * @param supplierVo 供应商实体类VO
     */
    Result updateSupplier(SupplierVo supplierVo,HttpServletRequest request);

    /**
     * 根据id删除供应商
     * @param supplierId 供应商id
     * @return
     */
    Result deleteSupplierBySupplierId(Integer supplierId,HttpServletRequest request);
}
