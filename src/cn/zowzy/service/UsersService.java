package cn.zowzy.service;

import java.util.List;

import javax.transaction.Transactional;

import cn.zjh.uuid.UUIDUtils;
import cn.zowzy.dao.UsersDao;
import cn.zowzy.entity.Users;
import cn.zowzy.entity.Userstate;
import cn.zowzy.entity.Usertype;
import cn.zowzy.util.MailUtils;
import cn.zowzy.util.PathUtils;

/**
 * 
 * 
 * 类名称：UsersService 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午11:45:37
 *
 */
@Transactional
public class UsersService {
	private UsersDao usersDao = new UsersDao();

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	/**
	 * 
	 * @return
	 */
	public List<Users> findAllUser() {
		return usersDao.findAllUser();
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public String findPasswordByUsername(String username) {
		return usersDao.findPasswordByUsername(username);
	}

	/**
	 * 
	 * @param activeCode
	 * @return
	 */
	public Users findUserByActiveCode(String activeCode) {
		return usersDao.findUserByActiveCode(activeCode);
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public Users findUserByUsername(String username) {
		return usersDao.findUserByUsername(username);
	}

	/**
	 * 
	 * @param user
	 */
	public void addUser(Users user) {
		if (user == null) {
			return;
		} else {
			Userstate us = new Userstate();
			us.setUsid(2);
			String activeCode = UUIDUtils.getUUID64WithoutLine();
			user.setActivecode(activeCode);
			user.setUserstate(us);
			user.setBalance(2000f);
			Usertype ut = new Usertype();
			ut.setUtid(1);
			// TODO 发送邮件
			MailUtils mail = new MailUtils();
			mail.setFilePath(PathUtils.getXmlPath("/mails/UserActive.html"));
			mail.setId("url");
			mail.setUrl("www.baidu.com");
			mail.setSubject("账号激活");
			mail.sendMail(user.getEmail(), activeCode);
			usersDao.addUser(user);
		}
	}

	/**
	 * 
	 * @param activeCode
	 */
	public void activeUser(String activeCode) {
		usersDao.activeUser(activeCode);
	}

	/**
	 * 
	 * @param activeCode
	 * @param password
	 * @return
	 */
	public Boolean changePasswordByActiveCode(String activeCode, String password) {
		return usersDao.changePasswordByActiveCode(activeCode, password);
	}

	/**
	 * 
	 * @param username
	 * @param activeCode
	 * @param payPassword
	 */
	public void changePayPassword(String username, String activeCode, String payPassword) {
		usersDao.changePayPassword(username, activeCode, payPassword);
	}

}
