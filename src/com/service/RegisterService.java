package com.service;

import java.sql.SQLException;

import com.dao.RegisterDao;
import com.domain.USer;

public class RegisterService {



	public boolean registerUser(USer user) throws SQLException {
		RegisterDao registerDao = new RegisterDao();
	int temp =	registerDao.registerUser(user);
	if(temp > 0) {
		return true;
	}else {
		return false;
	}

	}

}
