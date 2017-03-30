package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User类  用户实体类
 * 保存用户信息
 */
public class User {
	
	private String username;  //用户名
	private String password;  //登陆密码
	private String email;  //邮箱
	private String activeCode;  //激活码
	private String payPassword;  //支付密码
	private float balance;  //用户余额
	private String phone;//用户电话  
	
	
	//还需要  用户状态  用户类型  房源  收藏
	
	private UserState userState=new UserState();
	private UserType userType=new UserType();
	
	private Set<Room> roomSet=new HashSet<Room>();
	
	
	private Set<Collect>  collectSet=new HashSet<Collect>();
	
	private Set<Orders> orderSet=new HashSet<Orders>();
	
	
	
	
	
	public Set<Orders> getOrderSet() {
		return orderSet;
	}
	public void setOrderSet(Set<Orders> orderSet) {
		this.orderSet = orderSet;
	}
	public Set<Collect> getCollectSet() {
		return collectSet;
	}
	public void setCollectSet(Set<Collect> collectSet) {
		this.collectSet = collectSet;
	}
	
	public Set<Room> getRoomSet() {
		return roomSet;
	}
	public void setRoomSet(Set<Room> roomSet) {
		this.roomSet = roomSet;
	}
	public UserState getUserState() {
		return userState;
	}
	public void setUserState(UserState userState) {
		this.userState = userState;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
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
