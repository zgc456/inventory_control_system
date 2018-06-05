package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 供应商dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class SupplierDto{
    private int id;
    private String supplierName;
    private String supplierPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }


}
