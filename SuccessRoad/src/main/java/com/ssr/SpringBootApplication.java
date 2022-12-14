package com.ssr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @EnableAutoConfiguration //开启自动配置
    public class SpringBootApplication {

        @RequestMapping("/")
        String home() {
            return "Hello World!";
        }

        public static void main(String[] args) {
            SpringApplication.run(SpringBootApplication.class, args);
            System.out.println("测试git提交");
        }
    }


