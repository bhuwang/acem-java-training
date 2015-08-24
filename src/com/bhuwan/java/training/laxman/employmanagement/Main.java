/**
 * Employee Management System
 */
package com.bhuwan.java.training.laxman.employmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends EmployeeServiceImp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name;
		String password;
		String fullname;
		String department;
		String address;
		String role;
		Scanner input = new Scanner(System.in);
		EmployeeServiceImp employService = new EmployeeServiceImp();
		Employee user = null;
		while (true) {
			int loginCheck = 0;
			while (loginCheck == 0) {
				System.out.println("Enter your name");
				name = input.nextLine();
				System.out.println("Enter password");
				password = input.nextLine();
				user = employService.login(name, password);

				if (name.equals("") || password.equals("")) {
					System.out.println("User name and password can't be kept blank");
				} else if (user != null) {
					System.out.println(
							"---------------------Welcome " + user.getName() + " To Employee Management System as "
									+ user.getRole() + " Select options-----------------------\n");
					loginCheck = 1;
				} else {
					System.out.println("Invalid User please try with valid user name and password \n");
				}
			}

			int selectOption = 0;
			while (selectOption == 0) {
				if (user.getRole().equals("admin")) {

					System.out.println("1.	Add Employee	\n");
					System.out.println("2.	Delete Employee	\n");
				}
				System.out.println("3.	Search Employee	\n");
				System.out.println("4.	Edit Info	\n");
				System.out.println("5.	Terminate\n ");
				String choice = input.nextLine();
				switch (choice) {
				case "1":
					if (user.getRole().equals("user")) {
						System.out.println("Please Enter the valid choice");
						break;
					}
					System.out.println("Enter Name");
					name = input.nextLine();
					System.out.println("Enter Password");
					password = input.nextLine();
					System.out.println("Enter Fullname");
					fullname = input.nextLine();
					System.out.println("Enter Department");
					department = input.nextLine();
					System.out.println("Enter Address");
					address = input.nextLine();
					System.out.println("Enter Role");
					role = input.nextLine();
					boolean message = employService.addEmployee(name, password, fullname, department, address, role);
					if (message == true) {
						System.out.println("\n Employee sucessfully inserted \n Please select the option below");
					} else {
						System.out.println("\n Employee cannot be added to the database please try again");
					}
					break;

				case "2":
					if (user.getRole().equals("user")) {
						System.out.println("Please Enter the valid choice");
						break;
					}
					System.out.println("Enter the full name");
					fullname = input.nextLine();
					System.out.println("Enter Role");
					role = input.nextLine();
					if (fullname.equals("") || role.equals("") || fullname.equals(user.getFullname())) {
						System.out.println("Either the fields are empty or you are trying to delete your info");
						break;
					}
					boolean message1 = employService.deleteEmployee(fullname, role);
					if (message1 == true) {
						System.out.println("\n Employee " + fullname + " with role " + role
								+ " sucessfully deleted \n Please select the option below");
					} else {
						System.out.println("\n EEmployee " + fullname + " with role " + role
								+ " cannot be deleted please try again");
					}
					break;

				case "3":
					System.out.println("Enter the search term (fullname or department or address)");
					String searchTerm = input.nextLine();
					ArrayList<Employee> emp = employService.employeeSearch(searchTerm);
					if (emp.isEmpty()) {
						System.out.println(searchTerm + "   not found in the database");
						break;
					}
					for (int i = 0; i < emp.size(); i++) {
						System.out.println("\t \tEmployee NO:" + (i + 1) + "\n");
						System.out.println("\t Id: \t" + emp.get(i).getId());
						System.out.println("\t Name: \t" + emp.get(i).getName());
						System.out.println("\t Address: \t" + emp.get(i).getAddress());
						System.out.println("\t Full Name: \t" + emp.get(i).getFullname());
						System.out.println("\t Department: \t" + emp.get(i).getDepartment());
						System.out.println("\t Role \t" + emp.get(i).getRole() + "\n \n");

					}
					System.out.println("Please select the option below");
					break;

				case "4":
					System.out.println("Are you sure you want to edit your info [y/n]");
					String doEdit = input.nextLine();
					if (doEdit.equals("y")) {
						ArrayList<Employee> emp1 = employService.employeeSearch(user.getFullname());
						for (int i = 0; i < emp1.size(); i++) {
							System.out.println("\t \t Your Info:\n");
							System.out.println("\t Id: \t" + emp1.get(i).getId());
							System.out.println("\t Name: \t" + emp1.get(i).getName());
							System.out.println("\t Address: \t" + emp1.get(i).getAddress());
							System.out.println("\t Full Name: \t" + emp1.get(i).getFullname());
							System.out.println("\t Department: \t" + emp1.get(i).getDepartment());
							System.out.println("\t Role \t" + emp1.get(i).getRole() + "\n \n");

						}
						System.out.println("Enter New Name");
						String newName = input.nextLine();
						System.out.println("Enter New Password");
						String newPassword = input.nextLine();
						System.out.println("Enter New Address");
						String newAddress = input.nextLine();
						System.out.println("Enter New Full Name");
						String newFullname = input.nextLine();
						user.setFullname(newFullname);
						System.out.println("Enter New Department");
						String newDepartment = input.nextLine();
						boolean message4 = employService.doEdit(user.getName(), newName, newPassword, newAddress,
								newFullname, newDepartment);
						if (message4 == true) {
							System.out.println(user.getName()
									+ " Editing Information sucessfully accomplised \n Please select the option below");

						} else {
							System.out.println("\n Something went wrong couldn't Edit the employee information");
						}
					}

					break;

				case "5":
					System.out.println("Are you sure you want to exit [y/n]");
					String terminate = input.nextLine();
					if (terminate.equals("y")) {
						boolean message2 = employService.isTerminated(user.getFullname(), user.getRole());
						if (message2 == true) {
							System.out.println(user.getName()
									+ " Your Session is Sucessfully Terminated \n Login again if you want to use the system");
						} else {
							System.out.println("\n Something went wrong couldn't terminate the session");
						}

					}
					selectOption = 1;
					break;
				default:
					System.out.println("Enter the valid choice");
					break;
				}
			}

		}
	}
}