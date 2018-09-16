package com.foxwho.demo.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }

    // git配置文件里的key title
    @Value("${title}")
    String title;

    @RequestMapping(value = "/showTitle")
    public String showTitle() {
        return title;
    }
}
