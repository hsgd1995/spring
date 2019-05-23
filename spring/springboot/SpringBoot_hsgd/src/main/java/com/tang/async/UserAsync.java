package com.tang.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步
 * @author Administrator
 *
 */
@Component
public class UserAsync {

	@Async
	public void AsyncTest(){
		System.out.println("异步线程id:"+Thread.currentThread().getId());
	}
}
