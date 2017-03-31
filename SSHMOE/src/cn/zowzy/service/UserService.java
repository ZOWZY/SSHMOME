package cn.zowzy.service;


import java.util.List;

import cn.zowzy.dao.UserDao;
import cn.zowzy.entity.User;

/**
 * 
 * ���ߣ�yp
 * ������UserService
 * �������� ����user��������ݿ������
 * ʱ�䣺 2017��3��31�� ����2:43:47
 * 
 */

public class UserService {
	private UserDao userDao=new UserDao();

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * ���������û�
	 * @return
	 */
	public List<User> findAllUser(){
		return userDao.findAllUser();
	}
	
	/**
	 * �����û�����������
	 * @param username  �û���
	 * @return ����
	 */
	public String findPasswordByUsername(String username){
		return userDao.findPasswordByUsername(username);
	}
	
	/**
	 * ���ݼ���������û�
	 * @param activeCode
	 * @return
	 */
	public User findUserByActiveCode(String activeCode){
		return userDao.findUserByActiveCode(activeCode);
	}
	
	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	public User findUserByUsername(String username){
		return userDao.findUserByUsername(username);
	}
	
	/**
	 * �����ͨ�û�
	 * @param user
	 */
	public void addUser(User user){
		if(user==null)
			return;
		else
			userDao.addUser(user);
	}
	
	/**
	 * ���ݼ����뼤���û�
	 * @param activeCode
	 */
	public void activeUser(String activeCode){
		userDao.activeUser(activeCode);
	}
	
	/**
	 * ����32λ�������޸�����
	 * @param activeCode  ������
	 * @param password  ������
	 * @return  �޸�true�޸ĳɹ���false�޸�ʧ��
	 */
	public Boolean changePasswordByActiveCode(String activeCode,String password){
		return userDao.changePasswordByActiveCode(activeCode, password);
	}
	
	/**
	 * ����64λ���������֧������
	 * @param username
	 * @param activeCode
	 */
	public void changePayPassword(String username,String activeCode,String payPassword){
		userDao.changePayPassword(username, activeCode, payPassword);
	}
	
}
