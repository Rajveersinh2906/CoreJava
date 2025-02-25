package com.basic;

import java.util.Scanner;

public class SwitchCase{
	
		public static void main(String[] args) {
			int a,b,c,d;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.println("Enter B :");
			b=sc.nextInt();
			
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			d=sc.nextInt();
		}

}
