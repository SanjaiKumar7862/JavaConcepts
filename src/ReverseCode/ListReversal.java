package ReverseCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListReversal {

	public static void main(String[] args) {
		
//1.Reverse Arraylist using Collection.reverse()		
		String str = "Welcome to Geeks for Geeks !!";
		
		//Split into words
		String[] split = str.split(" ");
		
		//Store in a list
		List<String> list = Arrays.asList(split);
		
		//Reverse the list
		Collections.reverse(list);
		
		//Join back into a string
		String result = String.join(" ", list);
		
		System.out.println("Reversed char list: " + result);


//2.
		int[] num = {1,2,3,4,5,6};
		
		//Convert into ArrayList using for each
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int e : num)
		{
			list1.add(e);
		}
		System.out.println("Original number: " + list1);
		
		
		//Reverse a list1
		Collections.reverse(list1);
		System.out.println("Reversed number list: " + list1);
		
		
		
//3.Reverse Arraylist without using inbuilt method
		
		String str1 = "Welcome to Java Program";
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str1.split(" ")));
		System.out.println("Original string: " + list2);
		
		int len = list2.size(); //5
		
		for(int i=0; i<len/2; i++)
		{
			// swap element at i with element at (len-1-i)
			
			String temp = list2.get(i);    // "Welcome"		
			list2.set(i, list2.get(len - 1 - i));    // get(5 - 0 - 1) = "Program"
			list2.set(len - 1 - i, temp);    // "Welcome" set at 4th place
		}
		
		System.out.println("After reverse without inbuilt method: " + list2);
		
		
//4.Reverse LinkedList without using inbuilt method

        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("Welcome", "to", "C++", "Programming"));

        System.out.println("Original LinkedList: " + list3);

        int len2 = list3.size();

        for (int i = 0; i < len2 / 2; i++) {
            String temp = list3.get(i);
            list3.set(i, list3.get(len - 1 - i));
            list3.set(len - 1 - i, temp);
        }

        System.out.println("Reversed without inbuilt method: " + list3);
		    
		

	}
		
}

