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

	// ----------------------增
	
	/**
	 * 添加订单
	 * @param orders
	 */
	public void addOrders(Orders orders){
		ordersDao.addOrders(orders);
	}

	/**
	 * 预定房间
	 * @param rid
	 * @param personnumber
	 * @param checkintime
	 * @param checkouttime
	 */
	public void bookRoom(Integer rid,Integer personnumber,Timestamp checkintime,Timestamp checkouttime){
		ordersDao.bookRoom(rid,personnumber,checkintime,checkouttime);
	}
	
	// ----------------------查
		
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
	public List<Orders> findOrdersByUsername(String username, Integer roomid) {
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
	 * 根据卖家名查询订单
	 * @param useUsername
	 * @return
	 */
	public List<Orders> findAllOrdersByUse_username(String useUsername) {
		return ordersDao.findAllOrdersByUse_username(useUsername);
	}

	/**
	 * 根据卖家名和房源编号查询订单
	 * @param useUsername
	 * @param roomid
	 * @return
	 */
	public List<Orders> findOrdersByUse_username(String useUsername, Integer roomid) {
		return ordersDao.findOrdersByUse_username(useUsername, roomid);
	}

	/**
	 * 根据卖家名和日期查询订单
	 * @param useUsername
	 * @param datetime
	 * @return
	 */
	public List<Orders> findOrdersByUse_username(String useUsername,Timestamp datetime) {
		return ordersDao.findOrdersByUse_username(useUsername, datetime);
	}
	
	/**
	 * 根据卖家名查询所有的收入
	 * @param useUsername
	 * @return
	 */
	public float queryAllIncomeByUse_username(String useUsername) {
		return ordersDao.queryAllIncomeByUse_username(useUsername);
	}

	/**
	 * 根据卖家名和日期查询收入
	 * @param useUsername
	 * @param datetime
	 * @return
	 */
	public float queryIncomeByUse_username(String useUsername,Timestamp datetime) {
		return ordersDao.queryIncomeByUse_username(useUsername,datetime);
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
	 * 根据订单状态查询订单
	 * @param orderstateid
	 * @return
	 */
	public List<Orders> findOrdersByOrderstate(Integer orderstateid){
		return ordersDao.findOrdersByOrderstate(orderstateid);
	}

	// ----------------------改
	
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
	 * 根据订单编号修改评论
	 * @param orderid
	 * @param comment
	 * @param score
	 */
	public void addComments(String orderid, String comment, float score) {
		ordersDao.addComments(orderid, comment, score);
	}

	/**
	 * 根据订单编号修改订单状态
	 * @param orderid
	 * @param orderstateid
	 */
	public void changeOrderstate(String orderid,Integer orderstateid){
		ordersDao.changeOrderstate(orderid,orderstateid);
	}
}
