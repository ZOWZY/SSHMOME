package cn.zowzy.service;

import java.util.List;

import cn.zjh.uuid.UUIDUtils;
import cn.zowzy.dao.UsersDao;
import cn.zowzy.entity.Users;
import cn.zowzy.entity.Userstate;
import cn.zowzy.entity.Usertype;
import cn.zowzy.util.MailUtils;

/**
 * 
 * ���ߣ�yp ������UserService �������� ����user��������ݿ������ ʱ�䣺 2017��3��31��
 * ����2:43:47
 * 
 */

public class UsersService {
	private UsersDao userDao = new UsersDao();

	public UsersDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UsersDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * ���������û�
	 * 
	 * @return
	 */
	public List<Users> findAllUser() {
		return userDao.findAllUser();
	}

	/**
	 * �����û�����������
	 * 
	 * @param username
	 *            �û���
	 * @return ����
	 */
	public String findPasswordByUsername(String username) {
		return userDao.findPasswordByUsername(username);
	}

	/**
	 * ���ݼ���������û�
	 * 
	 * @param activeCode
	 * @return
	 */
	public Users findUserByActiveCode(String activeCode) {
		return userDao.findUserByActiveCode(activeCode);
	}

	/**
	 * �����û��������û�
	 * 
	 * @param username
	 * @return
	 */
	public Users findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}

	/**
	 * �����ͨ�û�
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
			// TODO ��Ӳ���
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
	 * ���ݼ����뼤���û�
	 * 
	 * @param activeCode
	 */
	public void activeUser(String activeCode) {
		userDao.activeUser(activeCode);
	}

	/**
	 * ����32λ�������޸�����
	 * 
	 * @param activeCode
	 *            ������
	 * @param password
	 *            ������
	 * @return �޸�true�޸ĳɹ���false�޸�ʧ��
	 */
	public Boolean changePasswordByActiveCode(String activeCode, String password) {
		return userDao.changePasswordByActiveCode(activeCode, password);
	}

	/**
	 * ����64λ���������֧������
	 * 
	 * @param username
	 * @param activeCode
	 */
	public void changePayPassword(String username, String activeCode, String payPassword) {
		userDao.changePayPassword(username, activeCode, payPassword);
	}

}
