package cn.zowzy.entity;

import java.util.Date;

/**
 * 
* �����ƣ�Order   
* �������� ������  
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����5:57:39     
*
 */
public class Orders {

	private String oid;  //�������
	private Date dateTime;//��������ʱ��
	private Date unDateTime; //�����˶�ʱ��
	private float cost;  //�����۸�
	private Integer pNumber;  //ͬ������
	private Date checkinTime;  //��סʱ��
	private Date checkoutTime;  //�뿪ʱ��
	private String remark;  //��ע
	private String comments;  //����
	
	private float score; //���۵÷�
	
	
	
	
	//����Ҫ����״̬ ��Դ��Ϣ  ����������
	
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
