package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�RoomState   
* ��������  ��Դ״̬��
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:41:04     
*
 */
public class RoomState {
	
	private Integer rsid;//��Դ״̬ID
	private String description;  //״̬����
	

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
