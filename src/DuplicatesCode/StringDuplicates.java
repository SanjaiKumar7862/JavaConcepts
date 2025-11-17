package DuplicatesCode;

import java.util.HashSet;

public class StringDuplicates {

	public static void main(String[] args) {
		
//String duplicates		
		String str = "SANJAIKUMAR";
		
		//convert to charArray
		char[] character = str.toCharArray();
		
		int len = character.length;
		
		System.out.print("String Duplicates: ");
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(character[i] == character[j])
				{
					System.out.print(character[i]);
				}
			}
		}
		
		
		System.out.println();
		System.out.println();
		
	
//Array duplicates		
		int[] num = {1,2,3,4,4,5,5,6};
		
		System.out.print("Array Original number: " );
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i]);
		}
		
		System.out.println();
		
		
		System.out.print("Array Duplicates: ");
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i] == num[j])
				{
					System.out.print(num[i]);
				}
			}
		}
		
		System.out.println();
		System.out.println();
		

//Array duplicates using HashSet - find and print
		int[] arr = {1,2,2,6,10,10,11,12,12};
		
		HashSet<Integer> seen = new HashSet<>();   //keeps track of numbers already encountered.
		HashSet<Integer> duplicates = new HashSet<>();   //stores numbers that are repeated/duplicated.
		
		//1st loop to find and print duplicates
		for(int a : arr)
		{
			if(!seen.add(a))
			{
				duplicates.add(a);
			}
		}
		
		System.out.println();
		
		System.out.print("HastSet Array duplicates: ");
		for(int dup : duplicates)
		{
			System.out.print(dup + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
//Array duplicates using HashSet - find and remove
		int[] arr1 = {1,2,3,3,4,5,5,6,7,8,8};		
		
		HashSet<Integer> seen1 = new HashSet<>();   //keeps track of numbers already encountered.
		HashSet<Integer> duplicates1 = new HashSet<>();   //stores numbers that are repeated/duplicated.
		
		
		for(int i=0; i<arr1.length; i++)
		{
			if(seen1.contains(arr1[i]))    //if it is duplicate, add it to duplicate set
			{
				duplicates1.add(arr1[i]);
			}
			else
			{
				seen1.add(arr1[i]);
			}
		}
		
		System.out.println("Seen1: " + seen1);
		System.out.println("Duplicates1: " + duplicates1);
		
		
	}
	
}
