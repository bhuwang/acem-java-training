package com.bhuwan.java.training.kiran.employeemanagement;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements EmployeeServiceInterface{
	
	public Employee checkAdminExistance() throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.checkAdminExistance();
	}
	
	public void createDefaultAdmin(Employee employee) throws SQLException{
		addUser(employee);
	}
	
	public Employee login(String username,String password) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.login(username, password);
	}
	
	public void addUser(Employee employee) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.addUser(employee);
	} 
	
	public void deleteUser(String fullname) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteUser(fullname);
	}
	
	public void terminateUser(String fullname) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.terminateUser(fullname);
	}
	
	public List<Employee> searchEmployee(String[] searchterm) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.searchEmployee(searchterm);
	}
	
	public void editInformation(String[] editterm,Employee employee) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.editInformation(editterm, employee);
	}
	
}
