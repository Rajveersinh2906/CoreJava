package com.basic;

public class OverLoading {
	
	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test (int a,int b)
	{
		System.out.println("test with 2 argument");
	}
	
	public static void main(String[] args) {
		OverLoading m=new OverLoading();
		m.test(10);
		m.test(10,20);
		m.test();
	}

}
