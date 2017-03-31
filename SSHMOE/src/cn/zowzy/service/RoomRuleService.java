package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.RoomRuleDao;
import cn.zowzy.entity.RoomRule;

/**
 * 
 * ���ߣ�yp
 * ������RoomRuleService.java
 * �������� ���÷�Դ��������ݿ������
 * ʱ�䣺 2017��3��31�� ����3:45:33
 *
 */
@Transactional
public class RoomRuleService {
	private RoomRuleDao roomruleDao=new RoomRuleDao();

	public RoomRuleDao getRoomruleDao() {
		return roomruleDao;
	}

	public void setRoomruleDao(RoomRuleDao roomruleDao) {
		this.roomruleDao = roomruleDao;
	}

	/**
	 * ��ӷ�Դ����
	 * @param roomRule
	 */
	public void addRoomRule(RoomRule roomRule){
		if(roomRule==null)
			return;
		else
			roomruleDao.addRoomRule(roomRule);
	}
	
	/**
	 * ���ݷ�Դ��ţ���������ɾ����Դ����
	 * @param roomid
	 * @param content
	 */
	public void deleteRoomRule(String roomid,String content){
		if(roomid==null||roomid.length()<=0||content==null||content.length()<=0)
			return;
		else
			roomruleDao.deleteRoomRule(roomid, content);
	}
	
	/**
	 * ���ݷ�Դ��Ų�ѯ��Դ����
	 * @param roomid
	 * @return
	 */
	public List<RoomRule> findRoomRuleByRoomid(String roomid){
		return roomruleDao.findRoomRuleByRoomid(roomid);
	}
	
}
