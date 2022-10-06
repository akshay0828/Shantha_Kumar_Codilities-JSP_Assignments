package com.valtech.training.corejava.day5;

import java.util.Scanner;

public class Fact {
	static long result=0;
	public static long factorial(long n) {
		if(n==1 || n==0) {
			result =1;
			return result;
		}
		else {
			result=n* factorial(n-1);
			return result;
			
		}
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number = ");
		long n=sc.nextLong();
		System.out.println(factorial(n));
	}

}
