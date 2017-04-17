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
	 * ���������û�
	 * 
	 * @return
	 */
	public List<Users> findAllUser() {
		String hql = "from User";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql);
		return list;
	}

	/**
	 * �����û�����������
	 * 
	 * @param username
	 *            �û���
	 * @return ����
	 */
	public String findPasswordByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = "from User where username=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, username);
		String password = "";
		if (list != null && list.size() > 0) {
			password = list.get(0).getPassword();
		}
		return password;
	}

	/**
	 * ���ݼ���������û�
	 * 
	 * @param activeCode
	 * @return
	 */
	public Users findUserByActiveCode(String activeCode) {
		if (activeCode == null || activeCode.length() != 32 || activeCode.length() != 64) {
			return null;
		}
		Users user = null;
		String hql = "from User where activecode=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, activeCode);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}

	/**
	 * �����û��������û�
	 * 
	 * @param username
	 * @return
	 */
	public Users findUserByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		Users user = null;
		String hql = "from User where username=?";
		List<Users> list = (List<Users>) hibernateTemplate.find(hql, username);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}

	/**
	 * �����ͨ�û�
	 * 
	 * @param user
	 */
	public void addUser(Users user) {
		hibernateTemplate.save(user);
	}

	/**
	 * ���ݼ����뼤���û�
	 * 
	 * @param activeCode
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
	 * ����32Ϊ�������޸ĵ�½����
	 * 
	 * @param activeCode
	 *            ������
	 * @param password
	 *            ������
	 * @return �޸�true�޸ĳɹ���false�޸�ʧ��
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
	 * ����64λ���������֧������
	 * 
	 * @param username
	 * @param activeCode
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
