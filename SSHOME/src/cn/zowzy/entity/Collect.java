package cn.zowzy.entity;

/**
 * Collect entity. @author MyEclipse Persistence Tools
 */

public class Collect implements java.io.Serializable {

	// Fields

	private Integer cid;
	private User user;
	private Room room;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** full constructor */
	public Collect(User user, Room room) {
		this.user = user;
		this.room = room;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}