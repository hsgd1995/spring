package com.tang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tang.async.UserAsync;

/**
 * 页面跳转类
 * 
 * @author Administrator
 * @date 2019年5月21日
 */
@Controller
public class PageController {

	@Autowired
	private UserAsync userAsync;
	
	@Value("${myName}")
	private String myName;

	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("pageName", "index");
		model.addAttribute("imgUrl", "img/1.jpg");
		return "index";
	}

	@RequestMapping("helloJsp")
	public String helloJsp() {
		return "helloJsp";
	}

	@RequestMapping("login")
	public String login() {
		System.out.println("主线程id:" + Thread.currentThread().getId());
		userAsync.AsyncTest();
		System.out.println("配置文件myName:"+myName);
		return "login";
	}
}
