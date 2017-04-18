package cn.zowzy.service;

import java.util.List;

import javax.transaction.Transactional;

import cn.zjh.uuid.UUIDUtils;
import cn.zowzy.dao.UsersDao;
import cn.zowzy.entity.Users;
import cn.zowzy.entity.Userstate;
import cn.zowzy.entity.Usertype;
import cn.zowzy.util.MailUtils;

/**
 * 
 * 
 * 类名称：UsersService 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午11:45:37
 *
 */
@Transactional
public class UsersService {
	private UsersDao userDao = new UsersDao();

	public UsersDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UsersDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 
	 * @return
	 */
	public List<Users> findAllUser() {
		return userDao.findAllUser();
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public String findPasswordByUsername(String username) {
		return userDao.findPasswordByUsername(username);
	}

	/**
	 * 
	 * @param activeCode
	 * @return
	 */
	public Users findUserByActiveCode(String activeCode) {
		return userDao.findUserByActiveCode(activeCode);
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public Users findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
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
			us.setUsid(2);// 2����û�м��� 1�����Ѿ�����
			String activeCode = UUIDUtils.getUUID64WithoutLine();
			user.setActivecode(activeCode);
			user.setUserstate(us);
			user.setBalance(2000.00f);
			Usertype ut = new Usertype();
			ut.setUtid(1);// 1������ͨ�û� 2�������Ա
			// �����ʼ�
			// TODO 发送邮件
			MailUtils mail = new MailUtils();
			mail.setFilePath("");
			mail.setId("");
			mail.setUrl("");
			mail.setSubject("�޸ĵ�½����");
			mail.sendMail(user.getEmail(), activeCode);
			userDao.addUser(user);
		}
	}

	/**
	 * 
	 * @param activeCode
	 */
	public void activeUser(String activeCode) {
		userDao.activeUser(activeCode);
	}

	/**
	 * 
	 * @param activeCode
	 * @param password
	 * @return
	 */
	public Boolean changePasswordByActiveCode(String activeCode, String password) {
		return userDao.changePasswordByActiveCode(activeCode, password);
	}

	/**
	 * 
	 * @param username
	 * @param activeCode
	 * @param payPassword
	 */
	public void changePayPassword(String username, String activeCode, String payPassword) {
		userDao.changePayPassword(username, activeCode, payPassword);
	}

}
