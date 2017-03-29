package cn.zowzy.entity;

/**
 * 
*  
* 类名称：RoomType   
* 类描述：   房源类型类
* 创建人：ZJH   
* 创建时间：2017年3月29日 下午9:41:04     
*
 */
public class RoomType {
	
	private Integer rtid;//房源状态ID
	private String description;  //状态描述
	
	public Integer getRtid() {
		return rtid;
	}
	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
