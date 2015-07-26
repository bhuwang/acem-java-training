/**
 * 
 */
package com.bhuwan.java.training.kiran;

/**
 *<pre>
 * Write a hello world program which takes two argument 
 * a. Salutation 
 * b. Full Name and 
 * c. Display Salutation<space>Full Name in console.
 * </pre>
 * 
 * @author kiran
 *
 */
public class HelloWorldDemo {

	
	public static void getSalutation(String salutation,String name){
		System.out.println(salutation + " " + name);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSalutation("Welcome","Kiran Pariyar");
		System.out.println(args[0]+" "+args[1]);
	}

}
