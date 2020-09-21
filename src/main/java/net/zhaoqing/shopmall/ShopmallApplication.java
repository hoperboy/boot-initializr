package net.zhaoqing.shopmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"net.zhaoqing.shopmall.feign"})
public class ShopmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmallApplication.class, args);
	}

}
