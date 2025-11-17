package ReverseCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Reverse each word in a sentence

/*
 1.Reverse with space - Reverse each word in a sentence while maintaining word order
	Input : "Welcome to geeksforgeeks"
	Output : "emocleW ot skeegrofskeeg"

 2.Reverse the order of the word in sentence
	Input : "I love Java Programming"
	Output :"Programming Java love I"
	
 3.How do you reverse a List using Collections.reverse()
 	Input : "I love Java Programming"
	Output :"Programming Java love I"
*/

public class ReverseEachWordinSentence {

	public static void main(String[] args) {
	

//1.
	String str = "Welcome to geeksforgeeks";
		String[] split = str.split(" ");     // str will be - [Welcome", "to", "geeksforgeeks"]
		
		String reverse = "";
		
		for(String e : split)
		{
			reverse = reverse + new StringBuilder(e).reverse().toString()+" ";
		}
		
//		for(int i=split.length-1; i>=0; i--)
//		{
//			reverse = reverse + split[i] + " ";
//		}

		System.out.println("Reverse sentence: " + reverse.trim());
		
		
	
		
//2.		
	String str1 = "I love Java Programming";
		String [] split1 = str1.split(" ");    //str1 will be - ["I", "love", "Java", "Programming"]
		
		String reverse1 = "";
		
		for(int i=split1.length-1; i>=0; i--)
		{
			reverse1 = reverse1 + split1[i] + " ";
		}
		
		System.out.println("Reverse sentence in word: " + reverse1.trim());
	}
	

	
	
//3.	
/*		
	String str2 = "I love Java Programming";
		String[] array = str2.split(" ");
	
	    // Convert sentence into list of words
	    List<String> list = Arrays.asList(array);
	
	    // Reverse the list
	    Collections.reverse(list);
	
	    // Join words back into a single string
	    String result = String.join(" ", list);
	
	    System.out.println("Reverse sentence in word using Collections: " + result);

	}
*/
	
}
