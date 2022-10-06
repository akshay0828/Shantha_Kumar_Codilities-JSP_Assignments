package com.valtech.training.corejava.day6;

import java.util.Comparator;
import java.util.TreeSet;

public class PasswordStrength {
	
	public int computeScore(String password) {
		int scoreLower=0;
		int scoreUpper=0;
		int scoreNum=0;
		int scoreSpl=0;
		
		int totalScore=0;
			
		PasswordStrength pck = new PasswordStrength();
		if(password.length()<8) {
			totalScore=password.length();
		}
		else if(password.length()>=8) {
			scoreLower=pck.checkLowerCase(password);
			scoreUpper=pck.checkUpperCase(password);
			scoreNum=pck.checkNumber(password);
			scoreSpl=pck.checkSpecialChar(password);
			totalScore=scoreLower+scoreUpper+scoreNum+scoreSpl;
		}
		
		return totalScore;
	}
	
	public String checkPasswordStrength(String password) {
		
		int score = computeScore(password);
		
		String msg ="";
		
		if(score>25) {
			msg="Strong Password";
		}
		else if(score<=25 && score>20) {
			msg="Moderate Password";
		}
		else if(score<=20 && score>=8) {
			msg="Weak Password";
		}
		else if(password.length()<8){
			msg="Password must greater than 8 characters";
		}
		
		return msg;

	}

	public int checkLowerCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (c >= 'a' && c <= 'z') {
				return 5;
			}
		}
		return 0;
	}

	public int checkUpperCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (c >= 'A' && c <= 'Z')
				return 5;
		}

		return 0;
	}

	public int checkNumber(String password) {
		String str = "0123456789";
		int score = 0;
		int count=0;
		for (int i = 0; i < password.length(); i++) {
			if (str.contains("" +password.charAt(i))){
				if(count==0) {
					score=5;
					count++;
				}
				else {
					score=score+1;
					count++;
				}
				
			}
		}
		return score;
	}

	public int checkSpecialChar(String password) {

		String str = "@#!$%^&*()+-/<>.,?:";
		int score = 0;
		int count=0;
		for (int i = 0; i < password.length(); i++) {
			if (str.contains("" +password.charAt(i))){
					if(count==0) {
						score=5;
						count++;
					}
					else {
						score=score+2;
						count++;
					}
					
				
			}
		}
		return score;
	}


}
