package net.zhaoqing.shopmall.controller;

import net.zhaoqing.shopmall.pojo.User;
import net.zhaoqing.shopmall.service.UserPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user2")
public class MybatisPlusController {

    @Autowired
    private UserPlusService userPlusService;

    private Integer id=1;

    @RequestMapping("add")
    public String add() throws Exception {

        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("name"+(id++).toString());
        user.setAge(id*10);
        userPlusService.insert(user);

        return "success";
    }

}
