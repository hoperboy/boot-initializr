package net.zhaoqing.shopmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ClassUtils;

import java.net.URL;

@SpringBootApplication
public class ShopmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmallApplication.class, args);
	}

}
