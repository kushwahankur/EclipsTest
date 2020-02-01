package com.opps.interviewprogram;

import java.util.Scanner;

public class RevarceSring 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String value= sc.next();
		
		int length=value.length();
		
		for (int i =length-1; i >=0; i--)
		{
			
			System.out.print(value.charAt(i));
		}
	}
}
