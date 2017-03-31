package cn.zowzy.service;

import cn.zowzy.dao.UserDao;

/**
 * 
*  
* 类名称：UserService   
* 类描述：操作UserDao的service类   
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午11:15:09     
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
