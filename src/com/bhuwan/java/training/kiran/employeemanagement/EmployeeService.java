package com.bhuwan.java.training.kiran.employeemanagement;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements EmployeeServiceInterface{
	
	public Employee checkAdminExistance() throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.checkAdminExistance();
	}
	
	public int createDefaultAdmin() throws SQLException{
		Employee defaultEmployee = new Employee();
		defaultEmployee.setUsername("kiran");
		defaultEmployee.setPassword("pariyar");
		defaultEmployee.setFullname("kiran pariyar");
		defaultEmployee.setAddress("koteshwor");
		defaultEmployee.setDepartment("computer");
		defaultEmployee.setRole(Role.admin);
		return addUser(defaultEmployee);
	}
	
	public Employee login(String username,String password) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.login(username, password);
	}
	
	public int addUser(Employee employee) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.addUser(employee);
	} 
	
	public int deleteUser(String fullname) throws SQLException{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.deleteUser(fullname);
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
