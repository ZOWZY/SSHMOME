package cn.zowzy.service;


import java.util.List;

import cn.zjh.uuid.UUIDUtils;
import cn.zowzy.dao.UserDao;
import cn.zowzy.entity.User;
import cn.zowzy.entity.UserState;
import cn.zowzy.entity.UserType;
import cn.zowzy.util.MailUtils;

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
		if(user==null){
			return;			
		}else{
			UserState us=new UserState();
			us.setUsid(2);//2����û�м���  1�����Ѿ�����
			String activeCode=UUIDUtils.getUUID64WithoutLine();
			user.setActiveCode(activeCode);
			user.setUserState(us);
			user.setBalance(2000.00f);
			UserType ut=new UserType();
			ut.setUtid(1);//1������ͨ�û� 2�������Ա
			//�����ʼ�
			//TODO   ��Ӳ���
			MailUtils mail=new MailUtils();
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
