package com.opps.polymorphism;

public class AmbiguityErrr 
{
	void sum(int a, long b)
	{
		System.out.println("A is invoked");
	}
	
	void sum(long a, int b)
	{
		System.out.println("b is invoked");
	}
	public static void main(String[] args) 
	{
		AmbiguityErrr ae = new AmbiguityErrr();
		ae.sum(10, 10);
	}
}
