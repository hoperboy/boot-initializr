package net.zhaoqing.shopmall.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.zhaoqing.shopmall.common.PageResult;
import net.zhaoqing.shopmall.pojo.TUser;
import net.zhaoqing.shopmall.pojo.User;
import net.zhaoqing.shopmall.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/user/t-user")
public class UserController {

    @Autowired private ITUserService userService;


    private Integer id=1;

    @RequestMapping("add")
    public String add() throws Exception {

        TUser user=new TUser();
        user.setId(UUID.randomUUID().toString());
        user.setName("name"+(id++).toString());
        user.setAge(id*10);
        userService.save(user);

        return "success";
    }


    @RequestMapping("crud")
    public String crud(String id){
        userService.crud(id);

        return "ok";
    }

    @RequestMapping("page")
    public Page<TUser> page(long current ){
        return userService.selectList(current);
    }

}
