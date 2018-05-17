package com.zhkj.inventory_control_service.inventory_control_supplier;

import com.zhkj.inventory_control_dao.mapper.supplier_mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
   private SupplierMapper supplierMapper;

}
