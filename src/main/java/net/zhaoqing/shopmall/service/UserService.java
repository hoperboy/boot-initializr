package net.zhaoqing.shopmall.service;

import net.zhaoqing.shopmall.dao.mybatis.UserMapper;
import net.zhaoqing.shopmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void insert(User user){
        userMapper.insert(user);
    }
}
