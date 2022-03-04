package com.dzxz.config.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置类
 * 通过@Configuration注解，让Spring来加载该类配置。
 * 再通过@EnableSwagger2注解来启用Swagger2。
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                // 用来创建api的基本信息，展示在文档页面中
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给swagger展示
                .select()
                // (第一种方式)扫描所有有注释的api，用这种方式更加灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // (第二种方式)扫描指定包中的swagger注解
                //.apis(RequestHandlerSelectors.basePackage("com.dzxz.teaMachine.controller"))
                // (第三种方式)扫描所有
                //.apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }

    /**
     * 添加摘要信息
     * @return 接口信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                //设置标题
                .title("茶叶发花设备Api文档")
                .description("描述：xxxx")
                .version("版本号： V 1.0.0")
                .build();
    }



}
