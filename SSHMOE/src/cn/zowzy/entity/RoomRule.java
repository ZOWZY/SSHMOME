package cn.zowzy.entity;


/**
 * 
* �����ƣ�RoomRule   
* ��������   ��Դ������
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����5:49:35     
*
 */
public class RoomRule {
	
	private Integer rrid;  //������

	
	private String content;  //��������

	
	//����Ҫ��Դ���
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
