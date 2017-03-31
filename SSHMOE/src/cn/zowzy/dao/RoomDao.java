package cn.zowzy.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zowzy.entity.Room;

/**
 * 
*  
* �����ƣ�RoomDao   
* ����������Դ�����ݿ������   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��31�� ����9:05:55     
*
 */
public class RoomDao {

	private HibernateTemplate hibernateTemplate=new HibernateTemplate();

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	/**
	 * ��ӷ�Դ��Ϣ
	 * @param room  ��Դ��Ϣ����
	 */
	public void addRoom(Room room){
		if(room!=null){
			hibernateTemplate.save(room);
		}
	}
	
	
	/**
	 * ����roomid��ѯ��Դ��Ϣ
	 * @param roomid
	 * @return
	 */
	public Room findRoomByRoomid(String roomid){
		String hql=" from  Room where rid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, roomid);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;			
		}
	}
	
	
	/**
	 * �����û�����ѯ���û������еķ�Դ
	 * @param username �û���
	 * @return  room��list
	 */
	public List<Room> findRoomsByUsername(String username){
		String hql=" from  Room where usernameid=?";
		List<Room> list = (List<Room>) hibernateTemplate.find(hql, username);
		if(list!=null){
			return list;
		}else{
			return null;			
		}
	}
	
	
	/**
	 * ���ݷ�Դ��ź��µķ�Դ״̬����޸ķ�Դ״̬��Ϣ
	 * @param roomid  ��Դ���
	 * @param roomStateid  ��Դ״̬���  
	 */
	public void changeRoomState(String roomid,String roomStateid){
		if(roomid==null||roomid.length()<=0){
			return;
		}else if(roomStateid==null||roomStateid.length()<=0){
			return ;
		}
		Room room =findRoomByRoomid(roomid);
		if(room==null){
			return ;
		}else{
			room.getRoomState().setRsid(Integer.valueOf(roomStateid));
			hibernateTemplate.update(room);
		}
	}
	
	/**
	 * ����roomidɾ����Դ
	 * @param roomid
	 */
	public void deleteRoom(String roomid){
		Room room=findRoomByRoomid(roomid);
		if(room==null){
			return;
		}else{
			hibernateTemplate.delete(room);
		}
	}
	
	
	/**
	 * ���ݷ�Դ����޸ķ�Դ�ļ۸�
	 * @param roomid
	 * @param price
	 */
	public void changeRoomPrice(String roomid,float price){
		if(roomid==null||roomid.length()<=0){
			return;
		}else if(price<0){
			return;
		}
		Room room=findRoomByRoomid(roomid);
		if(room==null){
			return;
		}else {
			room.setPrice(price);
			hibernateTemplate.update(room);
		}
	}
	
	
	/**
	 * ����roomid�޸ķ�Դ�ı���
	 * @param roomid
	 * @param title
	 */
	public void changeRoomTitle(String roomid,String title){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(title==null){
			return;
		}else if(title.length()<=0){
			return;
		}else {
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setTitle(title);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸ķ�Դ������
	 * @param roomid
	 * @param score
	 */
	public void changeScore(String roomid,float score){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(score<=0){
			return;
		}else {
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setScore(score);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸ķ�Դ����
	 * @param roomid
	 * @param description
	 */
	public void changeDescription(String roomid,String description){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else {
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setDescription(description);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸ķ�Դ�Ĵ�����Ŀ
	 * @param roomid
	 * @param bad
	 */
	public void changeBad(String roomid,Integer bad){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(bad<=0){
			return;
		}else{
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setBad(bad);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸��Ƿ���wifi
	 * @param roomid
	 * @param wifi
	 */
	public void changeWifi(String roomid ,Boolean wifi){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(wifi==null){
			wifi=false;
		}else{
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return ;
			}else{
				room.setWifi(wifi);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸�TV����Ŀ
	 * @param roomid
	 * @param tv
	 */
	public void changeTv(String roomid,Integer  tv){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(tv<0){
			tv=0;
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setTv(tv);
				hibernateTemplate.update(room);
			}
			
		}
	}
	
	
	/**
	 * ���ݷ�Դ����޸��Ƿ���ͣ��λ
	 * @param roomid
	 * @param park
	 */
	public void changePark(String roomid,Boolean park){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(park==null){
			park=false;
		}else{
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setPark(park);
				hibernateTemplate.update(room);
			}
		}
	}
	
	/**
	 * ���ݷ�Դ����޸��Ƿ��е���
	 * @param roomid
	 * @param lift
	 */
	public void changeLift(String roomid,Boolean lift){
		if(roomid==null){
			return;
		}else if(roomid.length()<=0){
			return;
		}else if(lift==null){
			lift=false;
			Room room = findRoomByRoomid(roomid);
			if(room==null){
				return;
			}else{
				room.setLift(lift);
				hibernateTemplate.update(room);
			}
		}
	}
	
	
}
