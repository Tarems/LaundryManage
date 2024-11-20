package com.example.demo;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动入口
 * 后端： springboot mybatis(Flex),
 * 数据库： mysql
 * 前端 Layui, jquery
 */
@SpringBootApplication
//@MapperScan({"com.example.demo.mapper"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
