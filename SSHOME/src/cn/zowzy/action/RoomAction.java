package cn.zowzy.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.Room;
import cn.zowzy.service.RoomService;

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
	
	public String searchRoom(){
		System.out.println("请求跳转查找房源页面");
		return SUCCESS;
	}
	
	public String searchAction(){
		System.out.println("请求跳转查找房源子页面");
		return SUCCESS;
	}
	
	public String stars(){
		return SUCCESS;
	}
	
	public String sourceAction(){
		return SUCCESS;
	}
	
	public String roomDetail(){
		return SUCCESS;
	}

	/**
	 * 增加房源行为
	 * @return
	 */
	public String addRoomAction(){
		String result=SUCCESS;
		if(roomService.addRoom(room)==null){
			addFieldError("addroomerror", "添加房源失败");
			return "failed";
		}
		return result;
	}
	
	/**
	 * 删除房源行为
	 * @return
	 */
	public String deleteRoomAction(){
		String result=SUCCESS;
		if(roomService.deleteRoom(room.getRid())==null){
			addFieldError("deleteroomerror", "添加房源失败");
			return "failed";
		}
		return result;
	}
	
	/**
	 * 查找房源行为
	 * @return
	 */
	public String findRoomsByUsernameAction(){
		String result=SUCCESS;
		Object username=ServletActionContext.getRequest().getAttribute("username");
		if(username==null){
			return "failed";
		}
		List<Room> list = roomService.findRoomsByUsername(String.valueOf(username));
		if(list==null){
			return "failed";
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("roomList", list);
		}
		return result;
	}

}
