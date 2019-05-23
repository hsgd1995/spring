package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 过滤器
 * @author Administrator
 * @date   2019年5月15日
 */
public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) sRequest;
		System.out.println("this is MyFilter,url :"+request.getRequestURI());
		filterChain.doFilter(sRequest, sResponse);
	}

}
