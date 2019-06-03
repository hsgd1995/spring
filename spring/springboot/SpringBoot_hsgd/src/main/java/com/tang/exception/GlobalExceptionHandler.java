package com.tang.exception;


import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import static com.tang.common.DefaultViewConst.DEFAULT_ERROR_VIEW;
import static com.tang.common.DefaultViewConst.NO_PERMISSION_ERROR;
import org.apache.shiro.authz.UnauthorizedException;
/**
 * 全局异常捕获类
 * @author Administrator
 * @date   2019年5月21日
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	/**
	 * 无权限异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UnauthorizedException.class)
	public Object runTimtion(HttpServletRequest req,Exception e){
		ModelAndView mav = new ModelAndView();
		mav.addObject("url",req.getRequestURL());
		mav.addObject("exception",e.getMessage());
		mav.setViewName(NO_PERMISSION_ERROR);
		// return new CommonMessage(500,false,e.getMessage());
		// return DEFAULT_ERROR_VIEW;
		// e.printStackTrace();
		return mav;
	}
	
	
	@ExceptionHandler(RuntimeException.class)
	public Object runTimeException(HttpServletRequest req,Exception e){
		ModelAndView mav = new ModelAndView();
		mav.addObject("url",req.getRequestURL());
		mav.addObject("exception",e);
		mav.setViewName(DEFAULT_ERROR_VIEW);
		// return new CommonMessage(500,false,e.getMessage());
		// return DEFAULT_ERROR_VIEW;
		// e.printStackTrace();
		return mav;
	}
	
	
}
