package cn.zowzy.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Orders;

/**
 * 
 * 
 * 类名称：OrdersDao 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午10:27:54
 *
 */
public class OrdersDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * 查询所有订单
	 * 
	 * @return
	 */
	public List<Orders> findAllOrders() {
		String hql = " from Orders";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql);
		return list;
	}

	/**
	 * 根据用户名查询订单
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = " from Orders where username=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, username);
		return list;
	}

	/**
	 * 根据用户名和房源编号查询订单
	 * 
	 * @param username
	 *            用户名
	 * @param roomid
	 *            房源编号
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username, String roomid) {
		if (username == null || username.length() <= 0) {
			return null;
		} else if (roomid == null || roomid.length() <= 0) {
			return null;
		}

		String hql = " from Orders where username=? and rid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, username, roomid);
		return list;
	}

	/**
	 * 根据用户名查询所有的消费
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public float queryAllCostByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return 0;
		}
		List<Orders> list = findOrdersByUsername(username);
		float allCost = 0;
		for (Orders orders : list) {
			// 2代表已经完成的订单
			if (orders.getOrderstate().getOsid() == 2) {
				allCost += orders.getCost();
			}
		}
		return allCost;
	}

	/**
	 * 根据卖家名查询订单
	 * @param useUsername
	 * @return
	 */
	public List<Orders> findOrdersByUse_username(String useUsername){
		if (useUsername == null || useUsername.length() <= 0) {
			return null;
		}
		String hql = " from Orders where Use_username=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, useUsername);
		return list;
	}
	
	/**
	 * 根据卖家名和房源编号查询订单
	 * @param useUsername
	 * @param roomid
	 * @return
	 */
	public List<Orders> findOrdersByUse_username(String useUsername, String roomid) {
		if (useUsername == null || useUsername.length() <= 0) {
			return null;
		} else if (roomid == null || roomid.length() <= 0) {
			return null;
		}

		String hql = " from Orders where Use_username=? and rid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, useUsername, roomid);
		return list;
	}
	
	/**
	 * 根据卖家名查询所有的收入
	 * @param useUsername
	 * @return
	 */
	public float queryAllCostByUse_username(String useUsername) {
		if (useUsername == null || useUsername.length() <= 0) {
			return 0;
		}
		List<Orders> list = findOrdersByUse_username(useUsername);
		float allCost = 0;
		for (Orders orders : list) {
			// 2代表已经完成的订单
			if (orders.getOrderstate().getOsid() == 2) {
				allCost += orders.getCost();
			}
		}
		return allCost;
	}
	
	/**
	 * 根据订单编号查询订单
	 * 
	 * @param orderid
	 *            订单编号
	 * @return
	 */
	public Orders findOrdersByOrderid(String orderid) {
		if (orderid == null || orderid.length() <= 0) {
			return null;
		}
		String hql = " from Orders where oid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, orderid);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	
	/**
	 * 根据订单修改退房时间
	 * 
	 * @param orderid
	 *            订单编号
	 * @param date
	 *            时间
	 */
	public void changeCheckoutTime(String orderid, Timestamp date) {
		if (orderid == null || orderid.length() <= 0) {
			return;
		}
		if (date == null) {
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if (order == null) {
			return;
		} else {
			order.setCheckouttime(date);
			hibernateTemplate.update(order);
		}
	}

	/**
	 * 根据订单编号修改入住时间
	 * 
	 * @param orderid
	 *            订单编号
	 * @param date
	 *            时间
	 */
	public void changeCheckinTime(String orderid, Timestamp date) {
		if (orderid == null || orderid.length() <= 0) {
			return;
		}
		if (date == null) {
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if (order == null) {
			return;
		} else {
			order.setCheckintime(date);
			hibernateTemplate.update(order);
		}
	}

	/**
	 * 根据订单编号添加评论
	 * 
	 * @param orderid
	 *            订单编号
	 * @param comment
	 *            评论
	 * @param score
	 *            评分
	 */
	public void addComments(String orderid, String comment, float score) {
		if (orderid == null || orderid.length() <= 0) {
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if (order == null) {
			return;
		} else {
			if (score < 0) {
				score = 5;
			}
			order.setComments(comment);
			order.setCommentsscore(score);
			hibernateTemplate.update(order);
		}
	}

}
