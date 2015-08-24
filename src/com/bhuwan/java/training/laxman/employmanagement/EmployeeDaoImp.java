/**
 * 
 */
package com.bhuwan.java.training.laxman.employmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;

/**
 * This method checks checks the user for verification
 * 
 * @author laxman
 *
 */
public class EmployeeDaoImp implements EmployDao {
	public Employee login(String name, String password) throws Exception {
		Employee emp = null;
		String sql = "select * from user where username=? and password=? and isTerminated=true";
		Connection conn = DBConnection.mysqlDbConnect();
		PreparedStatement stmnt = conn.prepareStatement(sql);
		stmnt.setString(1, name);
		stmnt.setString(2, password);
		ResultSet result = stmnt.executeQuery();
		while (result.next()) {
			emp = new Employee();
			emp.setId(result.getInt("id"));
			emp.setName(result.getString("username"));
			emp.setPassword(result.getString("password"));
			emp.setAddress(result.getString("address"));
			emp.setDepartment(result.getString("department"));
			emp.setFullname(result.getString("fullname"));
			emp.setRole(result.getString("role"));
			String updateTerminate = "update user set isTerminated = false where username='" + name + "' and password='"
					+ password + "'";

			Statement stmnt1 = conn.createStatement();
			stmnt1.executeUpdate(updateTerminate);
		}
		return emp;

	}

	@Override
	public boolean addEmployee(String name, String password, String fullname, String department, String address,
			String role) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into user (username,password,isTerminated,fullname,department,address,role) values(?,?,true,?,?,?,?)";

		Connection conn = DBConnection.mysqlDbConnect();
		PreparedStatement stmnt = conn.prepareStatement(sql);
		stmnt.setString(1, name);
		stmnt.setString(2, password);
		stmnt.setString(3, fullname);
		stmnt.setString(4, department);
		stmnt.setString(5, address);
		stmnt.setString(6, role);
		String sqlCheck = "select * from user where username= '" + name + "' and password= '" + password
				+ "' and role= '" + role + "'";

		Statement stmnt1 = conn.createStatement();
		ResultSet rs = stmnt1.executeQuery(sqlCheck);
		if (rs.next()) {
			return false;

		} else {
			if (stmnt.executeUpdate() != 0) {
				return true;
			} else {
				return false;
			}

		}
	}

	@Override
	public boolean deleteEmployee(String fullname, String role) throws Exception {
		// TODO Auto-generated method stub
		//String sqlCheck = "select * from user";
		String sql = "delete from user where fullname=?";
		Connection conn = DBConnection.mysqlDbConnect();
		/*Statement stmnt1 = conn.createStatement();
		ResultSet rs = stmnt1.executeQuery(sqlCheck);
		int i = 0;
		while (rs.next()) {
			i++;
		}
		if (i > 1) {*/
			PreparedStatement stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, fullname);
			if (stmnt.executeUpdate() != 0) {
				return true;
			} else {
				return false;
			}
		/*} else {
			return false;
		}*/
	}

	@Override
	public ArrayList<Employee> employeeSearch(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp = null;
		String sql = "select * from user where fullname=? or department=? or address=?";
		Connection conn = DBConnection.mysqlDbConnect();
		PreparedStatement stmnt = conn.prepareStatement(sql);
		stmnt.setString(1, searchTerm);
		stmnt.setString(2, searchTerm);
		stmnt.setString(3, searchTerm);
		ResultSet result = stmnt.executeQuery();
		while (result.next()) {
			emp = new Employee();
			emp.setId(result.getInt("id"));
			emp.setName(result.getString("username"));
			emp.setAddress(result.getString("address"));
			emp.setDepartment(result.getString("department"));
			emp.setFullname(result.getString("fullname"));
			emp.setRole(result.getString("role"));
			empList.add(emp);

		}

		return empList;

	}

	@Override
	public boolean isTerminated(String fullName, String role) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update user set isTerminated = true where fullname=? and role=?";
		Connection conn = DBConnection.mysqlDbConnect();
		PreparedStatement stmnt = conn.prepareStatement(sql);
		stmnt.setString(1, fullName);
		stmnt.setString(2, role);
		if (stmnt.executeUpdate() != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean doEdit(String searchName,String name,String password, String address, String fullname, String department) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update user set username=?,password=?,address=?,fullname=?,department=? where username=? ";
		Connection conn = DBConnection.mysqlDbConnect();
		PreparedStatement stmnt = conn.prepareStatement(sql);
		stmnt.setString(1, name);
		stmnt.setString(2, password);
		stmnt.setString(3, address);
		stmnt.setString(4, fullname);
		stmnt.setString(5, department);
		stmnt.setString(6, searchName);
		System.out.println(stmnt);
		if (stmnt.executeUpdate() != 0) {
			return true;
		} else {
			return false;
		}
	}

}
