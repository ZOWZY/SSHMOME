package cn.zowzy.service;

import cn.zowzy.dao.UserDao;

/**
 * 
*  
* �����ƣ�UserService   
* ������������UserDao��service��   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����11:15:09     
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
	
	
	
	
}
