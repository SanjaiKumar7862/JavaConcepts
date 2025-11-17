package ReverseCode;

import java.util.Arrays;

public class ArrayReverseInt {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};

//Array printing in console		
		System.out.println("Print directly using Arrays function: " + Arrays.toString(arr));   
		//converts the array into a human-readable string. Arrays is a utility class in java.util
		
		System.out.println("Print using for loop: ");
		for(int i=0; i<arr.length; i++)
		{	
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		System.out.println("Print using enhanced for loop: ");
		for(int e: arr)
		{	
			System.out.print(e);
		}
		
		System.out.println();
		
		System.out.println("Get the 3rd index: " + arr[2]);

		
//1.Reverse array
		System.out.println("Reverse array using for loop: ");
		for(int i=arr.length-1; i>=0; i--)
		{	
			int a = arr[i];
			System.out.print(a);
		}

		
//2.Reverse array using while loop
		int[] whil = {1,2,3,4,5,6,7};
		int len = whil.length;
		
		//Setup start and end pointer
		int start = 0;
		int end = len-1;
		
		//Swapping untill center
		while(start<end)
		{
			int temp = whil[start];
			whil[start] = whil[end];
			whil[end] = temp;
			
			start++;
			end--;
		}
		
		//Array string format
		System.out.println("Reverse array using while loop: " + Arrays.toString(whil));
		
		//for loop just to iterate and print
		for(int i=0; i<whil.length; i++)
		{
			System.out.print(whil[i] + " ");
		}
		
	}

}
