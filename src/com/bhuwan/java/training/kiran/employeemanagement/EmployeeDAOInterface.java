package com.bhuwan.java.training.kiran.employeemanagement;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAOInterface{

	public Employee checkAdminExistance() throws SQLException;
	
	public Employee login(String username,String password) throws SQLException;
	
	public int addUser(Employee employee) throws SQLException;
	
	public int deleteUser(String fullname) throws SQLException;
	
	public boolean terminateUser(String fullname) throws SQLException;
	
	public List<Employee> searchEmployee(String[] searchterm) throws SQLException;
	
	public boolean editInformation(String[] editterm,Employee employee) throws SQLException;
	
}
