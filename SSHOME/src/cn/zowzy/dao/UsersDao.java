package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Users;

/**
 * 
 * 
 * 类名称：UserDao 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午10:33:57
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

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	public void addUser(Users user) {
		hibernateTemplate.save(user);
	}

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
		if (user.getUserstate().getUsid() == 2) {
			user.setActivecode("");
			user.getUserstate().setUsid(1);// �����û�״̬Ϊ����
			hibernateTemplate.update(user);
		}

	}

	/**
	 * 根据修改密码的验证码修改密码
	 * 
	 * @param activeCode
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
		if (user == null) {// ���û�д���֤����û�
			return false;
		} else {
			// 3����ȴ��޸ĵ�½�����״̬
			if (user.getUserstate().getUsid() == 3) {
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
				// 4����ȴ��޸�֧������
				if (user.getUserstate().getUsid() == 4) {
					user.setPaypassword(payPassword);
					user.getUserstate().setUsid(1);
					hibernateTemplate.update(user);
				}
			}
		}
	}

}
