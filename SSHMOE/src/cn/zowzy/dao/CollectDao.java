package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Collect;

/**
 * 
*  
* �����ƣ�CollectDao   
* ���������ղ����ݿ������   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��30�� ����9:05:55     
*
 */
public class CollectDao {
	private HibernateTemplate hibernateTemplate=new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	/**
	 * ����ղ�
	 * @param collect  �ղض���
	 */
	public void addCollect(Collect collect){
		hibernateTemplate.save(collect);
	}
	
	
	/**
	 * ��ѯ�����ղ�
	 * @return
	 */
	public List<Collect>  findAll(){
		String hql="from Collect";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql);
		if(list==null){
			list=new ArrayList<Collect>();
		}
		return list;
	}
	
	
	/**
	 * �����û�����ѯ�ղ�
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username){
		String hql="from Collect where usernameid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username);
		if(list==null){
			list=new ArrayList<Collect>();
		}
		return list;
	}
	
	/**
	 * ���ݷ�Դ��Ų�ѯ���ղص���Ϣ
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(String roomid){
		String hql="from Collect where roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, roomid);
		if(list==null){
			list=new ArrayList<Collect>();
		}
		return list;
	} 
	
	
	
	/**
	 * �����û����ͷ�Դ���ȡ���ղ�
	 * @param username
	 * @param roomid
	 * @return  trueȡ���ղسɹ� ��falseȡ���ղ�ʧ��
	 */
	public boolean cancleCollect(String username,String roomid){
		boolean result=true;
		String hql="from Collect where usernameid=? and roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username,roomid);
		
		if(list==null){//���û������ղ�
			result=false;
		}else if(list.size()>0){
			Collect entity=list.get(0);
			hibernateTemplate.delete(entity);
		}else{
			result=false;
		}
		return result;
	}
	
	
	
}
