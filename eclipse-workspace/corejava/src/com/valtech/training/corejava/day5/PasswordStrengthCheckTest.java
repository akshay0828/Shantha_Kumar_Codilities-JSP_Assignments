package com.valtech.training.corejava.day5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordStrengthCheckTest {

	@Test
	public void test() {
		String str="@Upper123456";
		PasswordStrengthChecked p=new PasswordStrengthChecked();
		
		//assertEquals("weak",p.check(str));
		//assertEquals(4,p.lowercase(str));
		//assertEquals(1,p.uppercase(str));
		assertEquals(6,p.numbercase(str));
		//assertEquals(1,p.specialcase(str));
		
	}

}
