package cn.zowzy.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.zowzy.service.UsersService;

/**
 * 
 * 
 * 类名称：ChangePasswordAction 类描述： 修改登陆密码或者支付密码 创建人：ZJH 创建时间：2017年4月18日 上午10:08:43
 *
 */
public class ChangePasswordAction extends ActionSupport {
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	/**
	 * 根据changePasswordCode修改登陆密码
	 * 
	 * @return
	 */
	public String changePassword() {
		String result = "failed";
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getAttribute("changePasswordCode") == null) {
			return result;
		}
		// TODO 根据changePasswordCode查找用户 修改登陆密码
		return result;
	}

	/**
	 * 根据changePayPasswordCode修改支付密码
	 * 
	 * @return
	 */
	public String changePayPassword() {
		String result = "failed";
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getAttribute("changePayPasswordCode") == null) {
			return result;
		}
		// TODO 根据changePayPasswordCode查找用户 修改支付密码
		return result;
	}

}
