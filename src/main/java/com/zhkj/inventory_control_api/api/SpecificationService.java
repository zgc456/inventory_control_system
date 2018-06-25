package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_tools.Result;

public interface SpecificationService {
    /**
     * 获取所有规格
     * @return
     */
    Result listSpecificationAll();

    /**
     * 获取所有规格标题
     * @return
     */
    Result listSpecificationTopicAll();
}
