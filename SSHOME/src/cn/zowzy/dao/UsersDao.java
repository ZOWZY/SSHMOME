package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Users;

/**
 * 
 * 
 * 类名称：UsersDao 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午10:33:57
 *
 */
public class UsersDao {

	private HibernateTemplate hibernateTemplate = new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// ----------------------增

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	public void addUser(Users user) {
		hibernateTemplate.save(user);
	}

	// ----------------------查

	/**
	 * 查询所有的用户
	 * 
	 * @return
	 */
	public List<Users> findAllUser() {
		String hql = "from Users";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql);
		return list;
	}

	/**
	 * 根据用户名查询登陆密码
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public String findPasswordByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = "from Users where username=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, username);
		String password = "";
		if (list != null && list.size() > 0) {
			password = list.get(0).getPassword();
		}
		return password;
	}

	/**
	 * 根据用户名查询用户的支付密码
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public String findPayPasswordByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = "from Users where username=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, username);
		String password = "";
		if (list != null && list.size() > 0) {
			password = list.get(0).getPaypassword();
		}
		return password;
	}

	/**
	 * 根据激活码查询用户
	 * 
	 * @param activeCode
	 *            激活码
	 * @return
	 */
	public Users findUserByActiveCode(String activeCode) {
		if (activeCode == null || activeCode.length() != 32 || activeCode.length() != 64) {
			return null;
		}
		Users user = null;
		String hql = "from Users where activecode=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, activeCode);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}
	
	/**
	 * 根据修改密码的验证码查询用户
	 * 
	 * @param changePasswordCode
	 *           修改密码的验证码
	 * @return
	 */
	public Users findUserByChangePasswordCode(String changePasswordCode) {
		if (changePasswordCode == null ||  changePasswordCode.length() != 64) {
			return null;
		}
		Users user = null;
		String hql = "from Users where changepasswordcode=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, changePasswordCode);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}
	
	/**
	 * 根据修改支付密码的验证码查询用户
	 * 
	 * @param changePayPasswordCode
	 *           修改支付密码的验证码
	 * @return
	 */
	public Users findUserByChangePayPasswordCode(String changePayPasswordCode) {
		if (changePayPasswordCode == null ||  changePayPasswordCode.length() != 64) {
			return null;
		}
		Users user = null;
		String hql = "from Users where changepaypasswordcode=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, changePayPasswordCode);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}
	
	/**
	 * 根据用户名查询用户
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public Users findUserByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		Users user = null;
		String hql = "from Users where username=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, username);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}

	// ----------------------改
	
	/**
	 * 根据激活码激活用户
	 * 
	 * @param activeCode
	 *            激活码
	 */
	public void activeUser(String activeCode) {
		if (activeCode == null || activeCode.length() != 32 || activeCode.length() != 64) {
			return;
		}
		Users user = findUserByActiveCode(activeCode);
		if (user == null) {
			return;
		}
		if (user.getUserstate().getUsid().equals(2)) {
			user.setActivecode("");
			user.getUserstate().setUsid(1);// �����û�״̬Ϊ����
			hibernateTemplate.update(user);
		}

	}

	/**
	 * 根据修改密码的验证码修改密码
	 * 
	 * @param activeC ode
	 *            验证码
	 * @param password
	 *            新密码
	 * @return
	 */
	public Boolean changePasswordByActiveCode(String activeCode, String password) {

		if (activeCode == null || activeCode.length() != 32) {
			return false;
		}
		if (password == null || password.length() <= 0) {
			return false;
		}

		Boolean result = false;
		Users user = findUserByActiveCode(activeCode);
		if (user == null) {
			return false;
		} else {
			if (user.getUserstate().getUsid().equals(3)) {
				user.setPassword(password);
				user.getUserstate().setUsid(1);
				hibernateTemplate.update(user);
				result = true;
			}

		}

		return result;
	}

	/**
	 * 根据用户名和修改支付密码的验证码修改支付密码
	 * 
	 * @param username
	 *            用户名
	 * @param activeCode
	 *            验证码
	 * @param payPassword
	 *            新的支付密码
	 */
	public void changePayPassword(String username, String activeCode, String payPassword) {
		if (username == null || username.length() <= 0) {
			return;
		} else if (activeCode == null || activeCode.length() != 64) {
			return;
		} else {
			Users user = findUserByActiveCode(activeCode);
			if (user == null) {
				return;
			} else {
				if (user.getUserstate().getUsid().equals(4)) {
					user.setPaypassword(payPassword);
					user.getUserstate().setUsid(1);
					hibernateTemplate.update(user);
				}
			}
		}
	}
	
	/**
	 * 根据用户名和支付密码付款
	 * @param payer
	 * @param receiver
	 * @param payPassword
	 * @param payAmount
	 * @return
	 */
	public boolean paymentByUsername(String payer,String receiver,String payPassword,Float payAmount){
		String paypass=findPayPasswordByUsername(payer);
		if(paypass!=null&&paypass.endsWith(payPassword)){
			Users payuser=findUserByUsername(payer);
			Users receivuser=findUserByUsername(receiver);
			if(payuser!=null&&receivuser!=null){
				Float paybalance=payuser.getBalance();
				Float receivbalance=receivuser.getBalance();
				if(paybalance>=payAmount){
					paybalance-=payAmount;
					receivbalance+=payAmount;
					hibernateTemplate.update(payuser);
					hibernateTemplate.update(receivuser);
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 根据用户名充值
	 * @param admin
	 * @param username
	 * @param number
	 * @return
	 */
	public boolean rechargeByUsername(String admin,String username,Float number){
		if (admin == null || admin.length() <= 0) {
			return false;
		} 
		if (username == null || username.length() <= 0) {
			return false;
		}
		if (number <= 0) {
			return false;
		}
		Users ad = findUserByUsername(admin);
		Users user = findUserByUsername(username);
		if(ad!=null||user!=null){
			return false;
		}
		if(ad.getUsertype().getUtid()!=2){
			return false;
		}
		user.setBalance(user.getBalance()+ number);
		hibernateTemplate.update(user);
		return true;
	}
	
}
