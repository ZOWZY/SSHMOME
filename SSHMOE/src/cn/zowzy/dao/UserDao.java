package cn.zowzy.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

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
	
	
	

}
