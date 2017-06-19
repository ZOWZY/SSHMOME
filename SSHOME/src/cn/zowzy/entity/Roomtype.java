package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Roomtype entity. @author MyEclipse Persistence Tools
 */

public class Roomtype implements java.io.Serializable {

	// Fields

	private Integer rtid;
	private String description;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roomtype() {
	}

	/** full constructor */
	public Roomtype(String description, Set rooms) {
		this.description = description;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRtid() {
		return this.rtid;
	}

	public void setRtid(Integer rtid) {
		this.rtid = rtid;
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