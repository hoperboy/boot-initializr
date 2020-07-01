package net.zhaoqing.shopmall.service;

import net.zhaoqing.shopmall.dao.mybatisplus.HotNewsMapper;
import net.zhaoqing.shopmall.pojo.HotNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotNewsService {

    @Autowired private HotNewsMapper hotNewsMapper;

    public void insert(HotNews user)
    {
        hotNewsMapper.insert(user);
    }

}
