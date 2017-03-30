package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.RoomRule;

/**
 * 
*  
* 类名称：RoomRuleDao   
* 类描述：对房源守则数据库操作的类   
* 创建人：ZJH   
* 创建时间：2017年3月30日 下午9:41:55     
*
 */
public class RoomRuleDao {
	
	private HibernateTemplate hibernateTemplate=new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	/**
	 * 添加房源守则
	 * @param roomRule
	 */
	public void addRoomRule(RoomRule roomRule){
		if(roomRule.getContent()==null||roomRule.getContent().length()<=0){
			return;
		}else{
			hibernateTemplate.save(roomRule);
		}
	}
	
	/**
	 * 根据房源编号，守则内容删除房源守则
	 * @param roomid
	 * @param content
	 */
	public void deleteRoomRule(String roomid,String content){
		List<RoomRule> list = findRoomRuleByRoomid(roomid);
		RoomRule rr = null;
		for (RoomRule roomRule : list) {
			if(roomRule.getContent().equals(content)){
				rr=roomRule;
				break;
			}
		}
		if(rr!=null){
			hibernateTemplate.delete(rr);			
		}
	}
	
	
	/**
	 * 根据房源编号查询房源守则
	 * @param roomid
	 * @return
	 */
	public List<RoomRule>  findRoomRuleByRoomid(String roomid){
		if(roomid==null||roomid.length()<=0){
			return null;
		}
		String hql="from RoomRool where roomid=?";
		List<RoomRule> list = (List<RoomRule>) hibernateTemplate.find(hql, roomid);
		return list;
	}
	
	
	
}
