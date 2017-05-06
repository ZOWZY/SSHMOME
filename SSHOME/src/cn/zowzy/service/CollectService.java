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
	 * 
	 * @param collect
	 */
	public void addCollect(Collect collect) {
		collectDao.addCollect(collect);
	}

	/**
	 * 
	 * @return
	 */
	public List<Collect> findAll() {
		return collectDao.findAll();
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username) {
		return collectDao.findCollectsByUsername(username);
	}

	/**
	 * 
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(String roomid) {
		return collectDao.findCollectsByRoomId(roomid);
	}

	/**
	 * 
	 * @param username
	 * @param roomid
	 * @return
	 */
	public boolean cancleCollect(String username, String roomid) {
		return collectDao.cancleCollect(username, roomid);
	}

}
