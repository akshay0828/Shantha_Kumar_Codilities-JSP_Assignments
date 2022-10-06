package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rot13UtilityTest {

	@Test
	public void test() {
		assertEquals('n',Rot13Utility.rotate('a'));
		assertEquals('a',Rot13Utility.rotate('n'));
		assertEquals('m',Rot13Utility.rotate('z'));
		assertEquals('z',Rot13Utility.rotate('m'));
		assertEquals('N',Rot13Utility.rotate('A'));
		assertEquals('A',Rot13Utility.rotate('N'));
		assertEquals('M',Rot13Utility.rotate('Z'));
		assertEquals('Z',Rot13Utility.rotate('M'));
		assertEquals(' ',Rot13Utility.rotate(' '));
		assertEquals('!',Rot13Utility.rotate('!'));

	}

}
