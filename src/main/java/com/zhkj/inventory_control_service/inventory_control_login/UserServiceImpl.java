package com.zhkj.inventory_control_service.inventory_control_login;

import com.zhkj.inventory_control_api.api.UserService;
import com.zhkj.inventory_control_api.vo.UserVo;
import com.zhkj.inventory_control_dao.entity.UserEntity;
import com.zhkj.inventory_control_dao.mapper.UserMapper;
import com.zhkj.inventory_control_tools.Conver_Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/5/21 10:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean isLogin(UserVo userVo) {
        if (userVo.getUserAccount()==null){
            System.out.println("账号空了");
            return false;
        }
        if (userVo.getUserPassword()==null){
            System.out.println("密码没输入");
            return false;
        }
        try {
            UserEntity userEntity=new UserEntity();
            userEntity=Conver_Type.convert(userEntity,userVo);
           UserEntity userEntity1= userMapper.selectUserToLogin(userEntity);
           if (userEntity1==null){
               throw new Exception();
           }
           return true;
        }catch (Exception e){
            System.out.println("账号密码不正确");
            return false;
        }
    }
}
