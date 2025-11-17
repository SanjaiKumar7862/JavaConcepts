package ArrayRelatedCode;

import java.util.ArrayList;
import java.util.List;

public class Rotation {

	public static void main(String[] args) {
	
//Array rotation move 1 number to left	and place first number at last
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Before rotate to left: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		

		//Store first element
		int first = arr[0];
		
		for(int i=0; i<arr.length-1; i++)
		{
			//Shift all elements to left by 1 position
			arr[i] = arr[i + 1];		// {
		}
		
		//place first element at end
		arr[arr.length-1] = first;
														System.out.println();
		System.out.println("After rotation to left: ");
		for(int res : arr)
		{
			System.out.print(res + " ");
		}
		
														System.out.println();
		
//Array rotation move 1 number to right and place last number at first
		int[] arr1 = {1,2,3,4,5,6};
		
		System.out.println("Before rotate to right: ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		
		//Store last element
		int last = arr1[arr1.length-1];
		
		for(int i=arr1.length-1; i>0; i--)
		{
			arr1[i] = arr1[i-1];
		}
		
		//Place last number at first
		arr1[0] = last;		
														System.out.println();
		System.out.println("After rotation to left: ");
		for(int res1 : arr1)
		{
			System.out.print(res1 + " ");
		}
	
		
														System.out.println();
														
//Array rotation using List
									
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int first1 = list.remove(0);
		list.add(first);
		
		System.out.println("Using Arraylist: " + list);
														
														
	}

}
