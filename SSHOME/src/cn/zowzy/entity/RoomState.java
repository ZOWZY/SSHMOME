package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* 类名称：RoomState   
* 类描述：  房源状态类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:41:04     
*
 */
public class RoomState {
	
	private Integer rsid;//房源状态ID
	private String description;  //状态描述
	

	private Set<Room>  roomSet=new HashSet<Room>();
	
	
	
	public Set<Room> getRoomSet() {
		return roomSet;
	}
	public void setRoomSet(Set<Room> roomSet) {
		this.roomSet = roomSet;
	}
	
	public Integer getRsid() {
		return rsid;
	}
	public void setRsid(Integer rsid) {
		this.rsid = rsid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
