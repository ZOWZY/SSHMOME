package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Usertype entity. @author MyEclipse Persistence Tools
 */

public class Usertype implements java.io.Serializable {

	// Fields

	private Integer utid;
	private String utdescription;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usertype() {
	}

	/** minimal constructor */
	public Usertype(String utdescription) {
		this.utdescription = utdescription;
	}

	/** full constructor */
	public Usertype(String utdescription, Set userses) {
		this.utdescription = utdescription;
		this.userses = userses;
	}

	// Property accessors

	public Integer getUtid() {
		return this.utid;
	}

	public void setUtid(Integer utid) {
		this.utid = utid;
	}

	public String getUtdescription() {
		return this.utdescription;
	}

	public void setUtdescription(String utdescription) {
		this.utdescription = utdescription;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}