package com.opps.interviewprogram;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		String primeNumber="";
		
		for(int i=1; i<=20; i++)
		{
			int count=0;
			for(int num=i; num>=1; num--)
			{
				if(i%num ==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				primeNumber=primeNumber+i+" ";
			}
		}
		System.out.println("prime number from till 20");
		System.out.println(primeNumber);
	}
}
