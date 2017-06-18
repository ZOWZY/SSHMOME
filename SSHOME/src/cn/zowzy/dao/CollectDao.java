package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Collect;

/**
 * 
 * 
 * 类名称：CollectDao 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午11:05:19
 *
 */
public class CollectDao {
	private HibernateTemplate hibernateTemplate = new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * 添加收藏
	 * 
	 * @param collect
	 */
	public void addCollect(Collect collect) {
		if (collect != null) {
			hibernateTemplate.save(collect);
		}
	}

	/**
	 * 查询所有收藏
	 * 
	 * @return
	 */
	public List<Collect> findAll() {
		String hql = "from Collect";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql);
		return list;
	}

	/**
	 * 根据用户名查询收藏
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		String hql = "from Collect where usernameid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username);
		return list;
	}

	/**
	 * 根据ROOMID查询收藏
	 * 
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(Integer roomid) {

		if (roomid < 0) {
			return null;
		}

		String hql = "from Collect where roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, roomid);

		return list;
	}

	/**
	 * 根据用户名和房源编号取消收藏
	 * 
	 * @param username
	 *            用户名
	 * @param roomid
	 *            房源编号
	 * @return
	 */
	public boolean cancleCollect(String username, Integer roomid) {
		if (roomid < 0 || username == null || username.length() <= 0) {
			return false;
		}
		boolean result = true;
		String hql = "from Collect where usernameid=? and roomid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username, roomid);
		if (list == null) {
			result = false;
		} else if (list.size() > 0) {
			Collect entity = list.get(0);
			hibernateTemplate.delete(entity);
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * 根据用户名清空收藏夹
	 * @param username
	 * @return
	 */
	public boolean cancleAllCollect(String username){
		if (username == null || username.length() <= 0) {
			return false;
		}
		boolean result = true;
		String hql = "from Collect where usernameid=?";
		List<Collect> list = (List<Collect>) hibernateTemplate.find(hql, username);
		if (list == null) {
			result = false;
		} else if (list.size() > 0) {
			for(Collect entity:list){
				//Collect entity = list.get(0);
			    hibernateTemplate.delete(entity);
			}
		} else {
			result = false;
		}
		return result;
	}
}
