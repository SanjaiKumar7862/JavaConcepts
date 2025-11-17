package OtherCode;

import java.util.Arrays;

public class LargestWordinString {

	public static void main(String[] args) {
		
		
//1.Largest word in a String
		
		String str = "Hexaware technologies";
		
		//Split by using space
		String[] arr = str.split(" ");
		
		
		//Assign largestword
		String largestword = "";
		
		
		//For each loop to iterate to find largest word
		for(String word : arr)
		{
			if(word.length() > largestword.length())
			{
				largestword = word;
			}
		}

		System.out.println("Largestword: " + largestword);

		
		
//2.Smallest word in a String
		
		String str1 = "Hexaware tech solutions";
		
		String[] arr1 = str1.split(" ");
		
		System.out.println("After split: " + Arrays.toString(arr1));
		
		//Assume first is a smallest word
		String smallestword = arr1[0];
		
		for(String word1 : arr1)
		{
			if(word1.length() < smallestword.length())
			{
				smallestword = word1;
			}
		}
		
		System.out.println("Smallestword: " + smallestword);
	}

}
