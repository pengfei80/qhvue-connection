package com.zpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by lenovo on 2019/11/27.
 */
@SpringBootApplication
public class SpringBootCrudApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        System.out.println("项目启动了");
        SpringApplication.run(SpringBootCrudApplication.class);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootCrudApplication.class);
    }
}
