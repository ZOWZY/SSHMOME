package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Userstate entity. @author MyEclipse Persistence Tools
 */

public class Userstate implements java.io.Serializable {

	// Fields

	private Integer usid;
	private String description;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userstate() {
	}

	/** full constructor */
	public Userstate(String description, Set users) {
		this.description = description;
		this.users = users;
	}

	// Property accessors

	public Integer getUsid() {
		return this.usid;
	}

	public void setUsid(Integer usid) {
		this.usid = usid;
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