package com.opps.inheritance;

class Multi1
{
	public void mu1()
	{
		System.out.println("mu1");
	}
}

class Multi2 extends Multi1
{
	public void mu2()
	{
		System.out.println("mu2");
		mu1();
	}
}

public class MultilavelInher extends Multi2
{
	public static void main(String[] args) 
	{
		System.out.println("Multi");
		
		MultilavelInher mi = new MultilavelInher();
		mi.mu2();
		
		
		System.out.println("End");
	}
}
