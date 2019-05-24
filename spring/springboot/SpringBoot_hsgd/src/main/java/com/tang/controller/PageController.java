package com.tang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tang.async.UserAsync;

import lombok.extern.slf4j.Slf4j;

/**
 * 页面跳转类
 * 
 * @author Administrator
 * @date 2019年5月21日
 */
@Controller
@Slf4j
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
		log.info("主线程id:" + Thread.currentThread().getId());
		userAsync.AsyncTest();
		log.info("配置文件myName:"+myName);
		return "login";
	}
}
