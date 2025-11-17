package SortingCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Ascending sort		
		int[] a = {-2,3,1,5,6,4,8,6,9};
		
		int temp = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					//Swap arr[i] and arr[j]
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		
//Descending sort
		
		//Just change the if condition as if(a[i] < a[j])
		
		System.out.println();

		
//Sorting using Array method using List with Non-Primitive and Primitive data type
		
		Integer[] arr = {-2,3,1,5,6,4,8,6,9};
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Collections List - sort desc: ");
		for(int res : list)
		{
			System.out.print(res + " ");
		}
		
		
																System.out.println();
		int[] arr1 = {1,5,2,3,6,10,8,4};
		Arrays.sort(arr1);
		
		System.out.println("Collections List - sort asc: ");
		for(int res1 : arr1)
		{
			System.out.print(res1 + " ");
		}
		
	}

}
