package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类-服务提供者<br>
 * 用于负载均衡
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApp2 {
	public static void main(String[] args) {
		SpringApplication.run(ProducerApp2.class, args);
	}
}
