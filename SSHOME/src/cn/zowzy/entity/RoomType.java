package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�RoomType   
* ��������   ��Դ������
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:41:04     
 * @param <E>
*
 */
public class RoomType<E> {
	
	private Integer rtid;//��Դ״̬ID
	private String description;  //״̬����
	
	
	
	private Set<Room>  roomSet=new HashSet<Room>();
	
	
	
	public Set<Room> getRoomSet() {
		return roomSet;
	}
	public void setRoomSet(Set<Room> roomSet) {
		this.roomSet = roomSet;
	}
	public Integer getRtid() {
		return rtid;
	}
	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
