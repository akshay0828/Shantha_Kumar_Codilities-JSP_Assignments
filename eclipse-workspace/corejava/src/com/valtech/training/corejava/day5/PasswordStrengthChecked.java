package com.valtech.training.corejava.day5;

import java.util.Scanner;

public class PasswordStrengthChecked {
	int numberCaseCount,upperCaseCount,lowerCaseCount,specialCaseCount;
	public String check(String str) {
//		long countu = str.chars().filter(Character::isUpperCase).count();
//		long countl = str.chars().filter(Character::isLowerCase).count();
//		int count=0;
//		for (int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//		    if (ch >='0' && ch <= '9') {
//		      count++;
//		    }
//		 }
		int alph=0,ALPH=0,digi=0,spl=0,digival=0,splval=0;
		String strchk;
		for(int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				alph++;
			}
			else if(ch >= 'A' && ch <= 'Z' ) {
				ALPH++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}
		if(digi==0) {
			digival=0;
		}
		else if(digi==1) {
			digival=5;
		}
		else{
			digival=5+(digi-1);
		}
		if(spl==0) {
			splval=0;
		}
		else if(spl==1) {
			splval=5;
		}
		else{
			splval=5+((spl-1)*2);
		}
		int count=(alph*5)+(ALPH*5)+digival+splval;
		if(count>25) {
			strchk="Strong";
		}
		else if(count>20 && count<25) {
			strchk="Moderate";
		}
		else {
			strchk="weak";
		}
		return strchk;
		
		
	}
	public int lowercase(String str) {
		for(int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				lowerCaseCount++;
			}
		}
		return lowerCaseCount;
	}
	public int uppercase(String str) {
		for(int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upperCaseCount++;
			}
		}
		return upperCaseCount;
	}
	public int numbercase(String str) {	
		for(int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				numberCaseCount++;
			}
		}
		return numberCaseCount;
	}
//	public int specialcase(String str) {
//		int l=str.length();
//		specialCaseCount=l-numberCaseCount-upperCaseCount-lowerCaseCount;
//		return specialCaseCount;
//		
//		
//	}


}
