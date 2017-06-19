package cn.zowzy.entity;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String oid;
	private User user;
	private Room room;
	private Orderstate orderstate;
	private Timestamp datetime;
	private Timestamp unDateTime;
	private Float cost;
	private Integer pnumber;
	private Timestamp checkintime;
	private Timestamp checkouttime;
	private String remark;
	private String comments;
	private Float score;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(User user, Room room, Orderstate orderstate, Timestamp datetime, Timestamp unDateTime, Float cost,
			Integer pnumber, Timestamp checkintime, Timestamp checkouttime, String remark, String comments,
			Float score) {
		this.user = user;
		this.room = room;
		this.orderstate = orderstate;
		this.datetime = datetime;
		this.unDateTime = unDateTime;
		this.cost = cost;
		this.pnumber = pnumber;
		this.checkintime = checkintime;
		this.checkouttime = checkouttime;
		this.remark = remark;
		this.comments = comments;
		this.score = score;
	}

	// Property accessors

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
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

	public Orderstate getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(Orderstate orderstate) {
		this.orderstate = orderstate;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public Timestamp getUnDateTime() {
		return this.unDateTime;
	}

	public void setUnDateTime(Timestamp unDateTime) {
		this.unDateTime = unDateTime;
	}

	public Float getCost() {
		return this.cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Integer getPnumber() {
		return this.pnumber;
	}

	public void setPnumber(Integer pnumber) {
		this.pnumber = pnumber;
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

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

}