package com.dao;

import java.sql.SQLException;

import org.apache.catalina.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.domain.USer;
import com.mchange.v2.c3p0.cfg.C3P0ConfigUtils;
import com.mchange.v2.c3p0.impl.C3P0Defaults;
import com.yl.lain.utils.C3p0DataSourceUtils;

public class UserDao {

	public USer findUser(USer user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
		String sql = "select * from user where username = ? and password = ?";
	return	runner.query(sql, new BeanHandler<USer>(USer.class),user.getUsername(),user.getPassword());
		
	}

}
