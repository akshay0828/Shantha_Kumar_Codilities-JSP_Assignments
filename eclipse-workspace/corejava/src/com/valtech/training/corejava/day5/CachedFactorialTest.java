package com.valtech.training.corejava.day5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CachedFactorialTest {

	@Test
	public void test() {
		CachedFactorial cf=new CachedFactorial();
		assertEquals(120,cf.factorial(5));
		System.out.println(cf.factorial(5));
		System.out.println(cf.factorial(10));
		cf.dump();
	}

}
