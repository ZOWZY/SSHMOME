package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Orderstate entity. @author MyEclipse Persistence Tools
 */

public class Orderstate implements java.io.Serializable {

	// Fields

	private Integer osid;
	private String description;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderstate() {
	}

	/** full constructor */
	public Orderstate(String description, Set orderses) {
		this.description = description;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getOsid() {
		return this.osid;
	}

	public void setOsid(Integer osid) {
		this.osid = osid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}