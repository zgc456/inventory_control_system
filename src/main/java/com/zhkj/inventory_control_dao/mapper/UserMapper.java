package com.zhkj.inventory_control_dao.mapper;
import com.zhkj.inventory_control_dao.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/21 9:57
 */
@Repository
public interface UserMapper {
    /**
     * 根据账号密码查询User
     * @param userEntity 用户表实体类
     * @return
     */
    UserEntity selectUserToLogin(@Param("UserEntity") UserEntity userEntity);
}
