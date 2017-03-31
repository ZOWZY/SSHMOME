package cn.zowzy.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Orders;

/**
 * 
*  
* 类名称：OrdersDao   
* 类描述：订单操作数据库类   
* 创建人：ZJH   
* 创建时间：2017年3月31日 下午3:46:22     
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
	 * @return
	 */
	public List<Orders> findAllOrders(){
		String hql=" from Orders";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql);
		return list;
	}
	
	/**
	 * 查找该用户创建的所有订单
	 * @param username
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username){
		if(username==null||username.length()<=0){
			return null;
		}
		String hql=" from Orders where usernameid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql,username);
		return list;
	}
	
	/**
	 * 查询用户关于某个房源的创建的全部订单
	 * @param username
	 * @param roomid
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username,String roomid){
		if(username==null||username.length()<=0){
			return null;
		}else if(roomid==null||roomid.length()<=0){
			return null;
		}
		
		String hql=" from Orders where usernameid=? and roomid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql,username,roomid);
		return list;
	}
	
	/**
	 * 查询用户总的支出
	 * @param username
	 * @return
	 */
	public float queryAllCostByUsername(String username){
		if(username==null||username.length()<=0){
			return 0;
		}
		List<Orders> list = findAllOrders();
		float allCost=0;
		for (Orders orders : list) {
			//2代表已经完成支付的订单
			if(orders.getOrderState().getOsid()==2){
				allCost+=orders.getCost();
			}
		}
		return allCost;
	}
	
	/**
	 * 根据订单编号查询订单
	 * @param orderid
	 * @return
	 */
	public Orders findOrdersByOrderid(String orderid){
		if(orderid==null||orderid.length()<=0){
			return  null;
		}
		String hql=" from Orders where oid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, orderid);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	
	/**
	 * 根据订单状态修改订单的退房时间
	 * @param orderid
	 * @param date
	 */
	public void changeCheckoutTime(String orderid,Date date){
		if(orderid==null||orderid.length()<=0){
			return;
		}
		if(date==null){
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if(order==null){
			return;
		}else{
			order.setCheckoutTime(date);
			hibernateTemplate.update(order);
		}
	}
	
	
	/**
	 * 根据订单编号修改入住时间
	 * @param orderid
	 * @param date
	 */
	public void changeCheckinTime(String orderid,Date date){
		if(orderid==null||orderid.length()<=0){
			return;
		}
		if(date==null){
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if(order==null){
			return;
		}else{
			order.setCheckinTime(date);
			hibernateTemplate.update(order);
		}
	}
	
	/**
	 * 根据订单状态修改订单的评论
	 * @param orderid  订单编号
	 * @param comment  订单评论
	 * @param score  房源评分
	 */
	public void addComments(String orderid,String comment,float score){
		if(orderid==null||orderid.length()<=0){
			return;
		}
		Orders order = findOrdersByOrderid(orderid);
		if(order==null){
			return;
		}else{
			if(score<0){
				score=5;
			}
			order.setComments(comment);
			order.setScore(score);
			hibernateTemplate.update(order);
		}
	}
	
}
