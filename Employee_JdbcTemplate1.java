package com.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jms.core.JmsTemplate;

import com.test.Employee_Jdbc;

public class Employee_JdbcTemplate1 {
	//read the db connection from xml file
DataSource datasource;
//handle sql statement
JdbcTemplate jdbctemplate;
public final void setDatasource(DataSource datasource)
{
	this.datasource = datasource;
	jdbctemplate = new JdbcTemplate(datasource);
}
public List<Employee_Jdbc> listemp(){
	String SQL="select * from emp1";
	List<Employee_Jdbc> emps=jdbctemplate.query(SQL,new EmployeeMapper());
	return emps;
}
}
