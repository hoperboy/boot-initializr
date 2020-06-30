package net.zhaoqing.shopmall.controller;

import net.zhaoqing.shopmall.service.HelloSender;
import net.zhaoqing.shopmall.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class RedisController {

    @Autowired private RedisService redisService;

    @GetMapping("/get")
    public String get(){
        return "ok";
    }

    @GetMapping("/get2")
    public String get2(Integer id){
        String s = id.toString();

        redisService.testString();

        return "ok-"+id;
    }



}
