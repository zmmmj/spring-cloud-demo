package pers.zmj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 开启 Eureka 客户端功能
@EnableCircuitBreaker //激活熔断器功能
public class DeptHystrix8004Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrix8004Application.class, args);
    }
}
