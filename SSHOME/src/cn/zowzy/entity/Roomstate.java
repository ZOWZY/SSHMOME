package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Roomstate entity. @author MyEclipse Persistence Tools
 */

public class Roomstate implements java.io.Serializable {

	// Fields

	private Integer rsid;
	private String description;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roomstate() {
	}

	/** full constructor */
	public Roomstate(String description, Set rooms) {
		this.description = description;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRsid() {
		return this.rsid;
	}

	public void setRsid(Integer rsid) {
		this.rsid = rsid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}