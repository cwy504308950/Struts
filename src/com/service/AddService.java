package com.service;

import java.sql.SQLException;

import com.dao.AddDao;
import com.domain.Paste;

public class AddService {

	public boolean addPaste(Paste paste) throws SQLException {
		AddDao addDao = new AddDao();
		int temp	= addDao.addPaste(paste);
		if(temp > 0) {
			return true;
		}else {
			return false;
		}

	}

}
