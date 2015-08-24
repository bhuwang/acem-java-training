/**
 * 
 */
package com.bhuwan.java.training.laxman.employmanagement;

import java.util.ArrayList;

/**
 * @author laxman
 *
 */
public interface EmployService {
	Employee login(String name, String password) throws Exception;

	boolean addEmployee(String name, String password, String fullname, String department, String address, String role)
			throws Exception;

	boolean deleteEmployee(String fullname, String role) throws Exception;
	
	boolean doEdit(String searchName, String name, String password, String fullname, String address,String department) throws Exception;

	ArrayList<Employee> employeeSearch(String searchTerm) throws Exception;

	boolean isTerminated(String fullName, String name) throws Exception;

}
