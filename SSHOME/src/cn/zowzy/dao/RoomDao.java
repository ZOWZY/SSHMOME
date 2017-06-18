package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Orders;
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
	 * 根据房源的编号修改房源是否有WIFI
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
	 * 根据房源的编号修改房源的电视数量
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
	 * 根据房源的编号修改房源是否有停车场
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
	 * 根据房源的编号修改房源是否有电梯
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

	// ----------------------查

	/**
	 * 查询所有房源信息
	 * 
	 * @return
	 */
	public List<Room> findAllRoom() {
		String hql = " from  Room";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据价格区间返回房源信息
	 * 
	 * @param lprice
	 * @param hprice
	 * @return
	 */
	public List<Room> findRoomByPrice(Float lprice, Float hprice) {
		String hql = " from  Room where price between lprice and hprice";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据价格降序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByPriceDesc() {
		String hql = " from  Room order by price desc";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据价格升序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByPriceAsc() {
		String hql = " from  Room order by price asc";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据评分降序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByScoreDesc() {
		String hql = " from  Room order by score desc";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据评分升序返回房源信息
	 * 
	 * @return
	 */
	public List<Room> findRoomsOrderByScoreAsc() {
		String hql = " from  Room order by score asc";
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
	 * 
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
	 * 
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

	/**
	 * 根据目的地查询房源信息
	 * 
	 * @param localtion
	 * @return
	 */
	public List<Room> findRoomsByLocaltion(String localtion) {
		String hql = " from  Room where localtion=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, localtion);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据入住人数查询房源信息
	 * 
	 * @param personnumber
	 * @return
	 */
	public List<Room> findRoomsByPersonnumber(Integer personnumber) {
		String hql = " from  Room where maxpersonnumber>=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, personnumber);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 根据入住时期和退房时期查询房源信息
	 * 
	 * @param checkintime
	 * @param checkouttime
	 * @return
	 */
	public List<Room> findRoomsByTime(String checkintime, String checkouttime) {
		String hql = " from Orders where checkintime between ? and ? or checkouttime between ? and ?";
		List<Orders> l = (List<Orders>) hibernateTemplate.find(hql, checkintime, checkouttime, checkintime,
				checkouttime);
		List<Room> listA = new ArrayList<Room>();
		for (Orders a : l) {
			listA.add(a.getRoom());
		}
		hql = " from Room";
		List<Room> listB = (List<Room>) hibernateTemplate.find(hql);
		List<Room> list = findCommon(listA, listB);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	/**
	 * TODO:取两个集合的交集
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public List<Room> findCommon(List<Room> A, List<Room> B) {
		if (A != null) {
			if (B == null) {
				return A;
			} else {
				A.retainAll(B);
				if (A != null) {
					return A;
				} else {
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * 简单查询房源信息
	 * @param localtion
	 * @param personnumber
	 * @param checkintime
	 * @param checkouttime
	 * @param rtid
	 * @param title
	 * @return
	 */
	public List<Room> EasyfindRooms(String localtion, Integer personnumber, String checkintime, String checkouttime,
			String rtid, String title) {
		String hql = " from  Room where localtion=? and rtid=? and maxpersonnumber>=? and title like ?";
		List<Room> listA = (List<Room>) hibernateTemplate.find(hql, localtion, rtid, personnumber, title);
		List<Room> listB = findRoomsByTime(checkintime, checkouttime);
		List<Room> listC = findCommon(listA, listB);
		if (listC != null) {
			return listC;
		} else {
			return null;
		}
	}

	/**
	 * 复杂查询房源信息
	 * @param localtion
	 * @param personnumber
	 * @param checkintime
	 * @param checkouttime
	 * @param rtid
	 * @param title
	 * @param bedroom
	 * @param bed
	 * @param bathroom
	 * @param kitchen    选中为1，没选为0,下同
	 * @param wifi
	 * @param tv
	 * @param park
	 * @param lift
	 * @param rule
	 * @return
	 */
	public List<Room> ComplexfindRooms(String localtion, Integer personnumber, String checkintime, String checkouttime,
			String rtid, String title, int bedroom, int bed, int bathroom, int kitchen, int wifi, int tv, int park,
			int lift, String rule) {
		String hql = " from  Room where localtion=? and rtid=? and maxpersonnumber>=? and title like ? and bedroom=? and bed=? and bathroom=? and kitchen>=? and wifi>=? and tv>=? and rule=?";
		List<Room> listA = (List<Room>) hibernateTemplate.find(hql, localtion, rtid, personnumber, title,bedroom,bed,bathroom,kitchen,wifi,tv,park,lift,rule);
		List<Room> listB = findRoomsByTime(checkintime, checkouttime);
		List<Room> listC = findCommon(listA, listB);
		if (listC != null) {
			return listC;
		} else {
			return null;
		}
	}
}
