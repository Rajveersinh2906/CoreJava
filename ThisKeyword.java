package com.basic;

class Student1
{
	int rno;
	String sname;
	public Student1() {
		System.out.println("Default Constructor");
	}
	public Student1(int rno,String sname) {
		this();
		System.out.println("parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
}

public class ThisKeyword {
	
	public static void main(String[] args) {
	}

}
