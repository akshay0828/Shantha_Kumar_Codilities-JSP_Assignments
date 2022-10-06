package com.valtech.training.corejava.day1;

public class Outer
{
	private int x=5;
	private void printY(Inner i)
	{
		System.out.println("Y= "+i.y);
	}
	private void printInner(Inner i)
	{
		i.print();
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		Inner i=new Outer.Inner();
		o.printY(i);
		i.printX(o);
		i.increment(o);
		new Inner().increment(o);
		i.printX(o);
		i.printX(new Outer ());
		System.out.println("Hello");
		
		i.print();
	}
	private static class Inner
	{
		private int y=5;
	private void print()
	{
		System.out.println("World");
	}
	void printX(Outer o) {
		System.out.println("X= "+o.x);
	}
	public void increment(Outer o)
	{
		o.x++;
	}
	}
}


