package cn.zowzy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.RoomRule;

/**
 * 
*  
* �����ƣ�RoomRuleDao   
* ���������Է�Դ�������ݿ��������   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��30�� ����9:41:55     
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
	 * ��ӷ�Դ����
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
	 * ���ݷ�Դ��ţ���������ɾ����Դ����
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
	 * ���ݷ�Դ��Ų�ѯ��Դ����
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
