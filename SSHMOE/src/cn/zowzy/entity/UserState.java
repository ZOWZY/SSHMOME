package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* 类名称：UserState   
* 类描述：    用户状态类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:41:04     
*
 */
public class UserState {
	
	private Integer usid;//用户状态ID
	private String description;  //用户状态描述
	
	
	private Set<User> userSet=new HashSet<User>();
	
	
	
	
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	
	
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
