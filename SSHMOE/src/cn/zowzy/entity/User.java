package cn.zowzy.entity;



/**
 * User��  �û�ʵ����
 * �����û���Ϣ
 */
public class User {
	
	private String username;  //�û���
	private String password;  //��½����
	private String email;  //����
	private String activeCode;  //������
	private String payPassword;  //֧������
	private float balance;  //�û����
	private String phone;//�û��绰  
	
	
	//����Ҫ  �û�״̬  �û�����
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
