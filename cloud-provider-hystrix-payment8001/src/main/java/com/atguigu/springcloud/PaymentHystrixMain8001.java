package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Ywj
 * @version 1.0
 * @date 2020/7/2 10:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
