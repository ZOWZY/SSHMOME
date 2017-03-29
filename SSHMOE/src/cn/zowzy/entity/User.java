package cn.zowzy.entity;



/**
 * User类  用户实体类
 * 保存用户信息
 */
public class User {
	
	private String username;  //用户名
	private String password;  //登陆密码
	private String email;  //邮箱
	private String activeCode;  //激活码
	private Integer uState;  //用户状态
	private String payPassword;  //支付密码
	private float balance;  //用户余额
	private String phone;//用户电话  
	
	
	//还需要  用户状态  用户类型
	
	
	
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
	public Integer getuState() {
		return uState;
	}
	public void setuState(Integer uState) {
		this.uState = uState;
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
