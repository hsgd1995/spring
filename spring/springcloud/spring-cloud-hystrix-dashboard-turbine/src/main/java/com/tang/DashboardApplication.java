package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 启动类<br>
 * 熔断监控<br>
 * 以集群形式监控，由于可能有很多个项目需要监控，所以把这些项目Dashboard的数据放到一起监控并展示
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DashboardApplication {
	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}
