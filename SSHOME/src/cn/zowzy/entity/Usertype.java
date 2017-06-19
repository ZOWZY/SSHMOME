package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Usertype entity. @author MyEclipse Persistence Tools
 */

public class Usertype implements java.io.Serializable {

	// Fields

	private Integer utid;
	private String description;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usertype() {
	}

	/** full constructor */
	public Usertype(String description, Set userses) {
		this.description = description;
		this.userses = userses;
	}

	// Property accessors

	public Integer getUtid() {
		return this.utid;
	}

	public void setUtid(Integer utid) {
		this.utid = utid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}