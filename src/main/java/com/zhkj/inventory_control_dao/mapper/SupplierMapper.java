package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.SupplierEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * mybatis供应商接口
 * @date 2018-5-17
 */
@Repository
public interface SupplierMapper {
    /**
     * 查询供应商
     * @return 供应商集合
     */
     List<SupplierEntity> listSupplierLimit(@Param("startNumber")Integer startNumber,@Param("lengthNumber")Integer lengthNumber);

    /**
     * 查询所有供应商
     * @return 供应商
     */
     List<SupplierEntity> listSupplierAll();
     /**
      * 查询供应商数量
      * @return 供应商数量
      */
     Integer countSupplier();
    /**
     * 根据姓名查询供应商
     * @param name 供应商名字
     * @return 供应商实体类
     */
     List<SupplierEntity> selectSupplierToSupplierName(@Param("name") String name);

    /**
     * 根据id查询供应商
     * @param supplierId 供应商id
     * @return 供应商信息
     */
     SupplierEntity selectSupplierBySupplierId(@Param("supplierId") Integer supplierId);

    /**
     * 添加供应商
     * @param supplierEntity 供应商实体类
     */
     int insertSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);

    /**
     * 修改供应商 根据供应商名称
     * @param supplierEntity 供应商实体类
     */
     int updateSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);

    /**
     * 删除供应商
     * @param supplierId 供应商编号
     * @return
     */
     int deleteSupplierBySupplierId(@Param("supplierId")Integer supplierId);
}
