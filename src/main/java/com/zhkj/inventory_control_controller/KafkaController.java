package com.zhkj.inventory_control_controller;
import com.zhkj.inventory_control_api.api.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/9 10:53
 */
@Controller
public class KafkaController {

    @Autowired
    InteractionService interactionService;
    @RequestMapping("/sendMapping")
    public void Controllers(HttpServletRequest request){
        request.getSession().setAttribute("1","213123");
        interactionService.sendInteractionService("s");
    }
}
