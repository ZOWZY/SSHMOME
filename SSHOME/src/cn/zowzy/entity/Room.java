package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room implements java.io.Serializable {

	// Fields

	private Integer rid;
	private User user;
	private Roomtype roomtype;
	private Roomstate roomstate;
	private String title;
	private String location;
	private Integer maxpersonnumber;
	private Float price;
	private Double longitude;
	private Double latitude;
	private Float score;
	private String description;
	private Integer bad;
	private Integer badroom;
	private Integer bathroom;
	private Integer kitchen;
	private Integer wifi;
	private Integer tv;
	private Integer park;
	private Integer lift;
	private Set orderses = new HashSet(0);
	private Set roomrules = new HashSet(0);
	private Set collects = new HashSet(0);

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** full constructor */
	public Room(User user, Roomtype roomtype, Roomstate roomstate, String title, String location,
			Integer maxpersonnumber, Float price, Double longitude, Double latitude, Float score, String description,
			Integer bad, Integer badroom, Integer bathroom, Integer kitchen, Integer wifi, Integer tv, Integer park,
			Integer lift, Set orderses, Set roomrules, Set collects) {
		this.user = user;
		this.roomtype = roomtype;
		this.roomstate = roomstate;
		this.title = title;
		this.location = location;
		this.maxpersonnumber = maxpersonnumber;
		this.price = price;
		this.longitude = longitude;
		this.latitude = latitude;
		this.score = score;
		this.description = description;
		this.bad = bad;
		this.badroom = badroom;
		this.bathroom = bathroom;
		this.kitchen = kitchen;
		this.wifi = wifi;
		this.tv = tv;
		this.park = park;
		this.lift = lift;
		this.orderses = orderses;
		this.roomrules = roomrules;
		this.collects = collects;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Roomtype getRoomtype() {
		return this.roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public Roomstate getRoomstate() {
		return this.roomstate;
	}

	public void setRoomstate(Roomstate roomstate) {
		this.roomstate = roomstate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMaxpersonnumber() {
		return this.maxpersonnumber;
	}

	public void setMaxpersonnumber(Integer maxpersonnumber) {
		this.maxpersonnumber = maxpersonnumber;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBad() {
		return this.bad;
	}

	public void setBad(Integer bad) {
		this.bad = bad;
	}

	public Integer getBadroom() {
		return this.badroom;
	}

	public void setBadroom(Integer badroom) {
		this.badroom = badroom;
	}

	public Integer getBathroom() {
		return this.bathroom;
	}

	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}

	public Integer getKitchen() {
		return this.kitchen;
	}

	public void setKitchen(Integer kitchen) {
		this.kitchen = kitchen;
	}

	public Integer getWifi() {
		return this.wifi;
	}

	public void setWifi(Integer wifi) {
		this.wifi = wifi;
	}

	public Integer getTv() {
		return this.tv;
	}

	public void setTv(Integer tv) {
		this.tv = tv;
	}

	public Integer getPark() {
		return this.park;
	}

	public void setPark(Integer park) {
		this.park = park;
	}

	public Integer getLift() {
		return this.lift;
	}

	public void setLift(Integer lift) {
		this.lift = lift;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getRoomrules() {
		return this.roomrules;
	}

	public void setRoomrules(Set roomrules) {
		this.roomrules = roomrules;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

}