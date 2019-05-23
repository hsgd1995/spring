package com.example.demo.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.MyFilter;

/**
 * 配置类
 * @author Administrator
 * @date   2019年5月15日
 */
@Configuration
public class WebConfiguration {

	@Bean
	public RemoteIpFilter remoteIpFilter(){
		return new RemoteIpFilter();
	}
	
	/**
	 * 将自定义Filter加入过滤链
	 * @return
	 */
	@Bean
	public FilterRegistrationBean testFilterRegistration(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}
}
