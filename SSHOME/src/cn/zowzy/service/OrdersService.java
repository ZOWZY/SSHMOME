package cn.zowzy.service;

import java.sql.Timestamp;
import java.util.List;

import cn.zowzy.dao.OrdersDao;
import cn.zowzy.entity.Orders;

/**
 * 
 * 类名称：OrdersService
 * 类描述：
 * 创建人：yangpiao
 * 创建时间：2017年4月26日 下午11:36:15
 */
public class OrdersService {
	private OrdersDao ordersDao = new OrdersDao();

	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Orders> findAllOrders() {
		return ordersDao.findAllOrders();
	}

	/**
	 * 根据用户名查询订单
	 * @param username
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username) {
		return ordersDao.findOrdersByUsername(username);
	}

	/**
	 * 根据用户名和房源编号查询订单
	 * @param username
	 * @param roomid
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username, String roomid) {
		return ordersDao.findOrdersByUsername(username, roomid);
	}

	/**
	 * 根据用户名查询所有的消费
	 * @param username
	 * @return
	 */
	public float queryAllCostByUsername(String username) {
		return ordersDao.queryAllCostByUsername(username);
	}

	/**
	 * 根据订单编号查询订单
	 * @param orderid
	 * @return
	 */
	public Orders findOrdersByOrderid(String orderid) {
		return ordersDao.findOrdersByOrderid(orderid);
	}

	/**
	 * 根据订单修改退房时间
	 * @param orderid
	 * @param date
	 */
	public void changeCheckoutTime(String orderid, Timestamp date) {
		ordersDao.changeCheckoutTime(orderid, date);
	}

	/**
	 * 根据订单编号修改入住时间
	 * @param orderid
	 * @param date
	 */
	public void changeCheckinTime(String orderid, Timestamp date) {
		ordersDao.changeCheckinTime(orderid, date);
	}

	/**
	 * 根据订单编号添加评论
	 * @param orderid
	 * @param comment
	 * @param score
	 */
	public void addComments(String orderid, String comment, float score) {
		ordersDao.addComments(orderid, comment, score);
	}

}
