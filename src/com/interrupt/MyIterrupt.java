package com.interrupt;

import java.util.Map;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyIterrupt extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		System.err.println("�����������ˣ�");
		Map<String, Object> session = ActionContext.getContext().getSession();
		 
		if(session.get("user") == null) {
			System.err.println("@@@������ס�ˣ�����");
			return "tologin";
		}else {
			Object o =session.get("user");
			System.out.print(o);
			System.err.println("��û�����أ�");
			return arg0.invoke();
		}
	}

}
