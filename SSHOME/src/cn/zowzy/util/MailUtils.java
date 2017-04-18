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

	private String id;// 标签的ID

	private String filePath;// html的路径

	private String url;// 链接地址ַ

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
	 * 
	 * @param to
	 * @param code
	 */
	public void sendMail(String to, String code) {

		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = new Properties();
		props.setProperty("mail.host", "smtp.qq.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1727078617@qq.com", "zsronkgbnnxydbcc");
			}
		});

		// 2.����һ�������ʼ��Ķ���Message
		Message message = new MimeMessage(session);
		try {
			// ���÷�����
			message.setFrom(new InternetAddress("1727078617@qq.com"));
			// ���ý�����
			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			// ���ñ���
			message.setSubject(subject);
			// �����ʼ�������

			String mess = getMailContent("UTF-8", "", url);
			message.setContent(mess, "text/html;charset=utf-8");
			System.out.println("�ʼ�");
			System.out.println(mess);
			// 3.�����ʼ�Transport
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ͼ����ʼ�ʧ��");
		}
	}

	public String getMailContent(String codetype, String baseUrl, String activeUrl) {
		String html = "";
		File input = new File(filePath);
		try {
			Document doc = Jsoup.parse(input, "UTF-8", baseUrl);
			Element element = doc.getElementById(id);
			// TODO
			element.attr("href", url);
			element.append(url);
			html = doc.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return html;
	}

	/*
	 * public static void main(String[] args) { MailUtils m=new MailUtils();
	 * m.setFilePath(
	 * "E:/DevelopmentProject/Git/SSHOME/SSHOME/WebRoot/WEB-INF/mails/PswChange.html"
	 * ); m.setId("url"); m.setSubject("�˺ż���"); m.setUrl("www.baidu.com");
	 * m.sendMail("842088077@qq.com", "789456123"); }
	 */
}
