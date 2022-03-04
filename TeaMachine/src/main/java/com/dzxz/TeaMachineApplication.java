package com.dzxz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * * @SpringBootApplication源码中有3个特殊注解：
 * 1.@SpringBootConfiguration 标注当前类是配置类，该注解会将当前类中声明的@Bean实例纳入spring容器中，实例名就是方法名
 * 2.@EnableAutoConfiguration 启动自动配置，将所有符合条件的配置加载到ioc容器中
 * 3.@CompentScan 自动扫描组件，默认扫描该注解标注的类所在包以及子包下的所有配置类
 */
@SpringBootApplication
@MapperScan("com.dzxz.teaMachine.dao")
public class TeaMachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeaMachineApplication.class,args);
    }

}
