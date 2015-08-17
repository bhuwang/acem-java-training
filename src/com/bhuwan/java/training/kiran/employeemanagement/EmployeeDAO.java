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
			emp.setRole(result.getString("role"));
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
			emp.setRole(result.getString("role"));
		}
		return emp;
	}
	
	public void addUser(Employee employee) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "insert into user(username,password,fullname,department,address,role) values(?,?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, employee.getUsername());
		stmt.setString(2, employee.getPassword());
		stmt.setString(3, employee.getFullname());
		stmt.setString(4, employee.getDepartment());
		stmt.setString(5, employee.getAddress());
		stmt.setString(6, employee.getRole());		
		stmt.execute();
		System.out.println("successfully added user");
		
	}
	
	public void deleteUser(String fullname) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "delete from user where fullname = ?";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1,fullname);
		if(stmt.execute()){
			System.out.println("successfully deleted user having username " + fullname);
		}else{
			System.out.println("specified user name doesnot exits :");
		}
	}
	
	public void terminateUser(String fullname) throws SQLException{
		Connection conn = DBConnection.getMySqlConnection();
		String str = "update user set isTerminated = ? where fullname = ?";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1,"1");
		stmt.setString(2,fullname);
		if(stmt.execute()){
			System.out.println("successfully terminated user of username " + fullname);
		}else{
			System.out.println("specified user name doesnot exits :");
		}	
	}
	
	public List<Employee> searchEmployee(String[] searchterm) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		PreparedStatement stmt = null;
		if(searchterm[0] != null){
			String str = "select * from user where " + searchterm[0] + " = ? and role != ?";
			stmt = conn.prepareStatement(str);
			stmt.setString(1,searchterm[1]);
			stmt.setString(2,"admin");
		}else{
			String str = "select * from user";
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
			emp.setRole(result.getString("role"));
			employeeList.add(emp);
		}
		return employeeList;
	}
	
	
	public void editInformation(String[] editterm,Employee employee) throws SQLException{
		
		Connection conn = DBConnection.getMySqlConnection();
		String str = "update user set " + editterm[0] + " = ? where username = ? ";
		PreparedStatement stmt = conn.prepareStatement(str);
		stmt.setString(1, editterm[1]);
		stmt.setString(2, employee.getUsername());
		
		if(!stmt.execute()){
			System.out.println("successfully edited own information");
		}else{
			System.out.println("unsuccessful action :");
		}	
	}
}
