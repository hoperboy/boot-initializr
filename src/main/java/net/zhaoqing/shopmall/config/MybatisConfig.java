package net.zhaoqing.shopmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("net.zhaoqing.shopmall.dao.mybatis")
public class MybatisConfig {
}
