package com.tang.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.tang.service.HelloRemote;

/**
 * 熔断器：服务调用失败的fallback类
 * @author Administrator
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello2(@RequestParam(value = "name")  String name) {
		return "hello2" +name+", this messge send failed ";
	}

	
}
