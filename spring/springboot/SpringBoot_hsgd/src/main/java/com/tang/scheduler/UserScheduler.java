package com.tang.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户定时器
 * @author Administrator
 *
 */
@Component
@Slf4j
public class UserScheduler {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //每隔2秒执行一次
    //@Scheduled(fixedRate = 2000)
    public void testTasks1() {
        log.info("定时任务执行时间：" + dateFormat.format(new Date()));
    }

    //每天3：05执行
    @Scheduled(cron = "0 05 03 ? * *")
    public void testTasks2() {
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }
}
