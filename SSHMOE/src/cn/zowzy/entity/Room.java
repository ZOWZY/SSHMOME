package cn.zowzy.entity;


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
	private Integer rState;  //房源的状态
	private Integer maxPersonNumber;  //房源允许的最大的入住人数
	private float price;  //房源的价格
	private double longitude;  //房源的经度
	private double latitude; //房源的纬度
	private float score;  //房源的评分

	
	private String description;  //房源的描述
	private Integer bad;  //房源的床的数目
	private Integer badroom; //房源卧室的数目
	private Integer bathroom; //房源是否有卫生间
	private Integer kitchen; //房源是否有厨房
	private Integer wifi; //房源是否有wifi
	private Integer tv; //房源有电视的数目
	private Integer park; //房源是否有停车位
	private Integer lift; //房源是否有电梯
	
	//还需要用户信息  房源类型
	
	
	
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
	public Integer getrState() {
		return rState;
	}
	public void setrState(Integer rState) {
		this.rState = rState;
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
