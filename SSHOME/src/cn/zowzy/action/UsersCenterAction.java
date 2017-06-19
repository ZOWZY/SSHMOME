package cn.zowzy.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.zowzy.entity.Room;
import cn.zowzy.entity.Users;
import cn.zowzy.service.RoomService;
import cn.zowzy.service.UsersService;

public class UsersCenterAction extends ActionSupport {
	
	private UsersService userService;
	
	public UsersService getUsersService() {
		return userService;
	}

	public void setUsersService(UsersService userService) {
		this.userService = userService;
	}
	
	private Users users = new Users();
	
	private String Username(){
		String result = SUCCESS;
		Object username=ServletActionContext.getRequest().getAttribute("username");
		if(username==null){
			return "failed";
		}
		Users users=userService.findUserByUsername(String.valueOf(username));
		if(users==null){
			return "failed";
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("users", users);
		}
		return result;
		
	}
	

}
