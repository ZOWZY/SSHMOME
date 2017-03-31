package cn.zowzy.service;



import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.RoomDao;
import cn.zowzy.entity.Room;

/**
 * 
 * 作者：yp
 * 类名：RoomService
 * 类描述：引用房源的数据库操作类
 * 时间： 2017年3月31日 下午3:06:55
 *
 */
@Transactional
public class RoomService {
	private RoomDao roomDao=new RoomDao();

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}
    
	/**
	 * 添加房源信息
	 * @param room  房源信息对象
	 */
	public void addRoom(Room room){
		roomDao.addRoom(room);
	}
	
	/**
	 * 根据roomid查询房源信息
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(String roomid){
		if(roomid==null||roomid.length()<=0)
			return null;
		else
			return roomDao.findRoomByRoomid(roomid);
	}
	
	/**
	 * 根据用户名查询该用户的所有的房源
	 * @param username 用户名
	 * @return  room的list
	 */
	public List<Room> findRoomsByUsername(String username){
		if(username==null||username.length()<=0)
			return null;
		else
			return roomDao.findRoomsByUsername(username);
	}
	
	/**
	 * 根据roomid删除房源
	 * @param roomid
	 */
	public void deleteRoom(String roomid){
		if(roomid==null||roomid.length()<=0)
			return;
		else
		    roomDao.deleteRoom(roomid);
	}
	
	/**
	 * 根据房源编号修改房源的价格
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid,float price){
	    roomDao.changeRoomPrice(roomid, price);
	}
	
}
