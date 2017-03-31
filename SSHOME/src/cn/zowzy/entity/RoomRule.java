package cn.zowzy.entity;


/**
 * 
* 类名称：RoomRule   
* 类描述：   房源守则类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午5:49:35     
*
 */
public class RoomRule {
	
	private Integer rrid;  //守则编号

	
	private String content;  //守则内容

	
	//还需要房源编号
	private Room room=new Room();
	

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getContent() {
		return content;
	}

	public Integer getRrid() {
		return rrid;
	}

	public void setRrid(Integer rrid) {
		this.rrid = rrid;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
