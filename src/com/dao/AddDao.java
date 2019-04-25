package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.domain.Paste;
import com.yl.lain.utils.C3p0DataSourceUtils;

public class AddDao {

	public int addPaste(Paste paste) throws SQLException {
		QueryRunner runner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
		String sql="insert into paste(title,content,offer)value(?,?,?)";
		return runner.update(sql,paste.getTitle(),paste.getOffer(),paste.getContent());
	}

}
