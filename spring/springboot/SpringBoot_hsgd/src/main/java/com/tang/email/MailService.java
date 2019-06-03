package com.tang.email;

/**
 * 邮件
 * 
 * @author Administrator
 *
 */
public interface MailService {
	/**
	 * 发送简单邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 */
	void sendSimpleMail(String to, String subject, String content);

	/**
	 * 发送html邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 */
	void sendHtmlMail(String to, String subject, String content);

	/**
	 * 发送带附件的邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 * @param filePath
	 */
	void sendAttachmentsMail(String to, String subject, String content, String filePath);
	
	void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
