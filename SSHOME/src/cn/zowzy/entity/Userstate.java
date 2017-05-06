package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Userstate entity. @author MyEclipse Persistence Tools
 */

public class Userstate implements java.io.Serializable {

	// Fields

	private Integer usid;
	private String usdescription;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userstate() {
	}

	/** minimal constructor */
	public Userstate(String usdescription) {
		this.usdescription = usdescription;
	}

	/** full constructor */
	public Userstate(String usdescription, Set userses) {
		this.usdescription = usdescription;
		this.userses = userses;
	}

	// Property accessors

	public Integer getUsid() {
		return this.usid;
	}

	public void setUsid(Integer usid) {
		this.usid = usid;
	}

	public String getUsdescription() {
		return this.usdescription;
	}

	public void setUsdescription(String usdescription) {
		this.usdescription = usdescription;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}