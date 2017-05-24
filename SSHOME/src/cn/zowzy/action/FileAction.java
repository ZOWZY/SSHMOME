package cn.zowzy.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <p>ClassName:FileAction</p>
 * <p>Description:文件处理</p> 
 * @author ZJH
 * @date 2017年5月18日下午8:47:29
 */
public class FileAction extends ActionSupport {

	private String roomid;

	private String name;

	private File file;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getRoomid() {
		return roomid;
	}

	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}

	public String photoUpload() {
		System.out.println("房源编号为：" + roomid + "的房主正在上传房间照片:" + name);

		if (roomid == null || roomid.length() <= 0) {
			return "failed";
		}

		// 创建目标文件夹
		String photoPath = "D:/roomImages/" + roomid + "/";
		File f = new File(photoPath);
		if (!f.exists()) {
			f.mkdirs();
		}
		if (file != null) {
			try {
				// FileUtils.copyFile(file, new FileOutputStream(new
				// File(photoPath + name)));
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(new File(photoPath + name));
				byte[] bytes = new byte[1024];

				while (fis.read(bytes) != -1) {
					fos.write(bytes);
					fos.flush();
				}
				fis.close();
				fos.close();
				return SUCCESS;
			} catch (Exception e) {
				System.out.println("照片接受失败");
				e.printStackTrace();
				return "failed";
			}
		} else {
			return "failed";
		}
	}

	public String photoUploadPage() {
		return SUCCESS;
	}

}
