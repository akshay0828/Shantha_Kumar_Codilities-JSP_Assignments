package com.valtech.training.corejava.day5;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {
	@Test
	public void testVowel() {
		//String [] names={"Abc","Pqr","Lmno","Ab","z","Tur","Ump"};
		String[]names= {"Nuthan","Manijj","Sai","Sanjayguptha"};
		Arrays.sort(names,new StringSorter());
		//assertArrayEquals(new String [] {"z","Ab","Pqr","Abc","Tur","Ump","Lmno"},names);
		assertArrayEquals(new String [] {"Sai","Manijj","Nuthan","Sanjayguptha"},names);
	}
	

//	@Test
//	public void testLength() {
//		String [] names={"Abc","Pqr","Lmno","Ab","z"};
//		Arrays.sort(names,new StringSorter());
//		assertArrayEquals(new String [] {"z","Ab","Abc","Pqr","Lmno"},names);
//	}

}
