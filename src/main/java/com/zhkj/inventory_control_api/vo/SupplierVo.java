package com.zhkj.inventory_control_api.vo;

/**
 * 供应商Vo
 * @author
 * @Version 1.0
 * @Data 2018/5/17 15:17
 */
public class SupplierVo {
    //id
    private int id;
    //供应商名字
    private String supplierName;
    //供应商联系方式
    private String supplierPhone;
    private String supplierRemark;

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

    public String getSupplierRemark() {
        return supplierRemark;
    }

    public void setSupplierRemark(String supplierRemark) {
        this.supplierRemark = supplierRemark;
    }
}
