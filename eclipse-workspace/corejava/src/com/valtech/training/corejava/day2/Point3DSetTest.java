package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point3D;

public class Point3DSetTest {

	@Test
	public void testTreeSet() {
		Set<Point3D> points=new TreeSet<>();
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
		points.add(new Point3D(3,3,3));
		assertEquals(2,points.size());
		//points.add(new Point3D(3,2,4));
		//assertEquals(2,points.size());
		points.add(new Point3D(3,2,3));
		assertEquals(3,points.size());
	}
	@Test
	public void testSetOfPoints()
	{
		Set<Point3D> points = new HashSet<>();
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
	}
	@Test
	public void testSetOfStringsWithGenerics() {//it helps in giving compile time and hence provide security
		Set<String> myWords = new HashSet<>();
		myWords.add("Hello");
		myWords.add("How");
		myWords.add("you");
		myWords.add("are");
		myWords.add("you");
		//myWords.add(123);
		for (Iterator iterator = myWords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

	@Test
	public void testSetOfStrings() {
		Set setOfStrings = new HashSet();
		setOfStrings.add("Hello");
		assertEquals(1, setOfStrings.size());
		setOfStrings.add("Hello");
		assertEquals(1, setOfStrings.size());
		setOfStrings.add("HEllo");
		assertEquals(2, setOfStrings.size());
		//setOfStrings.add(123);
		//System.out.println(setOfStrings);
		for (Iterator iterator = setOfStrings.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			String s=(String)object;//typecasting//
			System.out.println(s);
		}
	}

}
