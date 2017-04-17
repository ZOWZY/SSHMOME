package cn.zowzy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zowzy.entity.Users;
import cn.zowzy.service.UsersService;

/**
 *
 * 
 * 类名称：LoginAndRegisterAction 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午3:04:01
 *
 */
public class LoginAndRegisterAction extends ActionSupport implements ModelDriven<Users> {

	private Users user;

	private UsersService userService = new UsersService();

	public UsersService getUserService() {
		return userService;
	}

	public void setUserService(UsersService userService) {
		this.userService = userService;
	}

	@Override
	public Users getModel() {
		return user;
	}

	/**
	 * 登陆行为
	 * 
	 * @return
	 */
	public String login() {
		return SUCCESS;
	}

	/**
	 * 注册行为
	 * 
	 * @return
	 */
	public String register() {
		return SUCCESS;
	}

	/**
	 * 注册界面
	 * 
	 * @return
	 */
	public String registerPage() {
		return SUCCESS;
	}

}
