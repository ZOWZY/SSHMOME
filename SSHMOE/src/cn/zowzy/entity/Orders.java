package cn.zowzy.entity;

import java.util.Date;

/**
 * 
* 类名称：Order   
* 类描述： 订单类  
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午5:57:39     
*
 */
public class Orders {

	private String oid;  //订单编号
	private Date dateTime;//订单创建时间
	private Date unDateTime; //订单退订时间
	private float cost;  //订单价格
	private Integer pNumber;  //同行人数
	private Date checkinTime;  //入住时间
	private Date checkoutTime;  //离开时间
	private String remark;  //备注
	private String comments;  //评论
	
	private float score; //评论得分
	
	
	
	
	//还需要订单状态 房源信息  订单创建人
	
	private OrderState orderState =new OrderState();
	
	private Room  room=new Room();
	private User  user=new User();
	
	
	
	
	
	
	
	
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getOid() {
		return oid;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public Date getUnDateTime() {
		return unDateTime;
	}
	public void setUnDateTime(Date unDateTime) {
		this.unDateTime = unDateTime;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Integer getpNumber() {
		return pNumber;
	}
	public void setpNumber(Integer pNumber) {
		this.pNumber = pNumber;
	}
	public Date getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}
	public Date getCheckoutTime() {
		return checkoutTime;
	}
	public void setCheckoutTime(Date checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	
	
	
	
	
}
