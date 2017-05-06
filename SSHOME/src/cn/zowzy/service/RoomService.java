package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.RoomDao;
import cn.zowzy.entity.Room;

/**
 * 
 * 
 * 类名称：RoomService 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午11:46:44
 *
 */
@Transactional
public class RoomService {
	private RoomDao roomDao = new RoomDao();

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	/**
	 * 添加房源信息
	 * @param room
	 */
	public void addRoom(Room room) {
		roomDao.addRoom(room);
	}

	/**
	 * 根据房源编号查询房源信息
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(String roomid) {
		if (roomid == null || roomid.length() <= 0)
			return null;
		else
			return roomDao.findRoomByRoomid(roomid);
	}

	/**
	 * 根据用户名查询房源信息
	 * @param username
	 * @return
	 */
	public List<Room> findRoomsByUsername(String username) {
		if (username == null || username.length() <= 0)
			return null;
		else
			return roomDao.findRoomsByUsername(username);
	}

	/**
	 * 根据房源编号改变房源状态
	 * @param roomid
	 * @param roomStateid
	 */
	public void changeRoomState(String roomid, String roomStateid) {
		roomDao.changeRoomState(roomid,roomStateid);
	}
	
	/**
	 * 删除房源
	 * @param roomid
	 */
	public void deleteRoom(String roomid) {
		if (roomid == null || roomid.length() <= 0)
			return;
		else
			roomDao.deleteRoom(roomid);
	}

	/**
	 * 根据房源编号修改房源的价格
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid, float price) {
		roomDao.changeRoomPrice(roomid, price);
	}

	/**
	 * 根据房源编号修改房源的标题
	 * @param roomid
	 * @param title
	 */
	public void changeRoomTitle(String roomid, String title) {
		roomDao.changeRoomTitle(roomid,title);
	}
	
	/**
	 * 根据房源编号修改房源的评分
	 * @param roomid
	 * @param score
	 */
	public void changeScore(String roomid, float score) {
		roomDao.changeScore(roomid,score);
	}

	/**
	 * 根据房源的编号修改房源的描述
	 * @param roomid
	 * @param description
	 */
	public void changeDescription(String roomid, String description) {
		roomDao.changeDescription(roomid,description);
	}
	
	/**
	 * 根据房源的编号修改房源的床位数
	 * @param roomid
	 * @param bed
	 */
	public void changeBad(String roomid, Integer bed) {
		roomDao.changeBad(roomid,bed);
	}
	
	/**
	 * 根据房源的编号修改房源是否有WIFI
	 * @param roomid
	 * @param wifi
	 */
	public void changeWifi(String roomid, Boolean wifi) {
		roomDao.changeWifi(roomid,wifi);
	}
	
	/**
	 * 根据房源的编号修改房源的电视数量
	 * @param roomid
	 * @param tv
	 */
	public void changeTv(String roomid, Integer tv) {
		roomDao.changeTv(roomid,tv);
	}
	
	/**
	 * 根据房源的编号修改房源是否有停车场
	 * @param roomid
	 * @param park
	 */
	public void changePark(String roomid, Boolean park) {
		roomDao.changePark(roomid,park);
	}
	
	/**
	 * 根据房源的编号修改房源是否有电梯
	 * @param roomid
	 * @param lift
	 */
	public void changeLift(String roomid, Boolean lift) {
		roomDao.changeLift(roomid,lift);
	}
}
