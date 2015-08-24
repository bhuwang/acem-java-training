/**
 * 
 */
package com.bhuwan.java.training.laxman.employmanagement;

import java.util.ArrayList;

/**
 * @author laxman
 *
 */
public class EmployeeServiceImp implements EmployService {
	EmployeeDaoImp dao = new EmployeeDaoImp();

	@Override
	public Employee login(String name, String password) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp = dao.login(name, password);
		return emp;
	}

	@Override
	public boolean addEmployee(String name, String password, String fullname, String department, String address,
			String role) throws Exception {
		// TODO Auto-generated method stub

		boolean message = dao.addEmployee(name, password, fullname, department, address, role);
		return message;
	}

	@Override
	public boolean deleteEmployee(String fullname, String role) throws Exception {
		// TODO Auto-generated method stub
		boolean message = dao.deleteEmployee(fullname, role);
		return message;

	}

	@Override
	public ArrayList<Employee> employeeSearch(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp = dao.employeeSearch(searchTerm);
		return emp;
	}

	@Override
	public boolean isTerminated(String fullName, String role) throws Exception {
		// TODO Auto-generated method stub
		boolean message = dao.isTerminated(fullName, role);
		return message;

	}

	@Override
	public boolean doEdit(String searchName,String name, String password, String address,String fullname,  String department) throws Exception {
		// TODO Auto-generated method stub
		boolean message =dao.doEdit(searchName,name, password, address, fullname, department);
		return message;
	}

}
