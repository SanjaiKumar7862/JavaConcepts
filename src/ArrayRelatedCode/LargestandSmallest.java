package ArrayRelatedCode;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		
//1.Largest and Smallest in array		
		int[] arr = {33, 44, 1, 9, 7, 100, 66, 3, 8};
		
		int largest = arr[0];   //assume first is largest 
		int smallest = arr[0];  //assume first is smallest
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
			
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
		
		
//2.Find 2nd Largest and Smallest number in array
		int[] arr1 = {33, 44, 1, 9, 7, 100, 66, 3, 8};
		
		Arrays.sort(arr1);
		
		//System.out.println("After sorting: " + arr1);  --> 1,3,7,8,9,33,44,66,100
		
		int secondsmallest = arr1[1];	
		int secondlargest = arr1[arr1.length-2];
		
		System.out.println("Second Smallest :" + secondsmallest);
		System.out.println("Second Largest: " + secondlargest);
		
		
//3.		
		

	}

}
