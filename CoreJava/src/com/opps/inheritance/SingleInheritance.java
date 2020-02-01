package com.opps.inheritance;

class Single
{
	public void m1()
	{
		System.out.println("single");
	}
}
public class SingleInheritance extends Single
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		SingleInheritance si = new SingleInheritance();
		si.m1();
		System.out.println("end");
		
	}
}
