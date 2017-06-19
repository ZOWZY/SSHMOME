package cn.zowzy.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.zowzy.entity.Photo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
		String photoPath = ServletActionContext.getRequest().getRealPath("/") + "roomImages" + File.separator + roomid
				+ File.separator;
		File f = new File(photoPath);
		System.out.println("________________________");
		System.out.println(f.getAbsolutePath());
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

				File files = new File(photoPath);
				String[] list = files.list();
				System.out.println("当前目录下的照片数目为：" + list.length);

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

	public String getPhotosPage() {
		return SUCCESS;
	}

	/**
	 * 
	 * <p>MethodName: getPhotoNames</p>
	 * <p>Description:根据房源编号获取这个房源的照片,如果没有返回的是空JSON数组</p> 
	 * @author ZJH
	 * @throws UnsupportedEncodingException 
	 * @date 2017年5月24日上午11:44:55
	 */
	public void getPhotoNames() throws Exception {
		String photoNames;
		if (roomid == null || roomid.length() <= 0) {
			JSONArray array = new JSONArray();
			photoNames = array.toString();
			ServletActionContext.getResponse().getOutputStream().write(photoNames.getBytes("utf-8"));
		} else {
			String photoPath = ServletActionContext.getRequest().getRealPath("/") + "roomImages" + File.separator
					+ roomid + File.separator;
			File f = new File(photoPath);
			if (!f.exists()) {
				f.mkdirs();
			}
			File files = new File(photoPath);
			String[] list = files.list();
			System.out.println("当前目录下的照片数目为：" + list.length);
			JSONArray array = new JSONArray();
			for (String string : list) {
				Photo p = new Photo();
				p.setRoomid(roomid);
				p.setFilename(string);
				JSONObject obj = JSONObject.fromObject(p);
				array.add(obj);
			}
			photoNames = array.toString();
			ServletActionContext.getResponse().getOutputStream().write(photoNames.getBytes("utf-8"));
		}
		System.out.println("用户请求照片：" + photoNames);
	}

}
