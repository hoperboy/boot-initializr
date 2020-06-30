package net.zhaoqing.shopmall.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean("controller")
    public Docket jobhandlerApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("controller")
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.zhaoqing.shopmall.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.zhaoqing.shopmall.controller.*"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("shopmall")	//标题
                .description("Restful-API-Doc")	//描述
                .termsOfServiceUrl("https://www.cnblogs.com/viyoung") //这里配置的是服务网站，我写的是我的博客园站点~欢迎关注~
                .contact(new Contact("zhaoqing", "https://www.cnblogs.com/viyoung", "18530069930@163.com")) // 三个参数依次是姓名，个人网站，邮箱
                .version("1.0") //版本
                .build();
    }
}