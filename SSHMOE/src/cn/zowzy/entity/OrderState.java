package cn.zowzy.entity;

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
	
	private Integer osid;//房源状态ID
	private String description;  //状态描述
	
	
	
	
	
	
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
