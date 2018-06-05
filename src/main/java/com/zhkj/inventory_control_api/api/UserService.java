package com.zhkj.inventory_control_api.api;

import com.zhkj.inventory_control_api.vo.UserVo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/21 9:56
 */
public interface UserService {
    /**
     * 判断该用户登陆是否成功
     * @param userVo 用户参数
     * @return
     */
    Boolean isLogin(UserVo userVo);
}
