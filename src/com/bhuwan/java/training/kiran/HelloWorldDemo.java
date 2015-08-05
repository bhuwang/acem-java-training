/**
 * 
 */
package com.bhuwan.java.training.kiran;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
//		getSalutation("Welcome","Kiran Pariyar");
//		System.out.println(args[0]+" "+args[1]);
		/*
		String name = "Kiran Pariyar";
		name.concat("Kathmandu");
		System.out.println(name);
		System.out.println(name.concat("Kathmandu") + " :pass 2");
		
		StringBuffer name2 = new StringBuffer("Kiran Pariyar");
		name2.append("Kathmandu");
		System.out.println(name2);
		
		StringBuilder name3 = new StringBuilder("Hello World");
		name3.append("Hi");
		System.out.println(name3);
		
		*/
		
		List<String> computerList = new ArrayList<>();
		computerList.add("Laxman");
		computerList.add("Bishal");
		
		computerList.add("Laxman");
		computerList.add("Madan");
		computerList.add("Manish");
		
		computerList.add("Madan");
		computerList.add("Manish");
		computerList.remove("Manish");
		
		for(String stname : computerList){
			System.out.println(stname);		
		}
			
		Set<String> completeList = new HashSet<>(computerList);
		
//		System.out.println(completeList.size());

		Iterator<String> iterator = completeList.iterator();
		
		iterator.remove();
		
		/*while(iterator.hasNext()){
			System.out.println();
		}*/
		
	/*	for(String stname : completeList){
			System.out.println(stname);		
		}*/
	
	}
}
