package com.valtech.training.corejava.day6;

import static org.junit.Assert.*;

import org.junit.Test;

	public class PasswordStrengthTest {
		
		PasswordStrength p=new PasswordStrength();

		@Test
		public void testPasswordStrength() {
			String pswd="RKsingh#1131";
			assertEquals("Moderate Password", p.checkPasswordStrength(pswd));

		}
		
		@Test
		public void testPasswordScore() {
			String pswd="Ritesh@125#";
			assertEquals(24,p.computeScore(pswd));
		}
		
		@Test
		public void testInvalidPassword() {
			String pswd="jhehiJJKLL@#$1256";
			assertEquals(27,p.computeScore(pswd));
		}
		
}
