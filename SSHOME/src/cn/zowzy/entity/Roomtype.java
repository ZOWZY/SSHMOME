package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Roomtype entity. @author MyEclipse Persistence Tools
 */

public class Roomtype implements java.io.Serializable {

	// Fields

	private Integer rtid;
	private String rtdescription;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roomtype() {
	}

	/** minimal constructor */
	public Roomtype(String rtdescription) {
		this.rtdescription = rtdescription;
	}

	/** full constructor */
	public Roomtype(String rtdescription, Set rooms) {
		this.rtdescription = rtdescription;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRtid() {
		return this.rtid;
	}

	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}

	public String getRtdescription() {
		return this.rtdescription;
	}

	public void setRtdescription(String rtdescription) {
		this.rtdescription = rtdescription;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}