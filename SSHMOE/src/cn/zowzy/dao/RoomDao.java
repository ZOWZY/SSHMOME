package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Room;

/**
 * 
*  
* 类名称：RoomDao   
* 类描述：房源的数据库操作类   
* 创建人：ZJH   
* 创建时间：2017年3月31日 上午9:05:55     
*
 */
public class RoomDao {

	private HibernateTemplate hibernateTemplate=new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	/**
	 * 添加房源信息
	 * @param room  房源信息对象
	 */
	public void addRoom(Room room){
		if(room!=null){
			hibernateTemplate.save(room);
		}
	}
	
	
	/**
	 * 根据roomid查询房源信息
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(String roomid){
		String hql=" from  Room where rid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, roomid);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;			
		}
	}
	
	
	/**
	 * 根据用户名查询该用户的所有的房源
	 * @param username 用户名
	 * @return  room的list
	 */
	public List<Room> findRoomsByUsername(String username){
		String hql=" from  Room where usernameid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, username);
		if(list!=null){
			return list;
		}else{
			return null;			
		}
	}
	
	
	/**
	 * 根据房源编号和新的房源状态编号修改房源状态信息
	 * @param roomid  房源编号
	 * @param roomStateid  房源状态编号  
	 */
	public void changeRoomState(String roomid,String roomStateid){
		if(roomid==null||roomid.length()<=0){
			return;
		}else if(roomStateid==null||roomStateid.length()<=0){
			return ;
		}
		Room room =findRoomByRoomid(roomid);
		if(room==null){
			return ;
		}else{
			room.getRoomState().setRsid(Integer.valueOf(roomStateid));
			hibernateTemplate.update(room);
		}
	}
	
	/**
	 * 根据roomid删除房源
	 * @param roomid
	 */
	public void deleteRoom(String roomid){
		Room room=findRoomByRoomid(roomid);
		if(room==null){
			return;
		}else{
			hibernateTemplate.delete(room);
		}
	}
	
	
	/**
	 * 根据房源编号修改房源的价格
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid,float price){
		if(roomid==null||roomid.length()<=0){
			return;
		}else if(price<0){
			return;
		}
		Room room=findRoomByRoomid(roomid);
		if(room==null){
			return;
		}else {
			room.setPrice(price);
			hibernateTemplate.update(room);
		}
	}
	
	
}
