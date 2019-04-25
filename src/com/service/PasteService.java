package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PasteDao;
import com.domain.Paste;

public class PasteService {

	public List<Paste> findPaste() throws SQLException {
	PasteDao pasteDao = new PasteDao();
	return   pasteDao.findPaste();
		
		
	}

}
