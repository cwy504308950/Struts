package com.web;

import java.sql.SQLException;

import com.domain.USer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.RegisterService;

public class RegisterAction extends ActionSupport implements ModelDriven<USer>{
	public USer	user = new USer(); 


public String register() throws SQLException {
	System.out.println(user.getUsername()+":"+user.getPassword()+":"+user.getPasswordd());
	 if(user.getPassword().equals(user.getPasswordd())) {
		  RegisterService registerService = new RegisterService();
		 boolean isSuccess = registerService.registerUser(user);
		 if(isSuccess) {
			 return "rtologin";
		 }else {
			 return "toregister";
		 }
	 }else {
		 ActionContext.getContext().put("er", "两次密码设置不一致");
		 return "toregister";
	 }
  }

@Override
public USer getModel() {
	// TODO Auto-generated method stub
	return user;
}
}
