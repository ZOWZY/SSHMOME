package cn.zowzy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.zowzy.dao.RoomRuleDao;
import cn.zowzy.entity.RoomRule;

/**
 * 
 * 作者：yp
 * 类名：RoomRuleService.java
 * 类描述： 引用房源守则的数据库操作类
 * 时间： 2017年3月31日 下午3:45:33
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
	 * 添加房源守则
	 * @param roomRule
	 */
	public void addRoomRule(RoomRule roomRule){
		if(roomRule==null)
			return;
		else
			roomruleDao.addRoomRule(roomRule);
	}
	
	/**
	 * 根据房源编号，守则内容删除房源守则
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
	 * 根据房源编号查询房源守则
	 * @param roomid
	 * @return
	 */
	public List<RoomRule> findRoomRuleByRoomid(String roomid){
		return roomruleDao.findRoomRuleByRoomid(roomid);
	}
	
}
