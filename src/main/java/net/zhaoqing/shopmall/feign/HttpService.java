package net.zhaoqing.shopmall.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("website")
public interface HttpService {

    @RequestMapping(value = "/redis/get", method = RequestMethod.GET)
    String get();

}
