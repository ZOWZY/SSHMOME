package cn.zowzy.util;

import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class MailUtils {
	
	private String id;//超链接的标签的ID
	
	private String filePath;//邮件的html
	
	private String url;//超链接的地址
	
	private String subject;
	
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 发送邮件
	 * @param to  收件人
	 * @param code  激活码
	 */
	public void sendMail(String to,String code){
		
		
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory"; 
		//1.获得一个Session对象
		Properties props=new Properties();
		//设置发送邮件的环境
		props.setProperty("mail.host", "smtp.qq.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtp.auth", "true");
        
		Session session=Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1727078617@qq.com", "zsronkgbnnxydbcc");
			}
		});
		
		//2.创建一个代表邮件的对象Message
		Message message=new MimeMessage(session);
		try {
			//设置发送者
			message.setFrom(new InternetAddress("1727078617@qq.com"));
			//设置接受者
			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			//设置标题
			message.setSubject(subject);
			//设置邮件的正文
			
			String mess=getMailContent("UTF-8", "", url);
			message.setContent(mess, "text/html;charset=utf-8");
			System.out.println("邮件");
			System.out.println(mess);
			//3.发送邮件Transport
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("发送激活邮件失败");
		}
	}
	
	public String getMailContent(String codetype,
			String baseUrl,String activeUrl){
		String html="";
		File input = new File(filePath);
		try {
			Document doc = Jsoup.parse(input, "UTF-8", baseUrl);
			Element element=doc.getElementById(id);
			//TODO 从新拼接url 加上激活码
			element.attr("href", url);
			element.append(url);
			html=doc.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return html;
	}
	
	/*
	public static void main(String[] args) {
		MailUtils m=new MailUtils();
		m.setFilePath("E:/DevelopmentProject/Git/SSHOME/SSHOME/WebRoot/WEB-INF/mails/PswChange.html");
		m.setId("url");
		m.setSubject("账号激活");
		m.setUrl("www.baidu.com");
		m.sendMail("842088077@qq.com", "789456123");
	}*/
}
