package com.tang.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 异步
 * @author Administrator
 *
 */
@Component
@Slf4j
public class UserAsync {

	@Async
	public void AsyncTest(){
		log.info("异步线程id:"+Thread.currentThread().getId());
	}
}
