package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.User;
import cn.zowzy.service.UserService;

/**
 * 
*  
* �����ƣ�LoginAndRegisterAction   
* ��������ע��͵�½��action   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����11:12:50     
*
 */
public class LoginAndRegisterAction extends ActionSupport implements ModelDriven<User> {

	private User user;
	
	private UserService userService=new UserService();
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	/**
	 * ��½��action
	 * @return
	 */
	public String login(){
		return SUCCESS;
	}
	
	
	/**
	 * ע���action
	 * @return
	 */
	public String register(){
		return SUCCESS;
	}
	
	
	/**
	 * ����registerPageҳ��
	 * @return
	 */
	public String registerPage(){
		return SUCCESS;
	}
	

}
