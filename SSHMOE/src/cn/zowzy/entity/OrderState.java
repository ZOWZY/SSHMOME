package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�OrderState   
* �������� ����״̬��
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:41:04     
*
 */
public class OrderState {
	
	private Integer osid;//����״̬ID
	private String description;  //״̬����
	
	
	private Set<Orders>  orderSet=new HashSet<Orders>();
	
	
	
	
	public Set<Orders> getOrderSet() {
		return orderSet;
	}
	public void setOrderSet(Set<Orders> orderSet) {
		this.orderSet = orderSet;
	}
	public Integer getOsid() {
		return osid;
	}
	public void setOsid(Integer osid) {
		this.osid = osid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
