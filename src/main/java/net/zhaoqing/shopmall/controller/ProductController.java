package net.zhaoqing.shopmall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mall/prod")
public class ProductController {
    @GetMapping("/")
    public String g(){
        return "g";
    }

    @GetMapping("/get")
    public String get(){
        return "ok";
    }
}
