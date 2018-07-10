package com.zhkj.inventory_control_controller;

import com.alibaba.fastjson.JSON;
import com.zhkj.inventory_control_api.api.SupplierService;
import com.zhkj.inventory_control_api.vo.SupplierVo;
import com.zhkj.inventory_control_tools.DataTables;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    /**
     * 查询所有供应商
     * @return
     */
    @RequestMapping(value = "/listSupplierAll",method = RequestMethod.POST)
    public DataTables listSupplierAll(HttpServletRequest request){
        return supplierService.selectSupplier(request);
    }

    /**
     * 根据姓名查询供应商
     * @param supplierName 供应商名称
     * @return
     */
    @RequestMapping(value = "/listSupplierBySupplierName",method = RequestMethod.POST)
    public Result listSupplierBySupplierName(String supplierName){
        return supplierService.selectSupplierToSupplierName(supplierName);
    }

    /**
     * 根据供应商id查询供应商信息
     * @param supplierId
     * @return
     */
    @RequestMapping(value = "/selectSupplier",method = RequestMethod.POST)
    public Result selectSupplierBySupplierId(Integer supplierId){
        return supplierService.selectSupplierBySupplierId(supplierId);
    }

    /**
     * 添加供应商
     * @param json 供应商信息
     * @return
     */
    @RequestMapping(value = "/insertSupplier",method = RequestMethod.POST)
    public Result insertSupplier(String json,HttpServletRequest request){
        SupplierVo supplierVo = JSON.parseObject(json,SupplierVo.class);
        return supplierService.insertSupplier(supplierVo,request);
    }

    /**
     * 根据id修改供应商信息
     * @param json 供应商信息
     * @return
     */
    @RequestMapping(value = "/updateSupplier",method = RequestMethod.POST)
    public Result updateSupplierBySupplierId(String json,HttpServletRequest request){
        SupplierVo supplierVo = JSON.parseObject(json,SupplierVo.class);
        return supplierService.updateSupplier(supplierVo,request);
    }

    /**
     * 删除供应商
     * @param supplierId 供应商id
     * @return
     */
    @RequestMapping(value = "/deleteSupplier",method = RequestMethod.POST)
    public Result deleteSupplierBySupplierId(Integer supplierId,HttpServletRequest request){
        return supplierService.deleteSupplierBySupplierId(supplierId,request);
    }
}
