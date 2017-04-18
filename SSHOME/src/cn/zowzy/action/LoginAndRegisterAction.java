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
		System.out.println("有用户请求登陆");
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		String result = "failed";
		Users users = userService.findUserByUsername(user.getUsername());
		if (users != null) {
			if (users.getPassword().equals(user.getPassword())) {
				result = SUCCESS;
			}
		}
		return result;
	}

	/**
	 * 注册行为
	 * 
	 * @return
	 */
	public String register() {
		System.out.println("有注册请求");
		String result = "failed";
		if (userService.findUserByUsername(user.getUsername()) != null) {
			addFieldError("username", "用户名已经存在");
		} else {
			userService.addUser(user);
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * 注册界面
	 * 
	 * @return
	 */
	public String registerPage() {
		return SUCCESS;
	}

	public String loginPage() {
		return SUCCESS;
	}

}
