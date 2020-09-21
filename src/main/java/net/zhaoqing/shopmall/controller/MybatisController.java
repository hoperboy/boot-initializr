package net.zhaoqing.shopmall.controller;

import net.zhaoqing.shopmall.pojo.User;
import net.zhaoqing.shopmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class MybatisController {

    @Autowired
    private UserService userService;

    private Integer id=1;

    @GetMapping("add")
    public String add() throws Exception {

        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("name"+(id++).toString());
        user.setAge(id*10);
        userService.insert(user);

        //System.err.println("add a obj");
        return "success";
    }

}
