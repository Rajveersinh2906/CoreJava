package com.basic;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("equal");
		}else if(a>b) {
			System.out.println("A Is Greater");
		}
		else {
			System.out.println("A Is Leaser");
		}
				
	}

}
