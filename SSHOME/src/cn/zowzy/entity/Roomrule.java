package cn.zowzy.entity;

/**
 * Roomrule entity. @author MyEclipse Persistence Tools
 */

public class Roomrule implements java.io.Serializable {

	// Fields

	private Integer rrid;
	private Room room;
	private String content;

	// Constructors

	/** default constructor */
	public Roomrule() {
	}

	/** full constructor */
	public Roomrule(Room room, String content) {
		this.room = room;
		this.content = content;
	}

	// Property accessors

	public Integer getRrid() {
		return this.rrid;
	}

	public void setRrid(Integer rrid) {
		this.rrid = rrid;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}