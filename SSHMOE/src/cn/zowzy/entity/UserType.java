package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�UserType   
* ��������   �û�������
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:41:04     
*
 */
public class UserType {
	
	private Integer utid;//�û�����ID
	private String description;  //��������
	
	
	private Set<User> userSet=new HashSet<User>();
	
	
	
	
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	
	
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
