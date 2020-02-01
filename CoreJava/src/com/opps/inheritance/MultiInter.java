package com.opps.inheritance;

class A
{
	public void a1()
	{
		System.out.println("A1");
	}
}
class B
{
	public void b1()
	{
		System.out.println("B1");
	}
}

public class MultiInter extends A
{
	public static void main(String[] args) {
		System.out.println("Start");
		
		MultiInter mi = new MultiInter();
		mi.a1();
		
		System.out.println("End");
	}
}
