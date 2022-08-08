package com.cykj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cykj.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("http://localhost:8080");
        System.out.println("不吃饭");
        System.out.println("吃饭");
        System.out.println("帆帆是🐖");
        System.out.println("test test");
    }

}
//1. ssm配置文件 简化 ->application.properties
//2. 依赖整合，ssm jar（依赖）很多，版本容易冲突
//3. 注解简化，比如restController，返回json/ @Controller @responseBody
//4. 打包，简化部署jar，集成tomcat
//5. 自动配置
//--->  约束>配置>编码