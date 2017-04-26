package cn.zowzy.util;

public class PathUtils {
	/**
	 * 获取WEB-INF的路径
	 * 
	 * @param filename
	 * @return
	 */
	public static String getXmlPath(String filename) {
		// file:/D:/JavaWeb/.metadata/.me_tcat/webapps/TestBeanUtils/WEB-INF/classes/
		String path = Thread.currentThread().getContextClassLoader().getResource("").toString();
		path = path.replace('/', '\\'); // 将/换成\
		path = path.replace("file:", ""); // 去掉file:
		path = path.replace("classes\\", ""); // 去掉class\
		path = path.substring(1); // 去掉第一个\,如 \D:\JavaWeb...
		path += filename;
		// System.out.println(path);
		return path;
	}
}
