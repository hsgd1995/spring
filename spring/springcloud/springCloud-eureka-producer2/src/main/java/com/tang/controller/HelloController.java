package com.tang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello(@RequestParam(value="name")String name){
		return "hello "+name+"，this is producer 2  send first messge";
	}
}
