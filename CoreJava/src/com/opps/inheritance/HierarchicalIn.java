package com.opps.inheritance;

class Hiercl1
{
	public void H1()
	{
		System.out.println("H1");
	}
}
class Hiercl2 extends Hiercl1
{
	public void H2()
	{
		System.out.println("H2");
	}
}
class Hiercl3 extends Hiercl2
{
	public void H3()
	{
		System.out.println("H3");
	}
}

public class HierarchicalIn 
{
	public static void main(String[] args) 
	{
		System.out.println("Hierarchical");
		
		Hiercl3 h3 = new Hiercl3();
		h3.H3();
		h3.H2();
		h3.H1();
		
		System.out.println("end");
	}
}
