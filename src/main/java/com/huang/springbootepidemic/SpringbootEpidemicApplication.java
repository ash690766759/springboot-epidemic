package com.huang.springbootepidemic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.huang.springbootepidemic.mapper")
@EnableScheduling//启用定时任务
@EnableAsync    //启动异步任务
public class SpringbootEpidemicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEpidemicApplication.class, args);
    }

}
