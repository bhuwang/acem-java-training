package com.bhuwan.java.training.kiran.employeemanagement;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainController {

	EmployeeService employeeService = new EmployeeService();
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		MainController mainController = new MainController();
		Employee employeeLogged = new Employee();
		employeeLogged = null;
		
			try {
				Employee employee = new Employee();
				employee = mainController.employeeService.checkAdminExistance();
				if(employee == null){
					System.out.println("Admin not exist in the system :");
					employee = mainController.formFillUp();
					mainController.employeeService.createDefaultAdmin(employee);
				}else{
					System.out.println("Admin already exists in the system:");
				}
				
			} catch (SQLException e) {
				System.out.println("exception in main method");
				System.err.println("SQLException:" + e.getStackTrace());
			}
				
			try(Scanner scanner = new Scanner(System.in)){
				
				System.out.println("Continue?[Y/N]");
		
				while(scanner.nextLine().equalsIgnoreCase("y")){
				
					System.out.println("Enter username :");
					String username = scanner.nextLine();
					System.out.println("Enter password :");
					String password = scanner.nextLine();
					
					employeeLogged = mainController.employeeService.login(username,password);
					
					if(employeeLogged != null){
					
						System.out.println("Welcome " + employeeLogged.getFullname());
						System.out.println("you are " + employeeLogged.getRole());
						
						if(employeeLogged.getRole().equals("admin")){
							mainController.functionForAdmin(employeeLogged);
							
						}else if(employeeLogged.getRole().equals("user")){
							mainController.functionForUser(employeeLogged);
							
						}else{
							System.out.println("invalid login");
						}
					}else{
						System.out.println("invalid username or password or you are terminated");
					}
					System.out.println("Continue?[Y/N]");
				}
				System.out.println("bye");
			}catch(SQLException e){
				System.out.println("exception in main method");
				System.err.println("SQLException:" + e.getStackTrace());
			}
	}
	
	public void functionForAdmin(Employee employeeLogged){
		
		MainController mainController = new MainController();		
		int option = 0;
		
		try{
		while(option != 5){
			
			System.out.println("\nSelect Option :");
			System.out.println("1. add user\n2. search user\n3. delete user\n4. terminate user\n5. exit");	
			try {
		        option = Integer.parseInt(scanner.nextLine());
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();
		    }
			
			switch(option){
				case 1: 
					System.out.println("fill up the following form :");
					employeeService.addUser(mainController.formFillUp());
					break;
				
				case 2:
					System.out.println("search by\n1. fullname\n2. department\n3. address");
					int option1 = 0;
					try {
				        option1 = Integer.parseInt(scanner.nextLine());
				    } catch (IllegalArgumentException e) {
				        e.printStackTrace();
				    }
					String[] searchBy = mainController.searchOption(option1);
					mainController.displayEmployee(employeeService.searchEmployee(searchBy));
					break;
					
				case 3:
					System.out.println("enter fullname :");
					employeeService.deleteUser(scanner.nextLine());
					break;
				
				case 4:
					System.out.println("enter fullname :");
					employeeService.terminateUser(scanner.nextLine());
					break;
					
				case 5:
					option = 5;
					System.out.println("exiting from the system");
					break;
				}
			}
		}catch(SQLException e){
			System.out.println("exception in functionForAdmin method");
			System.err.println("SQLException:" + e.getStackTrace());
		}
	}
	
	public void functionForUser(Employee employeeLogged){
		
		MainController mainController = new MainController();		
		int option = 0;
		
		while(option != 3){
			
			System.out.println("Select Option :\n");
			System.out.println("1. search user\n2. edit own information\n3. exit");
			
			try {
		        option = Integer.parseInt(scanner.nextLine());
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();
		    }
			
			switch(option){	
				case 1:
					System.out.println("search by\n1. fullname\n2. department\n3. address");
					int option1 = 0;
					
					try {  
						
						option1 = Integer.parseInt(scanner.nextLine());
				        String[] searchBy = mainController.searchOption(option1);
						mainController.displayEmployee(employeeService.searchEmployee(searchBy));
					
					} catch (IllegalArgumentException e) {
				        
						e.printStackTrace();
				    
					} catch (SQLException e) {
						System.err.println("SQLException :" + e.getMessage());
						System.out.println("SQLException in functionForUser method");
						e.printStackTrace();
					}
					break;
					
				case 2:
					System.out.println("select field to edit information:");
					System.out.println("1. username\n2. fullname\n3. department\n4. address");
					System.out.println("5. password\n6. role");
					int option2 = 0;
					try {
				        option2 = Integer.parseInt(scanner.nextLine());
				        String[] editBy = mainController.editOption(option2);
				        employeeService.editInformation(editBy,employeeLogged);
					} catch (IllegalArgumentException e) {
				        System.err.println("IllegalArgumentException :" + e.getMessage());
				        e.printStackTrace();
				    }catch (SQLException e) {
				    	System.err.println("SQLException :" + e.getMessage());
						e.printStackTrace();
					} 
					break;
					
				case 3:
					option = 3;
					System.out.println("exiting from the system bye :");
			}
		}
	}
	
	public Employee formFillUp(){
		
		Employee employee = new Employee();	
		
		System.out.println("user name :");
		employee.setUsername(scanner.nextLine());
		System.out.println("password :");
		employee.setPassword(scanner.nextLine());
		System.out.println("fullname :");
		employee.setFullname(scanner.nextLine());
		System.out.println("department :");
		employee.setDepartment(scanner.nextLine());
		System.out.println("address :");
		employee.setAddress(scanner.nextLine());
		System.out.println("role :");
		employee.setRole(scanner.nextLine());
		
		return employee;
	}
	
	
	public String[] searchOption(int option){
		String[] searchBy = new String[2];  
		
		switch(option){
		
			case 1:
					searchBy[0] =  "fullname";
					System.out.println("enter " + searchBy[0] + " : ");
					searchBy[1] = scanner.nextLine();
					break;
					
			case 2:
					searchBy[0] =  "department";
					System.out.println("enter " + searchBy[0] + " : ");
					searchBy[1] = scanner.nextLine();
					break;
					
			case 3:
					searchBy[0] =  "address";
					System.out.println("enter " + searchBy[0] + " : ");
					searchBy[1] = scanner.nextLine();
					break;
					
			default:
				searchBy[0] = null;
				searchBy[1] = null;
				System.out.println("displaying all employees :");
			}
		return searchBy;
	}
	
	public String[] editOption(int option){
		String[] editBy = new String[2];  	
		editBy[0] = null;
		editBy[1] = null;
		
		while( editBy[0] == null && editBy[1] == null  ){
			
			switch(option){
			
				case 1:
						editBy[0] =  "username";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
			
				case 2:
						editBy[0] =  "fullname";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
						
				case 3:
						editBy[0] =  "department";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
						
				case 4:
						editBy[0] =  "address";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
				
				case 5:
						editBy[0] =  "password";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
						
				case 6:		
						editBy[0] =  "role";
						System.out.println("enter new" + editBy[0] + " : ");
						editBy[1] = scanner.nextLine();
						break;
						
				default:
						editBy[0] = null;
						editBy[1] = null;
						System.out.println("please enter specified field:");
						System.out.println("1. username\n2. fullname\n3. department\n4. address");
						System.out.println("5. password\n6. role");
						try {
					        option = Integer.parseInt(scanner.nextLine());
						}catch(IllegalArgumentException e){
							 System.err.println("IllegalArgumentException :" + e.getMessage());
						}
						break;
				}		
		}
		
		System.out.println(editBy[0] + " : " +editBy[1]);
		return editBy;
	}
	
	
	public void displayEmployee(List<Employee> employeeList){
		
		Iterator<Employee> iterator = employeeList.iterator(); 
		
		if(employeeList.isEmpty()){
		
			System.out.println("No user found with specified parameter :");
		
		}	else{	
			
			System.out.println("username\tpassword\tfullname\tdepartment\trole");
			Employee employee = new Employee();
			while(iterator.hasNext()){
				employee = iterator.next();
				System.out.println(employee.getUsername() + "\t\t" + employee.getPassword() + "\t\t" +
								   employee.getFullname() + "\t\t" + employee.getDepartment() + "\t" +
								   employee.getRole()
						);
			}
		}
	}
}
