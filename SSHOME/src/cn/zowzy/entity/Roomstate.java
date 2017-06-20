package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Roomstate entity. @author MyEclipse Persistence Tools
 */

public class Roomstate implements java.io.Serializable {

	// Fields

	private Integer rsid;
	private String rsdescription;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roomstate() {
	}

	/** minimal constructor */
	public Roomstate(String rsdescription) {
		this.rsdescription = rsdescription;
	}

	/** full constructor */
	public Roomstate(String rsdescription, Set rooms) {
		this.rsdescription = rsdescription;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRsid() {
		return this.rsid;
	}

	public void setRsid(Integer rsid) {
		this.rsid = rsid;
	}

	public String getRsdescription() {
		return this.rsdescription;
	}

	public void setRsdescription(String rsdescription) {
		this.rsdescription = rsdescription;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}