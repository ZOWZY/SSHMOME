package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Roomtype roomtype;
	private Roomstate roomstate;
	private String title;
	private String localtion;
	private Integer maxpersonnumber;
	private Float price;
	private Double longitude;   //经度
	private Double latitude;    //纬度
	private Float score;
	private String description;
	private Integer bed;
	private Integer bedroom;
	private Integer bathroom;
	private Boolean kitchen;
	private Boolean wifi;
	private Integer tv;
	private Boolean park;
	private Boolean lift;
	private String rule;
	private Set orderses = new HashSet(0);
	private Set collects = new HashSet(0);

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** minimal constructor */
	public Room(String title, String localtion, Integer maxpersonnumber, Float price, Double longitude, Double latitude,
			Float score, String description, Integer bed, Integer bedroom, Integer bathroom, Boolean kitchen,
			Boolean wifi, Integer tv, Boolean park, Boolean lift) {
		this.title = title;
		this.localtion = localtion;
		this.maxpersonnumber = maxpersonnumber;
		this.price = price;
		this.longitude = longitude;
		this.latitude = latitude;
		this.score = score;
		this.description = description;
		this.bed = bed;
		this.bedroom = bedroom;
		this.bathroom = bathroom;
		this.kitchen = kitchen;
		this.wifi = wifi;
		this.tv = tv;
		this.park = park;
		this.lift = lift;
	}

	/** full constructor */
	public Room(Roomtype roomtype, Roomstate roomstate, String title, String localtion, Integer maxpersonnumber,
			Float price, Double longitude, Double latitude, Float score, String description, Integer bed,
			Integer bedroom, Integer bathroom, Boolean kitchen, Boolean wifi, Integer tv, Boolean park, Boolean lift,
			String rule, Set orderses, Set collects) {
		this.roomtype = roomtype;
		this.roomstate = roomstate;
		this.title = title;
		this.localtion = localtion;
		this.maxpersonnumber = maxpersonnumber;
		this.price = price;
		this.longitude = longitude;
		this.latitude = latitude;
		this.score = score;
		this.description = description;
		this.bed = bed;
		this.bedroom = bedroom;
		this.bathroom = bathroom;
		this.kitchen = kitchen;
		this.wifi = wifi;
		this.tv = tv;
		this.park = park;
		this.lift = lift;
		this.rule = rule;
		this.orderses = orderses;
		this.collects = collects;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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

	public String getLocaltion() {
		return this.localtion;
	}

	public void setLocaltion(String localtion) {
		this.localtion = localtion;
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

	public Integer getBed() {
		return this.bed;
	}

	public void setBed(Integer bed) {
		this.bed = bed;
	}

	public Integer getBedroom() {
		return this.bedroom;
	}

	public void setBedroom(Integer bedroom) {
		this.bedroom = bedroom;
	}

	public Integer getBathroom() {
		return this.bathroom;
	}

	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}

	public Boolean getKitchen() {
		return this.kitchen;
	}

	public void setKitchen(Boolean kitchen) {
		this.kitchen = kitchen;
	}

	public Boolean getWifi() {
		return this.wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Integer getTv() {
		return this.tv;
	}

	public void setTv(Integer tv) {
		this.tv = tv;
	}

	public Boolean getPark() {
		return this.park;
	}

	public void setPark(Boolean park) {
		this.park = park;
	}

	public Boolean getLift() {
		return this.lift;
	}

	public void setLift(Boolean lift) {
		this.lift = lift;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

}