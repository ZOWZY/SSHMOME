package cn.zowzy.entity;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String oid;
	private Orderstate orderstate;
	private Room room;
	private Timestamp undatetime;
	private Timestamp datetime;
	private Float cost;
	private Integer personnumber;
	private Timestamp checkintime;
	private Timestamp checkouttime;
	private String remark;
	private String comments;
	private Float commentsscore;
	private String username;
	private String useUsername;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Timestamp datetime, Float cost, Integer personnumber) {
		this.datetime = datetime;
		this.cost = cost;
		this.personnumber = personnumber;
	}

	/** full constructor */
	public Orders(Orderstate orderstate, Room room, Timestamp undatetime, Timestamp datetime, Float cost,
			Integer personnumber, Timestamp checkintime, Timestamp checkouttime, String remark, String comments,
			Float commentsscore, String username, String useUsername) {
		this.orderstate = orderstate;
		this.room = room;
		this.undatetime = undatetime;
		this.datetime = datetime;
		this.cost = cost;
		this.personnumber = personnumber;
		this.checkintime = checkintime;
		this.checkouttime = checkouttime;
		this.remark = remark;
		this.comments = comments;
		this.commentsscore = commentsscore;
		this.username = username;
		this.useUsername = useUsername;
	}

	// Property accessors

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Orderstate getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(Orderstate orderstate) {
		this.orderstate = orderstate;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Timestamp getUndatetime() {
		return this.undatetime;
	}

	public void setUndatetime(Timestamp undatetime) {
		this.undatetime = undatetime;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public Float getCost() {
		return this.cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Integer getPersonnumber() {
		return this.personnumber;
	}

	public void setPersonnumber(Integer personnumber) {
		this.personnumber = personnumber;
	}

	public Timestamp getCheckintime() {
		return this.checkintime;
	}

	public void setCheckintime(Timestamp checkintime) {
		this.checkintime = checkintime;
	}

	public Timestamp getCheckouttime() {
		return this.checkouttime;
	}

	public void setCheckouttime(Timestamp checkouttime) {
		this.checkouttime = checkouttime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Float getCommentsscore() {
		return this.commentsscore;
	}

	public void setCommentsscore(Float commentsscore) {
		this.commentsscore = commentsscore;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseUsername() {
		return this.useUsername;
	}

	public void setUseUsername(String useUsername) {
		this.useUsername = useUsername;
	}

}