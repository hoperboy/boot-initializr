package net.zhaoqing.shopmall.controller;


import net.zhaoqing.shopmall.feign.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/http")
public class HttpController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpService httpService;

    @GetMapping("/get")
    public String get(){

        String string= restTemplate.getForObject("http://website/redis/get", String.class);

        String value= httpService.get();

        return "ok";
    }

}
