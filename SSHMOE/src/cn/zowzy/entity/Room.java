package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�Room   
* ����������Դ��   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����5:37:56     
*
 */
public class Room {
	
	private Integer rid;  //��ԴID
	private String title;  //��Դ�ı���
	private String location;  //��Դ�ĵ���λ��
	private Integer maxPersonNumber;  //��Դ������������ס����
	private float price;  //��Դ�ļ۸�
	private double longitude;  //��Դ�ľ���
	private double latitude; //��Դ��γ��
	private float score;  //��Դ������

	
	private String description;  //��Դ������
	private Integer bad;  //��Դ�Ĵ�����Ŀ
	private Integer badroom; //��Դ���ҵ���Ŀ
	private Integer bathroom; //��Դ�Ƿ���������
	private Integer kitchen; //��Դ�Ƿ��г���
	private Integer wifi; //��Դ�Ƿ���wifi
	private Integer tv; //��Դ�е��ӵ���Ŀ
	private Integer park; //��Դ�Ƿ���ͣ��λ
	private Integer lift; //��Դ�Ƿ��е���
	
	//����Ҫ�û���Ϣ  ��Դ����  ��Դ״̬  ��������  �ղ�
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
	public Integer getBathroom() {
		return bathroom;
	}
	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}
	public Integer getKitchen() {
		return kitchen;
	}
	public void setKitchen(Integer kitchen) {
		this.kitchen = kitchen;
	}
	public Integer getWifi() {
		return wifi;
	}
	public void setWifi(Integer wifi) {
		this.wifi = wifi;
	}
	public Integer getTv() {
		return tv;
	}
	public void setTv(Integer tv) {
		this.tv = tv;
	}
	public Integer getPark() {
		return park;
	}
	public void setPark(Integer park) {
		this.park = park;
	}
	public Integer getLift() {
		return lift;
	}
	public void setLift(Integer lift) {
		this.lift = lift;
	}
	
	
	
	
	
	
	
	
}