package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* 类名称：OrderState   
* 类描述： 订单状态类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:41:04     
*
 */
public class OrderState {
	
	private Integer osid;//订单状态ID
	private String description;  //状态描述
	
	
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
