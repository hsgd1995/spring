package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.tang.filter.TokenFilter;

/**
 * 启动类<br>
 * 网关
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceZuulApplication.class, args);
	}
	
	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}
}
