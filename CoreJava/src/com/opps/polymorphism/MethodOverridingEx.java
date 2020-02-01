package com.opps.polymorphism;

class A
{
	void run()
	{
		System.out.println("calss A");
	}
}

public class MethodOverridingEx extends A
{ 
	
	void run()
	{
		System.out.println("class MethodEX");
	}
	public static void main(String[] args) 
	{
		MethodOverridingEx ex1 = new MethodOverridingEx();
		A ex = new A();
		ex.run();
		ex1.run();

	}
}
