package net.zhaoqing.shopmall.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        //利用复杂构造器可以实现超时设置，内部实际实现为 HttpClient
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}