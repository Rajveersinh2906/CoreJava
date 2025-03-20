package com.basic;

public class StaticMethod {
	
	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X :"+x);
		System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
	static
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	public StaticMethod() {
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		meth(12);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		StaticMethod s1=new StaticMethod();
		{
			System.out.println("Block 2");
		}
	}

}
