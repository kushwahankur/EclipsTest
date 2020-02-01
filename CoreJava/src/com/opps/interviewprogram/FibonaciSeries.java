package com.opps.interviewprogram;

import java.util.Scanner;

public class FibonaciSeries 
{
	public static void main(String[] args) 
	{
		int first=0, last=1, next, count=10;
		System.out.print(first+" "+last);
		for(int i=0; i<=10; i++)
		{
			next=first+last;
			System.out.print(" "+next+" ");
			first=last;
			last=next;
		}
	}
}
