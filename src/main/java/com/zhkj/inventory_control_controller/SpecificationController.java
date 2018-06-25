package com.zhkj.inventory_control_controller;

import com.zhkj.inventory_control_service.inventory_control_spcification.SpecificationServiceImpl;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecificationController {
    @Autowired
    private SpecificationServiceImpl specificationService;
    /**
     * 获取所有规格
     * @return
     */
    @RequestMapping(value = "/listSpecification",method = RequestMethod.POST)
    public Result listSpecification(){
        return specificationService.listSpecificationAll();
    }

    /**
     * 获取所有规格标题
     * @return
     */
    @RequestMapping(value = "/listSpecificationTopic",method = RequestMethod.POST)
    public Result listSpecificationTopic(){
        return specificationService.listSpecificationTopicAll();
    }
}
