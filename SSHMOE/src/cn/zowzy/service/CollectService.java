package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.CollectDao;
import cn.zowzy.entity.Collect;

/**
 * 
 * 作者：yp
 * 类名：CollectService
 * 类描述： 引用收藏的数据库操作类
 * 时间： 2017年3月31日 下午3:53:44
 *
 */

@Transactional
public class CollectService {
	
	private CollectDao collectDao=new CollectDao();

	public CollectDao getCollectDao() {
		return collectDao;
	}

	public void setCollectDao(CollectDao collectDao) {
		this.collectDao = collectDao;
	}
	
	/**
	 * 添加收藏
	 * @param collect  收藏对象
	 */
	public void addCollect(Collect collect){
		collectDao.addCollect(collect);
	}
	
	/**
	 * 查询所有收藏
	 * @return
	 */
	public List<Collect>  findAll(){
		return collectDao.findAll();
	}
	
	/**
	 * 根据用户名查询收藏
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username){
		return collectDao.findCollectsByUsername(username);
	}
	
	/**
	 * 根据房源编号查询被收藏的信息
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(String roomid){
		return collectDao.findCollectsByRoomId(roomid);
	}
	
	/**
	 * 根据用户名和房源编号取消收藏
	 * @param username
	 * @param roomid
	 * @return  true取消收藏成功 ，false取消收藏失败
	 */
	public boolean cancleCollect(String username,String roomid){
		return collectDao.cancleCollect(username, roomid);
	}
	
}
