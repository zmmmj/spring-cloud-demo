package pers.zmj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Spring cloud Eureka 客户端，自动将本服务注册到 Eureka Server 注册中心中
public class ProviderDept8001Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001Application.class, args);
    }
}
