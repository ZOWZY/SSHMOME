package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Room;

/**
 * 
 * 
 * 类名称：RoomDao 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午10:33:28
 *
 */
public class RoomDao {

	private HibernateTemplate hibernateTemplate = new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * 
	 * @param room
	 */
	public void addRoom(Room room) {
		if (room != null) {
			hibernateTemplate.save(room);
		}
	}

	/**
	 * 
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(String roomid) {
		String hql = " from  Room where rid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, roomid);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public List<Room> findRoomsByUsername(String username) {
		String hql = " from  Room where usernameid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, username);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param roomStateid
	 */
	public void changeRoomState(String roomid, String roomStateid) {
		if (roomid == null || roomid.length() <= 0) {
			return;
		} else if (roomStateid == null || roomStateid.length() <= 0) {
			return;
		}
		Room room = findRoomByRoomid(roomid);
		if (room == null) {
			return;
		} else {
			room.getRoomstate().setRsid(Integer.valueOf(roomStateid));
			hibernateTemplate.update(room);
		}
	}

	/**
	 * 
	 * @param roomid
	 */
	public void deleteRoom(String roomid) {
		Room room = findRoomByRoomid(roomid);
		if (room == null) {
			return;
		} else {
			hibernateTemplate.delete(room);
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid, float price) {
		if (roomid == null || roomid.length() <= 0) {
			return;
		} else if (price < 0) {
			return;
		}
		Room room = findRoomByRoomid(roomid);
		if (room == null) {
			return;
		} else {
			room.setPrice(price);
			hibernateTemplate.update(room);
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param title
	 */
	public void changeRoomTitle(String roomid, String title) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (title == null) {
			return;
		} else if (title.length() <= 0) {
			return;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setTitle(title);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param score
	 */
	public void changeScore(String roomid, float score) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (score <= 0) {
			return;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setScore(score);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param description
	 */
	public void changeDescription(String roomid, String description) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setDescription(description);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param bed
	 */
	public void changeBad(String roomid, Integer bed) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (bed <= 0) {
			return;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setBed(bed);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param wifi
	 */
	public void changeWifi(String roomid, Boolean wifi) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (wifi == null) {
			wifi = false;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setWifi(wifi);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param tv
	 */
	public void changeTv(String roomid, Integer tv) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (tv < 0) {
			tv = 0;
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setTv(tv);
				hibernateTemplate.update(room);
			}

		}
	}

	/**
	 * 
	 * @param roomid
	 * @param park
	 */
	public void changePark(String roomid, Boolean park) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (park == null) {
			park = false;
		} else {
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setPark(park);
				hibernateTemplate.update(room);
			}
		}
	}

	/**
	 * 
	 * @param roomid
	 * @param lift
	 */
	public void changeLift(String roomid, Boolean lift) {
		if (roomid == null) {
			return;
		} else if (roomid.length() <= 0) {
			return;
		} else if (lift == null) {
			lift = false;
			Room room = findRoomByRoomid(roomid);
			if (room == null) {
				return;
			} else {
				room.setLift(lift);
				hibernateTemplate.update(room);
			}
		}
	}

}
