package com.service;

import java.sql.SQLException;

import com.dao.UserDao;
import com.domain.USer;

public class UserService {

	public boolean findUser(USer user) throws SQLException {
		UserDao userDao = new UserDao();
		USer temp = userDao.findUser(user);
		if(temp == null) {
			return false;
		}else{
			return true;
		}
		
	}

}
