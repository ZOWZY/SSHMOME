package cn.zowzy.service;



import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.RoomDao;
import cn.zowzy.entity.Room;

/**
 * 
 * ���ߣ�yp
 * ������RoomService
 * �����������÷�Դ�����ݿ������
 * ʱ�䣺 2017��3��31�� ����3:06:55
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
	 * ��ӷ�Դ��Ϣ
	 * @param room  ��Դ��Ϣ����
	 */
	public void addRoom(Room room){
		roomDao.addRoom(room);
	}
	
	/**
	 * ����roomid��ѯ��Դ��Ϣ
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
	 * �����û�����ѯ���û������еķ�Դ
	 * @param username �û���
	 * @return  room��list
	 */
	public List<Room> findRoomsByUsername(String username){
		if(username==null||username.length()<=0)
			return null;
		else
			return roomDao.findRoomsByUsername(username);
	}
	
	/**
	 * ����roomidɾ����Դ
	 * @param roomid
	 */
	public void deleteRoom(String roomid){
		if(roomid==null||roomid.length()<=0)
			return;
		else
		    roomDao.deleteRoom(roomid);
	}
	
	/**
	 * ���ݷ�Դ����޸ķ�Դ�ļ۸�
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid,float price){
	    roomDao.changeRoomPrice(roomid, price);
	}
	
}
