package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		String s="Hello World";
		String s1="Hello World";
		assertTrue(s==s1);
		String s2="Hello"+" "+"World";
		assertTrue(s==s2);
		String s3="World";//we can add final then add true in assert in place of false because s==s4//
		String s4="Hello "+s3;
		assertTrue(s.equals(s4));
		assertFalse(s==s4);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

}
}
