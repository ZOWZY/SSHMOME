package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String username;
	private Userstate userstate;
	private Usertype usertype;
	private String password;
	private String email;
	private String activecode;
	private String paypassword;
	private Float balance;
	private String phone;
	private String changepasswordcode;
	private String changepaypasswordcode;
	private Set ordersesForUsername = new HashSet(0);
	private Set ordersesForUseUsername = new HashSet(0);
	private Set ordersesForUseUsername_1 = new HashSet(0);
	private Set collects = new HashSet(0);
	private Set ordersesForUsername_1 = new HashSet(0);
	private Set collects_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String username, String password, String email, String paypassword, Float balance, String phone) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.paypassword = paypassword;
		this.balance = balance;
		this.phone = phone;
	}

	/** full constructor */
	public Users(String username, Userstate userstate, Usertype usertype, String password, String email,
			String activecode, String paypassword, Float balance, String phone, String changepasswordcode,
			String changepaypasswordcode, Set ordersesForUsername, Set ordersesForUseUsername,
			Set ordersesForUseUsername_1, Set collects, Set ordersesForUsername_1, Set collects_1) {
		this.username = username;
		this.userstate = userstate;
		this.usertype = usertype;
		this.password = password;
		this.email = email;
		this.activecode = activecode;
		this.paypassword = paypassword;
		this.balance = balance;
		this.phone = phone;
		this.changepasswordcode = changepasswordcode;
		this.changepaypasswordcode = changepaypasswordcode;
		this.ordersesForUsername = ordersesForUsername;
		this.ordersesForUseUsername = ordersesForUseUsername;
		this.ordersesForUseUsername_1 = ordersesForUseUsername_1;
		this.collects = collects;
		this.ordersesForUsername_1 = ordersesForUsername_1;
		this.collects_1 = collects_1;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Userstate getUserstate() {
		return this.userstate;
	}

	public void setUserstate(Userstate userstate) {
		this.userstate = userstate;
	}

	public Usertype getUsertype() {
		return this.usertype;
	}

	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActivecode() {
		return this.activecode;
	}

	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}

	public String getPaypassword() {
		return this.paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getChangepasswordcode() {
		return this.changepasswordcode;
	}

	public void setChangepasswordcode(String changepasswordcode) {
		this.changepasswordcode = changepasswordcode;
	}

	public String getChangepaypasswordcode() {
		return this.changepaypasswordcode;
	}

	public void setChangepaypasswordcode(String changepaypasswordcode) {
		this.changepaypasswordcode = changepaypasswordcode;
	}

	public Set getOrdersesForUsername() {
		return this.ordersesForUsername;
	}

	public void setOrdersesForUsername(Set ordersesForUsername) {
		this.ordersesForUsername = ordersesForUsername;
	}

	public Set getOrdersesForUseUsername() {
		return this.ordersesForUseUsername;
	}

	public void setOrdersesForUseUsername(Set ordersesForUseUsername) {
		this.ordersesForUseUsername = ordersesForUseUsername;
	}

	public Set getOrdersesForUseUsername_1() {
		return this.ordersesForUseUsername_1;
	}

	public void setOrdersesForUseUsername_1(Set ordersesForUseUsername_1) {
		this.ordersesForUseUsername_1 = ordersesForUseUsername_1;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

	public Set getOrdersesForUsername_1() {
		return this.ordersesForUsername_1;
	}

	public void setOrdersesForUsername_1(Set ordersesForUsername_1) {
		this.ordersesForUsername_1 = ordersesForUsername_1;
	}

	public Set getCollects_1() {
		return this.collects_1;
	}

	public void setCollects_1(Set collects_1) {
		this.collects_1 = collects_1;
	}

}