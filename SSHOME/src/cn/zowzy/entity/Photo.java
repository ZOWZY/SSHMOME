package cn.zowzy.entity;

/**
 * 
 * <p>ClassName:Photo</p>
 * <p>Description:定义一个内部的照片类，方便使用</p> 
 * @author ZJH
 * @date 2017年5月24日上午11:37:24
 */
public class Photo {
	private String roomid;
	private String filename;

	public String getRoomid() {
		return roomid;
	}

	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
