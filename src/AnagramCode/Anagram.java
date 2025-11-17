package AnagramCode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
//Anagram using normal code
		
		boolean result = true;
		
		String str1 = "silent";
		String str2 = "listen";
		
		//Check length and enter the loop if length is equals
		if(str1.length() != str2.length())
		{
			result = false;
		}
		else
		{
			//Covert into char array
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			
			//Sort the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			//Compare both arrays and store in variable
			 result = Arrays.equals(arr1, arr2);
		}
		
		//Check in condition
		 if(result)
		 {
			 System.out.println("Given strings are Anagram");
		 }
		 else
		 {
			 System.out.println("Given strings are Not Anagram");
		 }

	}

}
