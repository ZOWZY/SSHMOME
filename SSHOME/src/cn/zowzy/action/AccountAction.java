package cn.zowzy.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.zowzy.service.UsersService;

/**
 * 
*  
* 类名称：AccountAction   
* 类描述：用户账户管理的Action   
* 创建人：ZJH   
* 创建时间：2017年5月7日 上午9:43:37     
*
 */
public class AccountAction extends ActionSupport {

	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	/**
	 * 充值
	 * @return
	 */
	public String rechargeAction() {
		String result = SUCCESS;
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getAttribute("admin") == null) {
			System.out.println("充值失败：管理员姓名不合法");
			result = "failed";
		} else if (request.getAttribute("username") == null) {
			System.out.println("充值失败：充值用户名不合法");
			result = "failed";
		} else if (request.getAttribute("number") == null) {
			System.out.println("充值失败：充值数目不合法");
			result = "failed";
		} else {
			String admin = (String) request.getAttribute("admin");
			if (admin.length() <= 0) {
				System.out.println("充值失败：管理员姓名不合法");
				result = "failed";
			} else {
				String username = (String) request.getAttribute("username");
				if (username.length() <= 0) {
					System.out.println("充值失败：充值用户名不合法");
					result = "failed";
				} else {
					try {
						float money = (Float) request.getAttribute("number");
						// TODO 调用service
					} catch (Exception e) {
						System.out.println("充值失败：充值的金额不合法");
						result = "failed";
					}

				}
			}
		}
		return result;
	}

	/**
	 * 支付Action
	 * @return
	 */
	public String payAction() {
		String result = SUCCESS;
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getAttribute("payer") == null) {
			System.out.println("支付失败:支付人用户名不合法");
			result = "failed";
		} else {
			String payer = (String) request.getAttribute("payer");
			if (payer.length() <= 0) {
				System.out.println("支付失败:支付人用户名不合法");
				result = "failed";
			} else {
				if (request.getAttribute("payPassword") == null) {
					System.out.println("支付失败:支付人支付密码不合法");
					result = "failed";
				} else {
					String payPassword = (String) request.getAttribute("payPassword");
					if (payPassword.length() <= 0) {
						System.out.println("支付失败:支付人用户名不合法");
						result = "failed";
					} else {
						if (request.getAttribute("receiver") == null) {
							System.out.println("支付失败:接收方用户名不合法");
							result = "failed";
						} else {
							String receiver = (String) request.getAttribute("receiver");
							if (receiver.length() <= 0) {
								System.out.println("支付失败:接收方用户名不合法");
								result = "failed";
							} else {
								if (request.getAttribute("number") == null) {
									System.out.println("支付失败:支付金额不合法");
									result = "failed";
								} else {
									try {
										float money = (Float) request.getAttribute("number");
										// TODO 调用service
									} catch (Exception E) {
										System.out.println("支付失败:支付金额不合法");
										result = "failed";
									}
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	public String payPageAction() {
		return SUCCESS;
	}

	public String rechargePageAction() {
		return SUCCESS;
	}

}
