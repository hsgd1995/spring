package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 用于turbine项目测试的consumer2
 * 启动类，服务消费者<br>
 * 服务消费者<br>
 * 熔断器+熔断监控Dashboard
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ConsumerApplication2 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication2.class, args);
	}
}
