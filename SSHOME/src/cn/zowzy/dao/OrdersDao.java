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
	 * ��ѯ���ж���
	 * 
	 * @return
	 */
	public List<Orders> findAllOrders() {
		String hql = " from Orders";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql);
		return list;
	}

	/**
	 * ���Ҹ��û����������ж���
	 * 
	 * @param username
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = " from Orders where usernameid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, username);
		return list;
	}

	/**
	 * ��ѯ�û�����ĳ����Դ�Ĵ�����ȫ������
	 * 
	 * @param username
	 * @param roomid
	 * @return
	 */
	public List<Orders> findOrdersByUsername(String username, String roomid) {
		if (username == null || username.length() <= 0) {
			return null;
		} else if (roomid == null || roomid.length() <= 0) {
			return null;
		}

		String hql = " from Orders where usernameid=? and roomid=?";
		List<Orders> list = (List<Orders>) hibernateTemplate.find(hql, username, roomid);
		return list;
	}

	/**
	 * ��ѯ�û��ܵ�֧��
	 * 
	 * @param username
	 * @return
	 */
	public float queryAllCostByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return 0;
		}
		List<Orders> list = findAllOrders();
		float allCost = 0;
		for (Orders orders : list) {
			// 2�����Ѿ����֧���Ķ���
			if (orders.getOrderstate().getOsid() == 2) {
				allCost += orders.getCost();
			}
		}
		return allCost;
	}

	/**
	 * ���ݶ�����Ų�ѯ����
	 * 
	 * @param orderid
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
	 * ���ݶ���״̬�޸Ķ������˷�ʱ��
	 * 
	 * @param orderid
	 * @param date
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
	 * ���ݶ�������޸���סʱ��
	 * 
	 * @param orderid
	 * @param date
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
	 * 
	 * @param orderid
	 * @param comment
	 * @param score
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
