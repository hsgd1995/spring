package com.tang.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tang.email.MailService;

/**
 * 邮件测试类
 * 
 * @author Administrator
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MailServiceTest {
	@Autowired
	private MailService mailService;

	@Test
	public void testSimpleMail() {
		mailService.sendSimpleMail("1909960218@qq.com", "测试springboot 简单邮件", "这是第四封测试邮件，用于测试springboot邮件功能");
	}

	@Test
	public void testHtmlMail() throws Exception {
	    String content="<html>\n" +
	            "<body>\n" +
	            "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
	            "</body>\n" +
	            "</html>";
	    mailService.sendHtmlMail("1909960218@qq.com","html 邮件",content);
	}
	
	@Test
	public void testAttachmentsMail(){
		String filePath = "D:\\1.jpg";
		mailService.sendAttachmentsMail("1909960218@qq.com", "带附件的邮件", "这是带附件的邮件", filePath);
	}
	
	@Test
	public void sendInlineResourceMail() {
	    String rscId = "neo006";
	    String content="<html><body>这是有图片的第二封邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
	    String imgPath = "D:\\3f9b9ff108732181.jpg";

	    mailService.sendInlineResourceMail("1909960218@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
	}
}
