package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zjh.uuid.UUIDUtils;
import cn.zowzy.entity.User;
import cn.zowzy.entity.UserState;
import cn.zowzy.entity.UserType;

/**
 * 
*  
* �����ƣ�UserDao   
* ����������user����������ݿ������dao��   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����11:14:13     
*
 */
public class UserDao {
	
	private HibernateTemplate hibernateTemplate=new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	/**
	 * ���������û�
	 * @return
	 */
	public List<User>  findAllUser(){
		String hql="from User";
		List<User> list = (List<User>) hibernateTemplate.find(hql);
		return list;
	}
	
	
	

	/**
	 * �����û�����������
	 * @param username  �û���
	 * @return ����
	 */
	public String findPasswordByUsername(String username){
		if(username==null||username.length()<=0){
			return null;
		}
		String hql="from User where username=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, username);
		String password="";
		if(list!=null&&list.size()>0){
			password=list.get(0).getPassword();
		}
		return password;
	}
	
	
	/**
	 * ���ݼ���������û�
	 * @param activeCode
	 * @return
	 */
	public User findUserByActiveCode(String activeCode){
		if(activeCode==null||activeCode.length()!=32||activeCode.length()!=64){
			return null;
		}
		User  user=null;
		String hql="from User where activecode=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, activeCode);
		if(list!=null&&list.size()>0){
			user=list.get(0);
		}
		return user;
	}
	
	
	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	public User findUserByUsername(String username){
		if(username==null||username.length()<=0){
			return null;
		}
		User  user=null;
		String hql="from User where username=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, username);
		if(list!=null&&list.size()>0){
			user=list.get(0);
		}
		return user;
	}
	
	/**
	 * �����ͨ�û�
	 * @param user
	 */
	public void  addUser(User user){
		hibernateTemplate.save(user);
	}
	
	
	/**
	 * ���ݼ����뼤���û�
	 * @param activeCode
	 */
	public void activeUser(String activeCode){
		if(activeCode==null||activeCode.length()!=32||activeCode.length()!=64){
			return ;
		}
		User user=findUserByActiveCode(activeCode);
		if(user==null){
			return;
		}
		if(user.getUserState().getUsid()==2){
			user.setActiveCode("");
			user.getUserState().setUsid(1);//�����û�״̬Ϊ����
			hibernateTemplate.update(user);
		}
		
	}
	
	
	/**
	 * ����32Ϊ�������޸ĵ�½����
	 * @param activeCode  ������
	 * @param password  ������
	 * @return  �޸�true�޸ĳɹ���false�޸�ʧ��
	 */
	public Boolean  changePasswordByActiveCode(String activeCode,String password){
		
		if(activeCode==null||activeCode.length()!=32){
			return false;
		}
		if(password==null||password.length()<=0){
			return false;
		}
		
		Boolean result=false;
		User user=findUserByActiveCode(activeCode);
		if(user==null){//���û�д���֤����û�
			return false;
		}else{
			//3����ȴ��޸ĵ�½�����״̬
			if(user.getUserState().getUsid()==3){
				user.setPassword(password);
				user.getUserState().setUsid(1);
				hibernateTemplate.update(user);
				result=true;
			}
		
		}
		
		return result;
	}
	
	/**
	 * ����64λ���������֧������
	 * @param username
	 * @param activeCode
	 */
	public void changePayPassword(String username,String activeCode,String payPassword){
		if(username==null||username.length()<=0){
			return;
		}else if(activeCode==null||activeCode.length()!=64){
			return;
		}else{
			User user = findUserByActiveCode(activeCode);
			if(user==null){
				return;
			}else{
				//4����ȴ��޸�֧������
				if(user.getUserState().getUsid()==4){
					user.setPayPassword(payPassword);
					user.getUserState().setUsid(1);
					hibernateTemplate.update(user);
				}
			}
		}
	}
	
	

}
