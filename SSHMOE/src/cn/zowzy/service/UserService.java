package cn.zowzy.service;


import java.util.List;

import cn.zowzy.dao.UserDao;
import cn.zowzy.entity.User;

/**
 * 
 * 作者：yp
 * 类名：UserService
 * 类描述： 引用user对象的数据库操作类
 * 时间： 2017年3月31日 下午2:43:47
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
	 * 查找所有用户
	 * @return
	 */
	public List<User> findAllUser(){
		return userDao.findAllUser();
	}
	
	/**
	 * 根据用户名查找密码
	 * @param username  用户名
	 * @return 密码
	 */
	public String findPasswordByUsername(String username){
		return userDao.findPasswordByUsername(username);
	}
	
	/**
	 * 根据激活码查找用户
	 * @param activeCode
	 * @return
	 */
	public User findUserByActiveCode(String activeCode){
		return userDao.findUserByActiveCode(activeCode);
	}
	
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	public User findUserByUsername(String username){
		return userDao.findUserByUsername(username);
	}
	
	/**
	 * 添加普通用户
	 * @param user
	 */
	public void addUser(User user){
		if(user==null)
			return;
		else
			userDao.addUser(user);
	}
	
	/**
	 * 根据激活码激活用户
	 * @param activeCode
	 */
	public void activeUser(String activeCode){
		userDao.activeUser(activeCode);
	}
	
	/**
	 * 根据32位激活码修改密码
	 * @param activeCode  激活码
	 * @param password  新密码
	 * @return  修改true修改成功，false修改失败
	 */
	public Boolean changePasswordByActiveCode(String activeCode,String password){
		return userDao.changePasswordByActiveCode(activeCode, password);
	}
	
	/**
	 * 根据64位激活码更改支付密码
	 * @param username
	 * @param activeCode
	 */
	public void changePayPassword(String username,String activeCode,String payPassword){
		userDao.changePayPassword(username, activeCode, payPassword);
	}
	
}
