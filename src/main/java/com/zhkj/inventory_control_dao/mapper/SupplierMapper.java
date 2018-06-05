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
     * 查询所有的供应商
     * @return 供应商集合
     */
     List<SupplierEntity> selectSupplier();

    /**
     * 根据姓名查询供应商
     * @param name 供应商名字
     * @return 供应商实体类
     */
     SupplierEntity selectSupplierToSupplierName(@Param("name") String name);

    /**
     * 添加供应商
     * @param supplierEntity 供应商实体类
     */
     void insertSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);

    /**
     * 修改供应商 根据供应商名称
     * @param supplierEntity 供应商实体类
     */
     void updateSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);
}
