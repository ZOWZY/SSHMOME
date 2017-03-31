package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.CollectDao;
import cn.zowzy.entity.Collect;

/**
 * 
 * ���ߣ�yp
 * ������CollectService
 * �������� �����ղص����ݿ������
 * ʱ�䣺 2017��3��31�� ����3:53:44
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
	 * ����ղ�
	 * @param collect  �ղض���
	 */
	public void addCollect(Collect collect){
		collectDao.addCollect(collect);
	}
	
	/**
	 * ��ѯ�����ղ�
	 * @return
	 */
	public List<Collect>  findAll(){
		return collectDao.findAll();
	}
	
	/**
	 * �����û�����ѯ�ղ�
	 * @param username
	 * @return
	 */
	public List<Collect> findCollectsByUsername(String username){
		return collectDao.findCollectsByUsername(username);
	}
	
	/**
	 * ���ݷ�Դ��Ų�ѯ���ղص���Ϣ
	 * @param roomid
	 * @return
	 */
	public List<Collect> findCollectsByRoomId(String roomid){
		return collectDao.findCollectsByRoomId(roomid);
	}
	
	/**
	 * �����û����ͷ�Դ���ȡ���ղ�
	 * @param username
	 * @param roomid
	 * @return  trueȡ���ղسɹ� ��falseȡ���ղ�ʧ��
	 */
	public boolean cancleCollect(String username,String roomid){
		return collectDao.cancleCollect(username, roomid);
	}
	
}
