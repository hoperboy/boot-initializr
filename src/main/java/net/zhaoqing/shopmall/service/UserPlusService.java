package net.zhaoqing.shopmall.service;

import net.zhaoqing.shopmall.dao.mybatisplus.UserPlusMapper;
import net.zhaoqing.shopmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPlusService {

    @Autowired private UserPlusMapper userPlusMapper;

    public void insert(User user){
        userPlusMapper.insert(user);
    }

}
