package net.zhaoqing.shopmall.controller;

import net.zhaoqing.shopmall.service.HelloSender;
import net.zhaoqing.shopmall.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mq")
public class RabbitmqController {

    @Autowired private HelloSender helloSender;

    @GetMapping("/get")
    public String get(Integer id){
        String s = id.toString();

        helloSender.send();

        return "ok-"+id;
    }

}
