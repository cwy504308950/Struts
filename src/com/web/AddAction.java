package com.web;

import java.sql.SQLException;

import com.domain.Paste;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.AddService;

public class AddAction extends ActionSupport implements ModelDriven<Paste> {
public Paste paste = new Paste();
	
	public String add() throws SQLException {
		System.out.println("我进入add（）le ");
		AddService addService = new AddService();
		boolean isSuccess =	addService.addPaste(paste);
		if(isSuccess) {
			System.out.println("存储成功1");
			return "indexxx";
		}else {
			return "add";
		}
	}

	@Override
	public Paste getModel() {
		// TODO Auto-generated method stub
		return paste;
	}

}
