package com.opps.polymorphism;

public class MethodOverloading 
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		MethodOverloading a = new MethodOverloading();
		System.out.println(a.add(1,1));
		System.out.println(a.add(1, 1, 1));
	}
}
