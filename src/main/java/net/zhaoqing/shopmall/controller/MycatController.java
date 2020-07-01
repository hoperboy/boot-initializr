package net.zhaoqing.shopmall.controller;

import io.swagger.annotations.ApiOperation;
import net.zhaoqing.shopmall.pojo.HotNews;
import net.zhaoqing.shopmall.pojo.TUser;
import net.zhaoqing.shopmall.service.HotNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/HotNews")
public class MycatController {

    @Autowired private HotNewsService hotNewsService;

    @GetMapping("add")
    @ApiOperation(value = "add")
    public String add(Integer max ) throws Exception {

        for(int i=0; i<max; i++){
            HotNews user=new HotNews();
            user.setName("name-"+UUID.randomUUID().toString());
            hotNewsService.insert(user);
        }

        return "success";
    }


}
