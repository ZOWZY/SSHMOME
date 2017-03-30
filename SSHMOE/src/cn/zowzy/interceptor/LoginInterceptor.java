package cn.zowzy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


/**
 * 
*  
* 类名称：LoginInterceptor   
* 类描述：登陆拦截器   
* 创建人：ZJH   
* 创建时间：2017年3月30日 下午9:32:56     
*
 */
public class LoginInterceptor extends MethodFilterInterceptor {


	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username==null){//没有登陆  返回到struts.xml中，找到对应的result标签  进行后续操作  不会执行action
			return "nologin";
		}else{
			return invocation.invoke();//已经登录  放行
		}
	}

}
