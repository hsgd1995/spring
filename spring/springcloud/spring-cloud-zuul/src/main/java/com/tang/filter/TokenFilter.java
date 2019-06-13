package com.tang.filter;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 自定义过滤器-token过滤器
 * @author Administrator
 *
 */
public class TokenFilter extends ZuulFilter{

	private final Logger logger = LoggerFactory.getLogger(TokenFilter.class);
	
	@Override
	public Object run() {
		//filter需要执行的具体操作
		// 过滤token
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		logger.info("--->> TokenFilter {} {}",req.getMethod(),req.getRequestURL().toString());
		
		String token = req.getParameter("token");
		
		if(StringUtils.isNotBlank(token)){
			ctx.setSendZuulResponse(true);
			ctx.setResponseStatusCode(200);
			ctx.set("isSuccess",true);
			return null;
		}else{
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("token is empty");
			ctx.set("isSuccess", false);
			 return null;
		}
	}

	@Override
	public boolean shouldFilter() {
		// 是否执行该过滤器，此处为true，说明需要过滤
		return true;
	}

	@Override
	public int filterOrder() {
		// filter执行顺序，通过数字指定 ,优先级为10，数字越大，优先级越低
		return 10;
	}

	@Override
	public String filterType() {
		//定义filter的类型，有pre、route、post、error四种
		return "pre";
	}

}
