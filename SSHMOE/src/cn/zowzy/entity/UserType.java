package cn.zowzy.entity;

/**
 * 
*  
* 类名称：UserType   
* 类描述：   用户类型类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:41:04     
*
 */
public class UserType {
	
	private Integer utid;//用户类型ID
	private String description;  //类型描述
	
	public Integer getUtid() {
		return utid;
	}
	public void setUtid(Integer utid) {
		this.utid = utid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
