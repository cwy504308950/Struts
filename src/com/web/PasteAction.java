package com.web;

import java.sql.SQLException;
import java.util.List;

import com.domain.Paste;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.PasteService;

public class PasteAction extends ActionSupport{
		
		public String paste() throws SQLException {
		PasteService pasteService = new PasteService();
		List<Paste>	pasteList = pasteService.findPaste();
		ActionContext.getContext().put("pasteList", pasteList);
		
		return "paste";
			
		}
}
