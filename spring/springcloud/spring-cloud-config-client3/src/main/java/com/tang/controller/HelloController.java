package com.tang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 * @author Administrator
 *
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class HelloController {
	
	/**
	 * 从配置中心获取值<br>
	 * 但并不会监测配置中心资源的变化，所以需要使用{@link @RefreshScope},但还是需要手动刷新
	 */
	@Value("${neo.hello}")
	private String hello;
	
	@RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
