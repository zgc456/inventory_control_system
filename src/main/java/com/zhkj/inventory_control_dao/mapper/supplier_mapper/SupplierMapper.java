package com.zhkj.inventory_control_dao.mapper.supplier_mapper;

import com.zhkj.inventory_control_dao.entity.SupplierEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierMapper {
    /**
     * 查询所有的供应商
     * @return
     */
    public List<SupplierEntity> selectSupplier();

    /**
     * 根据姓名查询供应商
     * @param name 供应商名字
     * @return
     */
    public SupplierEntity selectSupplierToSupplierName(@Param("name") String name);

    /**
     * 添加供应商
     * @param supplierEntity 供应商实体类
     */
    public void insertSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);

    /**
     * 修改供应商 根据供应商名称
     * @param supplierEntity 供应商实体类
     */
    public void updateSupplier(@Param("supplierEntity")SupplierEntity supplierEntity);
}
