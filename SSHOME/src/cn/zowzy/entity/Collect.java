package cn.zowzy.entity;



/**
 * 
* 
* �����ƣ�Collect   
* ��������  �ղ���  
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:46:45     
*
 */
public class Collect {
	
	private Integer cid;  //�ղر��
	
	//����Ҫ ��Դ��Ϣ �û���Ϣ
	private Room room=new Room();
	private User user=new User();
	
	
	
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	

	
	

	
	
}
