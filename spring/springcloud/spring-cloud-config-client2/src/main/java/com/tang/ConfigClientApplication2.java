package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类<br>
 * 配置中心-客户端2-集群，为了模拟bus发送消息<br>
 * 注册到注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication2 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication2.class, args);
	}
}
