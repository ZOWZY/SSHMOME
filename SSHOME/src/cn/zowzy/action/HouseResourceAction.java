package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.Room;
import cn.zowzy.service.RoomService;

public class HouseResourceAction extends ActionSupport  implements ModelDriven<Room>{

private RoomService roomService;
	

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	private Room room = new Room();

	@Override
	public Room getModel() {
		
		return room;
	}
	
	public String BasicActio(){
		String result=SUCCESS;
		return result;
	}

	public String HouseMainActio(){
		String result=SUCCESS;
		return result;
	}
	public String House1Actio(){
		String result=SUCCESS;
		return result;
	}
	public String House2Actio(){
		String result=SUCCESS;
		return result;
	}
	
}
