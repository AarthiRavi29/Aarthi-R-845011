package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.EmployeeBean;

//@Configuration
//@ComponentScan(basePackages={com.cts"."com.controller"})
public class EmpJDBCController {
   JdbcTemplate template1;
   public void setTemplate1(JdbcTemplate template1){

	   this.template1 = template1;
   }
   //insert
   public int save1(EmployeeBean p){
	   String sql="insert into employee(eno,name,salary) values("+p.getEno()+",'"+p.getName()+"',"+p.getSalary()+")";
	   //eno is sql column name
	   return template1.update(sql);//commit--executequery
	   }
   public int delete(int eno){
     String sql="delete from employee where eno="+eno+"";
     return template1.update(sql);
 }
   //select
   public List<EmployeeBean> getEmployees(){
	return template1.query("select*from employee",new RowMapper<EmployeeBean>(){
		public EmployeeBean mapRow(ResultSet rs,int row) throws SQLException{
			EmployeeBean e=new EmployeeBean();
			e.setEno(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getFloat(3));
	   return e;
		}
	});
	   
   }
	

}
