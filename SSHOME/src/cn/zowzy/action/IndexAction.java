package cn.zowzy.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
*  
* 类名称：IndexAction   
* 类描述：主页的Action   
* 创建人：ZJH   
* 创建时间：2017年5月6日 上午9:40:26     
*
 */
public class IndexAction extends ActionSupport {

	public String indexPage() {
		System.out.println(ServletActionContext.getRequest().getRealPath("/"));
		return SUCCESS;
	}

	public String imgCarouselPageAction() {
		return SUCCESS;
	}

	public String userMyPageAction() {
		return SUCCESS;
	}
	
	public String helpPageAction() {
		return SUCCESS;
	}
	
	public String houseHolderPage() {
		return SUCCESS;
	}
}
