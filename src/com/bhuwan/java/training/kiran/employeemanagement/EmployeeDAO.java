package com.bhuwan.java.training.kiran.employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO implements EmployeeDAOInterface{

	public Employee checkAdminExistance() throws SQLException{
		Connection conn = DBConnection.getMySqlConnection();
		String str = "select * from user where role=? and isTerminated = ?";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, "admin");
		stmt.setString(2, "false");
		ResultSet result = stmt.executeQuery();
		Employee emp = null;
		
		while(result.next()){
			emp = new Employee();
			emp.setId(result.getInt("id"));
			emp.setUsername(result.getString("username"));
			emp.setPassword(result.getString("password"));
			emp.setFullname(result.getString("fullname"));
			emp.setAddress(result.getString("address"));
			emp.setDepartment(result.getString("department"));
			emp.setTerminated(result.getBoolean("isTerminated"));
			emp.setRole(Role.valueOf(result.getString("role")));
		}
		return emp;
	}
	
	
	public Employee login(String username,String password) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "select * from user where username=? and password=? and isTerminated=false";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, username);
		stmt.setString(2, password);
		ResultSet result = stmt.executeQuery();
		Employee emp = null;

		while(result.next()){
			emp = new Employee();
			emp.setId(result.getInt("id"));
			emp.setUsername(result.getString("username"));
			emp.setPassword(result.getString("password"));
			emp.setFullname(result.getString("fullname"));
			emp.setAddress(result.getString("address"));
			emp.setDepartment(result.getString("department"));
			emp.setTerminated(result.getBoolean("isTerminated"));
			emp.setRole(Role.valueOf(result.getString("role")));
		}
		return emp;
	}
	
	public int addUser(Employee employee) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "insert into user(username,password,fullname,department,address,role) values(?,?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, employee.getUsername());
		stmt.setString(2, employee.getPassword());
		stmt.setString(3, employee.getFullname());
		stmt.setString(4, employee.getDepartment());
		stmt.setString(5, employee.getAddress());
		stmt.setString(6, employee.getRole().toString());		
		return stmt.executeUpdate();
	}
	
	public int deleteUser(String fullname) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "delete from user where fullname = ? and role != ?";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1,fullname);
		stmt.setString(2, "admin");
		return stmt.executeUpdate();
	}
	
	public boolean terminateUser(String fullname) throws SQLException{
		Connection conn = DBConnection.getMySqlConnection();
		String str = "update user set isTerminated = ? where fullname = ?";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1,"1");
		stmt.setString(2,fullname);
		return stmt.execute();
	}
	
	public List<Employee> searchEmployee(String[] searchterm) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		PreparedStatement stmt = null;
		String str = "";
		if(searchterm[0] != null){
			str = "select * from user where " + searchterm[0] + " = ?";
			stmt = conn.prepareStatement(str);
			stmt.setString(1,searchterm[1]);
		}else{
			str = "select * from user";
			stmt = conn.prepareStatement(str);
		}
		
		ResultSet result = stmt.executeQuery();
		
		Employee emp = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		
		while(result.next()){
			emp = new Employee();
			emp.setId(result.getInt("id"));
			emp.setUsername(result.getString("username"));
			emp.setPassword(result.getString("password"));
			emp.setFullname(result.getString("fullname"));
			emp.setAddress(result.getString("address"));
			emp.setDepartment(result.getString("department"));
			emp.setTerminated(result.getBoolean("isTerminated"));
			emp.setRole(Role.valueOf(result.getString("role")));
			employeeList.add(emp);
		}
		
		return employeeList;
	}
	
	
	public boolean editInformation(String[] editterm,Employee employee) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "update user set " + editterm[0] + " = ? where username = ? ";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, editterm[1]);
		stmt.setString(2, employee.getUsername());
		return stmt.execute();
	}
}
