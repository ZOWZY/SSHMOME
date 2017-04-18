package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.Orders;

public class OrdersAction extends ActionSupport implements ModelDriven<Orders> {
	private Orders orders = new Orders();

	@Override
	public Orders getModel() {
		return orders;
	}

	// TODO 添加订单
	public String addOrders() {
		String result = "failed";
		return result;
	}

	// TODO 取消订单
	public String cancleOrders() {
		String result = "failed";
		return result;
	}

	// TODO 修改订单入住时间
	public String updateCheckInTime() {
		String result = "failed";
		return result;
	}

	// TODO 修改订单退房时间
	public String updateCheckOutTime() {
		String result = "failed";
		return result;
	}

	// TODO 完成订单 也就是修改订单状态
	public String changeOrdersState() {
		String result = "failed";
		return result;
	}

	// TODO 查询全部订单
	public String queryAllOrders() {
		String result = "failed";
		return result;
	}

	// TODO 根据用户名查询订单
	public String findOrdersByUsername() {
		String result = "failed";
		return result;
	}

	// TODO 根据订单号查询订单信息
	public String findOrdersByOrdersId() {
		String result = "failed";
		return result;
	}

	// TODO 根据房源编号查询订单
	public String findOrdersByRoomid() {
		String result = "failed";
		return result;
	}

	// TODO 根据用户名和房源编号查询订单
	public String findOrdersByRoomidAndUsername() {
		String result = "failed";
		return result;
	}
}
