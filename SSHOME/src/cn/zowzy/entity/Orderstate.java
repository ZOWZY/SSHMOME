package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Orderstate entity. @author MyEclipse Persistence Tools
 */

public class Orderstate implements java.io.Serializable {

	// Fields

	private Integer osid;
	private String osdescription;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderstate() {
	}

	/** minimal constructor */
	public Orderstate(String osdescription) {
		this.osdescription = osdescription;
	}

	/** full constructor */
	public Orderstate(String osdescription, Set orderses) {
		this.osdescription = osdescription;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getOsid() {
		return this.osid;
	}

	public void setOsid(Integer osid) {
		this.osid = osid;
	}

	public String getOsdescription() {
		return this.osdescription;
	}

	public void setOsdescription(String osdescription) {
		this.osdescription = osdescription;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}