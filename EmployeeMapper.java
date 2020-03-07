package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.Employee_Jdbc;

public class EmployeeMapper implements RowMapper<Employee_Jdbc> {

	@Override
	public Employee_Jdbc mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Employee_Jdbc e1 = new Employee_Jdbc();
		//name same as db col name
		e1.setEmp_no(rs.getInt("emp_no"));
		e1.setEmp_name(rs.getString("emp_name"));
		e1.setSalary(rs.getFloat("salary"));
		return e1;
	}

}
