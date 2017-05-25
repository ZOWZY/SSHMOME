package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Room;
import cn.zowzy.entity.Roomstate;

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

	
	// ----------------------增
	
	/**
	 * 添加房源信息
	 * 
	 * @param room
	 * 
	 */
	public void addRoom(Room room) {
		if (room != null) {
			hibernateTemplate.save(room);
		}
	}
	
	// ----------------------删

	/**
	 * 删除房源
	 * 
	 * @param roomid
	 *            房源编号
	 */
	public void deleteRoom(String roomid) {
		Room room = findRoomByRoomid(roomid);
		if (room == null) {
			return;
		} else {
			hibernateTemplate.delete(room);
		}
	}
	
	// ----------------------改

	/**
	 * 根据房源编号改变房源状态
	 * 
	 * @param roomid
	 *            房源编号
	 * @param roomStateid
	 *            房源状态编号
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
	 * 根据房源编号修改房源的价格
	 * 
	 * @param roomid
	 *            房源编号
	 * @param price
	 *            价格
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
	 * 根据房源编号修改房源的标题
	 * 
	 * @param roomid
	 *            房源编号
	 * @param title
	 *            房源标题
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
	 * 根据房源编号修改房源的评分
	 * 
	 * @param roomid
	 *            房源编号
	 * @param score
	 *            评分
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
	 * 根据房源的编号修改房源的描述
	 * 
	 * @param roomid
	 *            房源编号
	 * @param description
	 *            描述
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
	 * 根据房源的编号修改房源的床位数
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
	 * 根据房源的编号修改房源是否有WIFI
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
	 * 根据房源的编号修改房源的电视数量
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
	 * 根据房源的编号修改房源是否有停车场
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
	 * 根据房源的编号修改房源是否有电梯
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

	//----------------------查
	
	/**
	 * 根据价格查询房源信息
	 * @return
	 */
	public List<Room> findRoomsOrderByPrice(){
		String hql = " from  Room order by price desc";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}
	
	
	/**
	 * 根据房源编号查询房源信息
	 * 
	 * @param roomid
	 *            房源编号
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
	 * 根据用户名查询房源信息
	 * 
	 * @param username
	 *            用户名
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
	 * 根据房间状态查询房源信息
	 * @param rsid
	 * @return
	 */
	public List<Room> findRoomsByRoomstate(String rsid) {
		String hql = " from  Room where rsid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, rsid);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}
	
	/**
	 * 根据房间类型查询房源信息
	 * @param rtid
	 * @return
	 */
	public List<Room> findRoomsByRoomtype(String rtid) {
		String hql = " from  Room where rtid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, rtid);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}
	//TODO:查询房源信息
	/**
	 * 查询房源信息
	 * @param title
	 * @return
	 */
	public List<Room> findRooms() {
		return null;
		
	}
}
