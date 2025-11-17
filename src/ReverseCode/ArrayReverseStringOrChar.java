package ReverseCode;

import java.util.Arrays;

public class ArrayReverseStringOrChar {

	public static void main(String[] args) {
		
//1.Reverse a char array		
		String[] arr = {"S", "t", "a", "U", "h"};
		
		//set pointer
		int start = 0;
		int end = arr.length-1;
		
		//Swap untill condition fails
		while(start<end)
		{
			String temp = arr[start];   // temp = 0 ("S")
			arr[start] = arr[end];      // arr[start] = 4 ("h")
			arr[end] = temp;            // arr[end] = 0 ("S")\
			
			start++;                    // 0++ = 1
			end--;						// 4-- = 3
		}
		
		//Print it in array string format
		System.out.println("Char Reversed: " + Arrays.toString(arr));

		
//2.Reverse a String array using while loop
		String[] words = {"Java", "is", "fun", "to", "learn"};
		int len = words.length;
		
		//set pointer
		int start1 = 0;
		int end1 = len-1;
		
		//Swap untill condition fails
		while(start1<end1)
		{
			String temp = words[start1];
			words[start1] = words[end1];
			words[end1] = temp;
			
			start1++;
			end1--;
		}
		
		//Print it in array string format
		System.out.println("Char Reversed: " + Arrays.toString(words));
		
		
//3.Reverse a String array using for loop
		String[] str = {"C++", "is", "fun", "to", "study", "and", "learn"};
		int len1 = str.length;
		
		for(int i=0; i < len1/2; i++)        //  " i=0; 0 < 5/2; 0++ ", 
		{
			String temp = str[i];		  	 // temp = C++
			str[i] = str[len1 - 1- i];		 // str[0] = str[5 - 1 - 0 = 4] "study"
			str[len1 - 1 - i] = temp;		 // str[5 - 1 - 0 = 4] = C++
		}
		
		//Print it in array string format
		System.out.println("Char Reversed: " + Arrays.toString(str));
		
		
//4.Reverse a String array using for loop
		 String[] arrr = {"Welcome","to","java"};
	        
		 String[] reverse = new String[arrr.length];
        
		 int res = 0;   //initialze 0 for reverse arr to store arrr[i]
        
		 for(int i=arrr.length-1; i>=0; i--)
		 {
			reverse[res] = arrr[i];
            
            res++;
		 }
        
		 System.out.println("String Array reversed: " + Arrays.toString(reverse));
		
		
	}

}
