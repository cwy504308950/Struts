package com.interrupt;

import java.util.Map;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyIterrupt extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		System.err.println("我正在拦截了！");
		Map<String, Object> session = ActionContext.getContext().getSession();
		 
		if(session.get("user") == null) {
			System.err.println("@@@我拦截住了！！！");
			return "tologin";
		}else {
			Object o =session.get("user");
			System.out.print(o);
			System.err.println("我没有拦截！");
			return arg0.invoke();
		}
	}

}
