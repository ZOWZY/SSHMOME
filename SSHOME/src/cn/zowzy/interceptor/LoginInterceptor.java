package cn.zowzy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


/**
 * 
*  
* �����ƣ�LoginInterceptor   
* ����������½������   
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��30�� ����9:32:56     
*
 */
public class LoginInterceptor extends MethodFilterInterceptor {


	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username==null){//û�е�½  ���ص�struts.xml�У��ҵ���Ӧ��result��ǩ  ���к�������  ����ִ��action
			return "nologin";
		}else{
			return invocation.invoke();//�Ѿ���¼  ����
		}
	}

}
