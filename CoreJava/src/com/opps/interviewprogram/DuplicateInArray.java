package com.opps.interviewprogram;

public class DuplicateInArray 
{
	public static void main(String[] args) 
	{
		int []arr= new int []{1,3,5,2,8,3,5,8,7,9};
		
		System.out.println("Duplicate array");
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]== arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}


/*
 
 
 class RepeatElement  
{ 
    void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        RepeatElement repeat = new RepeatElement(); 
        int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
        int arr_size = arr.length; 
        repeat.printRepeating(arr, arr_size); 
    } 
} 
 
 */
