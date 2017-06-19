package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.zowzy.entity.Room;
import cn.zowzy.entity.Users;
import cn.zowzy.service.RoomService;
import cn.zowzy.service.UsersService;

public class UsersCenterAction extends ActionSupport {
	
	private String username;
	private UsersService userService;
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UsersService getUserService() {
		return userService;
	}

	public void setUserService(UsersService userService) {
		this.userService = userService;
	}

	
	
	
	public String userInfo(){
		
		return SUCCESS;
	}
	
	public String userMyHome(){
		return SUCCESS;
	}
	
	
	
	
	

}
