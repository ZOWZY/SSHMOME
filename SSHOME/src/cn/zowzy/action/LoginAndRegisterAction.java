package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.User;
import cn.zowzy.service.UserService;

/**
 * 
*  
* 类名称：LoginAndRegisterAction   
* 类描述：注册和登陆的action   
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午11:12:50     
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
	 * 登陆的action
	 * @return
	 */
	public String login(){
		return SUCCESS;
	}
	
	
	/**
	 * 注册的action
	 * @return
	 */
	public String register(){
		return SUCCESS;
	}
	
	
	/**
	 * 请求registerPage页面
	 * @return
	 */
	public String registerPage(){
		return SUCCESS;
	}
	

}
