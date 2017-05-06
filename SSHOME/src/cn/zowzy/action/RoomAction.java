package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.Room;

/**
 * 
*  
* 类名称：RoomsAction   
* 类描述：房源信息的Action类   
* 创建人：ZJH   
* 创建时间：2017年4月26日 下午6:53:31     
*
 */
public class RoomAction extends ActionSupport implements ModelDriven<Room> {

	private Room room = new Room();

	@Override
	public Room getModel() {
		return room;
	}

}
