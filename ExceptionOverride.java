package com.Exception;

import java.util.InputMismatchException;

class Ex1
{
	void show() throws Exception
	{
		System.out.println("show from Ex1");
	}
}
class Ex2 extends Ex1
{
	void show() throws ArithmeticException
	{
		System.out.println("show from Ex2");
	}
}

public class ExceptionOverride {
	
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.show();
	}

}
