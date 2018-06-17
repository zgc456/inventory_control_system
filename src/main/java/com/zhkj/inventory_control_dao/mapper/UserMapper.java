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

    /**
     * 根据用户 id 修改用户密码
     * @param newPassword 新密码
     * @param userId 用户 id
     * @return 是否成功
     */
    int updatePasswordByUserId(@Param("newPassword")String newPassword,@Param("userId") Integer userId);

    /**
     * 根据用户 id 查找用户信息
     * @param userId 用户 id
     * @return 用户信息
     */
    UserEntity selectUserByUserId(@Param("userId") Integer userId);
}
