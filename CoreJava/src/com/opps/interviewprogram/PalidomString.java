package com.opps.interviewprogram;

import java.util.Scanner;

public class PalidomString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String save="";
		String value= sc.next();
		
		int length=value.length();
		
		for (int i =length-1; i >=0; i--)
		{
			save=save+value.charAt(i);
		}
		if(value.equals(save))
		{
			System.out.println("Palidrom");
		}
		else
		{
			System.out.println("Not palidrom");
		}
	}
}
