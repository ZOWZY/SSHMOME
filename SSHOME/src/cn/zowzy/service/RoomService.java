package cn.zowzy.service;

import java.sql.Timestamp;
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

	// ----------------------增

	/**
	 * 添加房源信息
	 * 
	 * @param room
	 */
	public String addRoom(Room room) {
		roomDao.addRoom(room);
		return "OK";
	}

	// ----------------------删

	/**
	 * 删除房源
	 * 
	 * @param roomid
	 */
	public String deleteRoom(Integer roomid) {
		if (roomid < 0)
			return null;
		else{
			roomDao.deleteRoom(roomid);
			return "OK";
		}
	}

	// ----------------------改

	/**
	 * 根据房源编号改变房源状态
	 * 
	 * @param roomid
	 * @param roomStateid
	 */
	public void changeRoomState(Integer roomid, Integer roomStateid) {
		roomDao.changeRoomState(roomid, roomStateid);
	}

	/**
	 * 根据房源编号修改房源的价格
	 * 
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(Integer roomid, float price) {
		roomDao.changeRoomPrice(roomid, price);
	}

	/**
	 * 根据房源编号修改房源的标题
	 * 
	 * @param roomid
	 * @param title
	 */
	public void changeRoomTitle(Integer roomid, String title) {
		roomDao.changeRoomTitle(roomid, title);
	}

	/**
	 * 根据房源编号修改房源的评分
	 * 
	 * @param roomid
	 * @param score
	 */
	public void changeScore(Integer roomid, float score) {
		roomDao.changeScore(roomid, score);
	}

	/**
	 * 根据房源的编号修改房源的描述
	 * 
	 * @param roomid
	 * @param description
	 */
	public void changeDescription(Integer roomid, String description) {
		roomDao.changeDescription(roomid, description);
	}

	/**
	 * 根据房源的编号修改房源的床位数
	 * 
	 * @param roomid
	 * @param bed
	 */
	public void changeBad(Integer roomid, Integer bed) {
		roomDao.changeBad(roomid, bed);
	}

	/**
	 * 根据房源的编号修改房源是否有WIFI
	 * 
	 * @param roomid
	 * @param wifi
	 */
	public void changeWifi(Integer roomid, Boolean wifi) {
		roomDao.changeWifi(roomid, wifi);
	}

	/**
	 * 根据房源的编号修改房源的电视数量
	 * 
	 * @param roomid
	 * @param tv
	 */
	public void changeTv(Integer roomid, Integer tv) {
		roomDao.changeTv(roomid, tv);
	}

	/**
	 * 根据房源的编号修改房源是否有停车场
	 * 
	 * @param roomid
	 * @param park
	 */
	public void changePark(Integer roomid, Boolean park) {
		roomDao.changePark(roomid, park);
	}

	/**
	 * 根据房源的编号修改房源是否有电梯
	 * 
	 * @param roomid
	 * @param lift
	 */
	public void changeLift(Integer roomid, Boolean lift) {
		roomDao.changeLift(roomid, lift);
	}

	// ----------------------查

	/**
	 * 查询所有房源信息
	 * 
	 * @return
	 */
	public List<Room> findAllRoom() {
		return roomDao.findAllRoom();
	}

	/**
	 * 根据价格区间返回房源信息
	 * 
	 * @param lprice
	 * @param hprice
	 * @return
	 */
	public List<Room> findRoomByPrice(Float lprice, Float hprice) {
		return roomDao.findRoomByPrice(lprice, hprice);
	}

	/**
	 * 根据价格降序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByPriceDesc() {
		return roomDao.findRoomsOrderByPriceDesc();
	}

	/**
	 * 根据价格升序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByPriceAsc() {
		return roomDao.findRoomsOrderByPriceAsc();
	}

	/**
	 * 根据评分降序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByScoreDesc() {
		return roomDao.findRoomsOrderByScoreDesc();
	}

	/**
	 * 根据评分升序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByScoreAsc() {
		return roomDao.findRoomsOrderByScoreAsc();
	}

	/**
	 * 根据房源编号查询房源信息
	 * 
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(Integer roomid) {
		if (roomid < 0)
			return null;
		else
			return roomDao.findRoomByRoomid(roomid);
	}

	/**
	 * 根据用户名查询房源信息
	 * 
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
	 * 根据房间状态查询房源信息
	 * 
	 * @param rsid
	 * @return
	 */
	public List<Room> findRoomsByRoomstate(Integer rsid) {
		if (rsid < 0)
			return null;
		else
			return roomDao.findRoomsByRoomstate(rsid);
	}

	/**
	 * 根据房间类型查询房源信息
	 * 
	 * @param rtid
	 * @return
	 */
	public List<Room> findRoomsByRoomtype(Integer rtid) {
		if (rtid < 0)
			return null;
		else
			return roomDao.findRoomsByRoomtype(rtid);
	}

	/**
	 * 根据目的地查询房源信息
	 * 
	 * @param localtion
	 * @return
	 */
	public List<Room> findRoomsByLocaltion(String localtion) {
		if (localtion == null || localtion.length() <= 0)
			return null;
		else
			return roomDao.findRoomsByLocaltion(localtion);
	}

	/**
	 * 根据入住人数查询房源信息
	 * 
	 * @param personnumber
	 * @return
	 */
	public List<Room> findRoomsByPersonnumber(Integer personnumber) {
		if (personnumber <= 0)
			return null;
		else
			return roomDao.findRoomsByPersonnumber(personnumber);
	}

	/**
	 * 根据时间查询房源信息
	 * 
	 * @param checkintime
	 * @param checkouttime
	 * @return
	 */
	public List<Room> findRoomsByTime(Timestamp checkintime, Timestamp checkouttime) {
		if (checkintime == null)
			return null;
		if (checkouttime == null)
			return null;
		else
			return roomDao.findRoomsByTime(checkintime, checkouttime);

	}

	/**
	 * 取两个集合的交集
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public List<Room> findCommon(List<Room> A, List<Room> B) {
		return roomDao.findCommon(A, B);
	}

	/**
	 * 简单查询房源信息
	 * 
	 * @param localtion
	 * @param personnumber
	 * @param checkintime
	 * @param checkouttime
	 * @param rtid
	 * @param title
	 * @return
	 */
	public List<Room> EasyfindRooms(String localtion, Integer personnumber, Timestamp checkintime,
			Timestamp checkouttime, Integer rtid, String title) {
		if (localtion == null || localtion.length() <= 0)
			return null;
		if (personnumber <= 0)
			return null;
		if (checkintime == null)
			return null;
		if (checkouttime == null)
			return null;
		if (rtid < 0)
			return null;
		if (title == null || title.length() <= 0)
			return null;
		else
			return roomDao.EasyfindRooms(localtion, personnumber, checkintime, checkouttime, rtid, title);
	}

	/**
	 * 复杂查询房源信息
	 * 
	 * @param localtion
	 * @param personnumber
	 * @param checkintime
	 * @param checkouttime
	 * @param rtid
	 * @param title
	 * @param bedroom
	 * @param bed
	 * @param bathroom
	 * @param kitchen
	 * @param wifi
	 * @param tv
	 * @param park
	 * @param lift
	 * @param rule
	 * @return
	 */
	public List<Room> ComplexfindRooms(String localtion, Integer personnumber, Timestamp checkintime,
			Timestamp checkouttime, Integer rtid, String title, Integer bedroom, Integer bed, Integer bathroom,
			Boolean kitchen, Boolean wifi, Boolean tv, Boolean park, Boolean lift, String rule) {
		if (localtion == null || localtion.length() <= 0)
			return null;
		if (personnumber <= 0)
			return null;
		if (checkintime == null )
			return null;
		if (checkouttime == null )
			return null;
		if (rtid < 0)
			return null;
		if (title == null || title.length() <= 0)
			return null;
		if (bedroom < 0)
			return null;
		if (bed < 0)
			return null;
		if (bathroom < 0)
			return null;
		if (kitchen != null)
			return null;
		if (wifi != null)
			return null;
		if (tv != null)
			return null;
		if (rule == null || rule.length() <= 0)
			return null;
		else
			return roomDao.ComplexfindRooms(localtion, personnumber, checkintime, checkouttime, rtid, title, bedroom,
					bed, bathroom, kitchen, wifi, tv, park, lift, rule);

	}
}
