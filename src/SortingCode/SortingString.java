package SortingCode;

import java.util.*;
import java.util.Arrays;

public class SortingString {
	
	public static void main(String[] args)
	{
	
		String str = "SANJAIKUMARS";
		
		//Convert string to char array
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		
		
		//Convert back to String
		String str1 = new String(arr);
		
		System.out.println("After sorting:" + str1);
		
	
	}
}
