package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* 类名称：Room   
* 类描述：房源类   
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午5:37:56     
*
 */
public class Room {
	
	private Integer rid;  //房源ID
	private String title;  //房源的标题
	private String location;  //房源的地理位置
	private Integer maxPersonNumber;  //房源允许的最大的入住人数
	private float price;  //房源的价格
	private double longitude;  //房源的经度
	private double latitude; //房源的纬度
	private float score;  //房源的评分

	
	private String description;  //房源的描述
	private Integer bad;  //房源的床的数目
	private Integer badroom; //房源卧室的数目
	private Boolean bathroom; //房源是否有卫生间
	private Boolean kitchen; //房源是否有厨房
	private Boolean wifi; //房源是否有wifi
	private Integer tv; //房源有电视的数目
	private Boolean park; //房源是否有停车位
	private Boolean lift; //房源是否有电梯
	
	//还需要用户信息  房源类型  房源状态  房屋守则  收藏
	private User user=new User();
	private RoomType roomType=new RoomType();
	private RoomState roomState=new RoomState();
	private Set<RoomRule>  roomRuleSet=new HashSet<RoomRule>();
	
	private Set<Collect>  collectSet=new HashSet<Collect>();
	
	public Set<Collect> getCollectSet() {
		return collectSet;
	}
	
	
	private Set<Orders> orderSet=new HashSet<Orders>(); 
	
	
	
	
	public Set<Orders> getOrderSet() {
		return orderSet;
	}





	public void setOrderSet(Set<Orders> orderSet) {
		this.orderSet = orderSet;
	}





	public void setCollectSet(Set<Collect> collectSet) {
		this.collectSet = collectSet;
	}
	
	
	
	
	
	public Set<RoomRule> getRoomRuleSet() {
		return roomRuleSet;
	}
	public void setRoomRuleSet(Set<RoomRule> roomRuleSet) {
		this.roomRuleSet = roomRuleSet;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public RoomState getRoomState() {
		return roomState;
	}
	public void setRoomState(RoomState roomState) {
		this.roomState = roomState;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMaxPersonNumber() {
		return maxPersonNumber;
	}
	public void setMaxPersonNumber(Integer maxPersonNumber) {
		this.maxPersonNumber = maxPersonNumber;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getBad() {
		return bad;
	}
	public void setBad(Integer bad) {
		this.bad = bad;
	}
	public Integer getBadroom() {
		return badroom;
	}
	public void setBadroom(Integer badroom) {
		this.badroom = badroom;
	}
	
	public Integer getTv() {
		return tv;
	}
	public void setTv(Integer tv) {
		this.tv = tv;
	}





	public Boolean getBathroom() {
		return bathroom;
	}





	public void setBathroom(Boolean bathroom) {
		this.bathroom = bathroom;
	}





	public Boolean getKitchen() {
		return kitchen;
	}





	public void setKitchen(Boolean kitchen) {
		this.kitchen = kitchen;
	}





	public Boolean getWifi() {
		return wifi;
	}





	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}





	public Boolean getPark() {
		return park;
	}





	public void setPark(Boolean park) {
		this.park = park;
	}





	public Boolean getLift() {
		return lift;
	}





	public void setLift(Boolean lift) {
		this.lift = lift;
	}
	
	
	
	
	
	
	
	
}
