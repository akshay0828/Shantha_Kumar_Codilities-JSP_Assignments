package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CachedFactorial {
	List<Long> cache=new ArrayList<>();
//	public static Integer factorial(int n){
//		int size=cache.size();
//		if(cache.size()>=(n)){
//			return cache.get(n-1);
//			
//		}
//		
//		else{
//			for(int j=n-1;j>size;j++) {
//				int fact=1;
//				for(int i=n;i>0;i--) {
//					fact=fact*i;
//					
//					
//				}
//				cache.add(j,fact);
//			}
//			
//		
//		}
//		int k=cache.get(n-1);
//		return k;
//	}
	public long factorial(int n) {
		if(cache.size()>=n){
			System.out.println("Returning from cache...");
			return cache.get(n-1);
			
		}
		if(n==1) {
			cache.add(1L);
			return 1;
		}
		long fact=factorial(n-1);
		long factn=n*fact;
		cache.add(factn);
		return factn;
	}
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter the number = ");
//		int  n=sc.nextInt();
//		System.out.println(factorial(n));
//		
//		
//		
//	}
	public void dump() {
		for(Long i:cache) {
			System.out.println(i);
		}
		
	}

}
