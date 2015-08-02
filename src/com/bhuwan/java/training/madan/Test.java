package com.bhuwan.java.training.madan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String name3;

		String name = "Madan Dhungana";
		name.concat(" Shankhamool");
		name3 = name.substring(0, name.indexOf(" "));
		System.out.println(name3);

		StringBuffer name2 = new StringBuffer("Madan Dhungana");
		name2.append(" Shankhamool");
		System.out.println(name2);

		List<String> androidList = new ArrayList<String>();
		List<String> javaList = new ArrayList<String>();
		List<String> phpList = new ArrayList<String>();
		List<String> compList =  new ArrayList<String>();

		androidList.add("bibek");
		androidList.add("madan");

		javaList.add("madan");
		javaList.add("Kiran");
		javaList.add("laxman");

		phpList.add("bishal");
		phpList.add("naran");
		
		compList.addAll(androidList);
		compList.addAll(javaList);
		compList.addAll(phpList);
		
		Set<String> compListFinal=new HashSet<>(compList);
		System.out.println(compListFinal.size());
		/*for(String name4:compListFinal)
		{
			System.out.println(name4);
		}*/
		Iterator<String> iter=compListFinal.iterator();
		
		while(iter.hasNext()){
			
			String element=iter.next();
			/*if(iter.equals("bishal")){
				iter.remove();
			}*/
			System.out.println(element);
		}
			
		

	}

}
