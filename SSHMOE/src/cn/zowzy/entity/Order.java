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
public class Order {

	private String oid;  //�������
	private String orderUsername;  //�����Ĵ�����  ���ⷿ��
	private Date dateTime;//��������ʱ��
	private Date unDateTime; //�����˶�ʱ��
	private float cost;  //�����۸�
	private Integer pNumber;  //ͬ������
	private Date checkinTime;  //��סʱ��
	private Date checkoutTime;  //�뿪ʱ��
	private String remark;  //��ע
	private String comments;  //����
	
	
	
	
	
	//����Ҫ����״̬ ��Դ��Ϣ
	
	
	
	
	
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOrderUsername() {
		return orderUsername;
	}
	public void setOrderUsername(String orderUsername) {
		this.orderUsername = orderUsername;
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
