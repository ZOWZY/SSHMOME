package cn.zowzy.entity;

/**
 * Collect entity. @author MyEclipse Persistence Tools
 */

public class Collect implements java.io.Serializable {

	// Fields

	private Integer cid;
	private Room room;
	private String username;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** full constructor */
	public Collect(Room room, String username) {
		this.room = room;
		this.username = username;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}