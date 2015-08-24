package com.bhuwan.java.training.laxman.employmanagement;

import java.util.ArrayList;

public interface EmployDao {
	Employee login(String name, String password) throws Exception;

	boolean addEmployee(String name, String password, String fullname, String department, String address, String role)
			throws Exception;

	boolean deleteEmployee(String fullname, String role) throws Exception;
	
	boolean doEdit(String searchName,String name,String password, String address,String fullname, String department)throws Exception;

	ArrayList<Employee> employeeSearch(String SearchTerm) throws Exception;

	boolean isTerminated(String fullName, String role) throws Exception;
}
