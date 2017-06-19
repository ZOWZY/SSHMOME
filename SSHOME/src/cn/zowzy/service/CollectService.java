package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.CollectDao;
import cn.zowzy.entity.Collect;

/**
 * 
 * 
 * 类名称：CollectService 类描述： 创建人：ZJH 创建时间：2017年4月17日 下午11:47:09
 *
 */
@Transactional
public class CollectService {

	private CollectDao collectDao = new CollectDao();

	public CollectDao getCollectDao() {
		return collectDao;
	}

	public void setCollectDao(CollectDao collectDao) {
		this.collectDao = collectDao;
	}

	/**
	 * 添加收藏
	 * @param collect
	 */
	public void addCollect(Collect collect) {
		collectDao.addCollect(collect);
	}

	/**
	 * 查询所有收藏
	 * @return
	 */
	public List<Collect> findAll() {
		return collectDao.findAll();
	}

	/**
	 * 根据用户名查询收藏
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username) {
		return collectDao.findCollectsByUsername(username);
	}

	/**
	 * 根据ROOMID查询收藏
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(Integer roomid) {
		return collectDao.findCollectsByRoomId(roomid);
	}

	/**
	 * 根据用户名和房源编号取消收藏
	 * @param username
	 * @param roomid
	 * @return
	 */
	public boolean cancleCollect(String username, Integer roomid) {
		return collectDao.cancleCollect(username, roomid);
	}

	/**
	 * 根据用户名清空收藏夹
	 * @param username
	 * @return
	 */
	public boolean cancleAllCollect(String username){
		return collectDao.cancleAllCollect(username);
	}
}
