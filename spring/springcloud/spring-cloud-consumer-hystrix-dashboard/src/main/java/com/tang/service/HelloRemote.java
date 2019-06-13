package com.tang.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tang.service.impl.HelloRemoteHystrix;

/**
 * 远程服务的调用接口，
 * 如果服务调用失败，则执行HelloRemoteHystrix里的实现方法
 * @author Administrator
 *
 */
@FeignClient(name= "producer",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
