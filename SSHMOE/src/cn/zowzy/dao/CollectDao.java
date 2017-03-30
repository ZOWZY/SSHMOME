package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Collect;

/**
 * 
*  
* 类名称：CollectDao   
* 类描述：收藏数据库操作类   
* 创建人：ZJH   
* 创建时间：2017年3月30日 下午9:05:55     
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
	 * 添加收藏
	 * @param collect  收藏对象
	 */
	public void addCollect(Collect collect){
		if(collect!=null){
			hibernateTemplate.save(collect);			
		}
	}
	
	
	/**
	 * 查询所有收藏
	 * @return
	 */
	public List<Collect>  findAll(){
		String hql="from Collect";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql);
		return list;
	}
	
	
	/**
	 * 根据用户名查询收藏
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username){
		if(username==null||username.length()<=0){
			return null;
		}
		String hql="from Collect where usernameid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username);
		return list;
	}
	
	/**
	 * 根据房源编号查询被收藏的信息
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(String roomid){
		
		if(roomid==null||roomid.length()<=0){
			return  null;
		}
		
		String hql="from Collect where roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, roomid);
		
		return list;
	} 
	
	
	
	/**
	 * 根据用户名和房源编号取消收藏
	 * @param username
	 * @param roomid
	 * @return  true取消收藏成功 ，false取消收藏失败
	 */
	public boolean cancleCollect(String username,String roomid){
		if(roomid==null||roomid.length()<=0||username==null||username.length()<=0){
			return  false;
		}
		boolean result=true;
		String hql="from Collect where usernameid=? and roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username,roomid);
		
		if(list==null){//如果没有这个收藏
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
