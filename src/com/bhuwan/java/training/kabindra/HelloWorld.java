package com.bhuwan.java.training.kabindra;
import java.util.Scanner;
/**
 * <pre>
 * Write a hello world program which takes two argument 
a. Salutation 
b. Full Name and 
c. Display SalutationFull Name in console.
*</pre>
 * @author kabi
 *
 */
public class HelloWorld {
	/**
	 * 
	 */
	public static void main(String[] args){
		String s,n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Salutation.");
		s=input.next();
		System.out.print("Enter name");
		n= input.next();
		System.out.println(s+""+n);
		input.close();
		
		
	}

}
