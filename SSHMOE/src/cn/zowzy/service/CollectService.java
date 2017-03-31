package cn.zowzy.service;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.CollectDao;

/**
 * 
*  
* 类名称：CollectService   
* 类描述：   
* 创建人：ZJH   
* 创建时间：2017年3月31日 下午1:47:03     
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
	
	
	

}
