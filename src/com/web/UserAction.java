package com.web;

import com.domain.USer;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<USer> {

public USer user= new USer();
	public String loginn() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(user.getUsername() +":"+ user.getPassword());
		UserService userService = new UserService();
		boolean isSuccess =  userService.findUser(user);
		if(isSuccess) {
			System.err.println("������ȷ");
			ActionContext.getContext().getSession().put("user", "yes");
			return "index";
		}else {
			System.err.println("�������");
			ActionContext.getContext().put("error", "�û�����������󣡣���");
			return "login";
		}
		

	}
	@Override
	public USer getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
