package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类<br>
 * 服务提供者
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApp {
	public static void main(String[] args) {
		SpringApplication.run(ProducerApp.class, args);
	}
}
