package com.shuma.oneproject.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * main module 启动类
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/2/15
 */
@SpringBootApplication
@ComponentScan({
        "com.shuma.oneproject"
})
public class MainModuleApplication {

    public static void main (String[] args) {
        SpringApplication.run(MainModuleApplication.class, args);
    }

}
