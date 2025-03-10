package com.basic;

class A1
{
	A1()
	{
		System.out.println("A1's Constructor");
	}
	void show() 
	{
		System.out.println("show from A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1's Constructor");
	}
	void show()
	{
		System.out.println("show from B1");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1's Constructor");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
	}
}
