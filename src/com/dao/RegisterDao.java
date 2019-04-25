package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.domain.USer;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yl.lain.utils.C3p0DataSourceUtils;

public class RegisterDao {

	public int registerUser(USer user) throws SQLException {
	QueryRunner runner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
	String sql="insert into user(username,password)value(?,?)";
	System.out.println(runner.update(sql,user.getUsername(),user.getPassword()));
 return	runner.update(sql,user.getUsername(),user.getPassword());
	}

}
