package cn.zowzy.entity;



/**
 * 
* 
* 类名称：Collect   
* 类描述：  收藏类  
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:46:45     
*
 */
public class Collect {
	
	private Integer cid;  //收藏编号
	
	//还需要 房源信息 用户信息
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
