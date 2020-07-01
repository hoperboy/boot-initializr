package net.zhaoqing.shopmall.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import net.zhaoqing.shopmall.common.PageResult;
import net.zhaoqing.shopmall.pojo.TUser;
import net.zhaoqing.shopmall.pojo.User;
import net.zhaoqing.shopmall.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/user/t-user")
@Api(tags = "用户管理")
public class MybatisPlusGeneratorController {

    @Autowired private ITUserService userService;


    private Integer id=1;

    @GetMapping("add")
    @ApiOperation(value = "add")
    public String add() throws Exception {

        TUser user=new TUser();
        user.setId(UUID.randomUUID().toString());
        user.setName("name"+(id++).toString());
        user.setAge(id*10);
        userService.save(user);

        return "success";
    }


    @GetMapping("crud")
    @ApiOperation(value = "crud")
    public String crud(String id){
        userService.crud(id);

        return "ok";
    }

    @GetMapping("page")
    @ApiOperation(value = "page")
    public Page<TUser> page(long current ){
        return userService.selectList(current);
    }

}
