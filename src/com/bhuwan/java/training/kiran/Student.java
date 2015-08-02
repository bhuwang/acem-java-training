package com.bhuwan.java.training.kiran;

/**
 *<pre>
 * Write a program that calculates percentage and GPA of 5 students.
 * Each of the students has following attributes: name, class, 
 * rollnum, and marks obtained in 5 subjects.
 * </pre>
 * 
 * @author kiran
 *
 */

public class Student {
	
	private String name;
	private String studentClass;
	private int rollnum;
	private float marks;
	private float percentage;
	private float gpa;
	private static final float full_mark = 500;
	
	public Student(String name,String studentClass,int rollnum,float marks){
		this.name = name;
		this.studentClass = studentClass;
		this.rollnum = rollnum;
		this.marks = marks;
		this.percentage =0;
		this.gpa = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public float getPercentage(){
		return this.percentage;
	}
	
	public float getGPA(){
		return this.gpa;
	}
	
	public double calculatePercentage(){
		this.percentage = this.marks/full_mark * 100;
		return this.percentage;
	}
	
	public double calculateGPA(){
		this.gpa = this.percentage/20 - 1;
		return this.gpa;
	}
	
	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		student[0] = new Student("bishal","BCT",520,370);
		student[1] = new Student("kushal","BCE",289,290);
		student[2] = new Student("mina","BCT",25,410);
		student[3] = new Student("karina","BCT",29,390);
		student[4] = new Student("suman","BCT",500,420);

		//displaying result
		System.out.println("Name\t\t\tPercentage(%)\t\tGPA\n");
		for(Student stnt: student){
			stnt.calculatePercentage();
			stnt.calculateGPA();
			System.out.println(stnt.name + "\t\t\t" + stnt.getPercentage() + "\t\t\t" + stnt.getGPA());
		}
	}

}
