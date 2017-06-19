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
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usertype() {
	}

	/** full constructor */
	public Usertype(String description, Set users) {
		this.description = description;
		this.users = users;
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

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}