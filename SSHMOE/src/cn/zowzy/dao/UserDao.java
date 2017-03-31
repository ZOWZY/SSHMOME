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
* 类名称：UserDao   
* 类描述：对user对象进行数据库操作的dao类   
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午11:14:13     
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
	 * 查找所有用户
	 * @return
	 */
	public List<User>  findAllUser(){
		String hql="from User";
		List<User> list = (List<User>) hibernateTemplate.find(hql);
		return list;
	}
	
	
	

	/**
	 * 根据用户名查找密码
	 * @param username  用户名
	 * @return 密码
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
	 * 根据激活码查找用户
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
	 * 根据用户名查找用户
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
	 * 添加普通用户
	 * @param user
	 */
	public void  addUser(User user){
		UserState us=new UserState();
		us.setUsid(2);//2代表没有激活  1代表已经激活
		user.setUserState(us);
		user.setActiveCode(UUIDUtils.getUUID64WithoutLine());
		user.setBalance(2000.00f);
		UserType ut=new UserType();
		ut.setUtid(1);//1代表普通用户 2代表管理员
		hibernateTemplate.save(user);
	}
	
	
	/**
	 * 根据激活码激活用户
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
			user.getUserState().setUsid(1);//设置用户状态为激活
			hibernateTemplate.update(user);
		}
		
	}
	
	
	/**
	 * 根据32为激活码修改登陆密码
	 * @param activeCode  激活码
	 * @param password  新密码
	 * @return  修改true修改成功，false修改失败
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
		if(user==null){//如果没有此验证码的用户
			return false;
		}else{
			//3代表等待修改登陆密码的状态
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
	 * 根据64位激活码更改支付密码
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
				//4代表等待修改支付密码
				if(user.getUserState().getUsid()==4){
					user.setPayPassword(payPassword);
					user.getUserState().setUsid(1);
					hibernateTemplate.update(user);
				}
			}
		}
	}
	
	

}
