package cn.zowzy.service;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.CollectDao;

/**
 * 
*  
* �����ƣ�CollectService   
* ��������   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��31�� ����1:47:03     
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
