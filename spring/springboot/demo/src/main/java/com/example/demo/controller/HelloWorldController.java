package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
    	// 测试热部署
    	//System.err.println("HelloWorldController->index->Hello World");
        return "Hello World";
    }
    
    public String index2(){
    	throw new NullPointerException("空指针！！！！！！！！！！！");
    }
}