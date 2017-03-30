package cn.zowzy.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

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
	
	
	

}
